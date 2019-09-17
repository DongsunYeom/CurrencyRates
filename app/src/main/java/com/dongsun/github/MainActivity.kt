package com.dongsun.github

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.text.Editable
import android.text.TextUtils
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dongsun.github.db.TableCountry
import com.dongsun.github.ui.DataBindingAdapter
import com.dongsun.github.ui.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    companion object {
        private const val DEFAULT_QUERY = "USD"
    }

    private lateinit var viewModel: MainViewModel
    private val adapter = DataBindingAdapter(this)

    private lateinit var query:String
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // get the view model
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        // add dividers between RecyclerView's row items
        val decoration = DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        list.addItemDecoration(decoration)

        initAdapter()
        query = "latest"
        viewModel.searchRepo(query)

        initClickEvent()

        handler = Handler()
    }

    private fun initAdapter() {
        list.adapter = adapter
        viewModel.repos.observe(this, Observer<MutableList<TableCountry>> {
            showEmptyList(it?.size == 0)

            for (i in it!!.indices) {
                var country = it[i]
                if (country.name.equals(query, ignoreCase = true)) {
                    it.removeAt(i)
                    break;
                }
            }

            adapter.updateItems(it)

            if (TextUtils.isEmpty(main_name.text)) {
                main_name.text = DEFAULT_QUERY
                main_rate.setText("1.0")
            }
            updateRepoListFromInput()
            setHandler()
        })
        viewModel.networkErrors.observe(this, Observer<String> {
            Toast.makeText(this, "\uD83D\uDE28 Wooops ${it}", Toast.LENGTH_LONG).show()
        })
    }

    private fun initClickEvent() {
        adapter.setOnItemClickListener(object : DataBindingAdapter.OnItemClickListener{
            override fun onItemClick(country: TableCountry, position: Int) {
                query = country.name
                viewModel.searchRepo(query)
                main_name.text = country.name
            }
        });
    }

    private fun updateRepoListFromInput() {
        val watcher = object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (!TextUtils.isEmpty(s.toString()))
                    adapter.updateRates(s.toString())
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        }

        main_rate.addTextChangedListener(watcher)
    }

    private fun setHandler() {
        val r = object : Runnable {
            override fun run() {
                viewModel.searchRepo(query)
            }
        }
        handler.removeCallbacks(r);
        handler.postDelayed(r, 60000)
    }

    private fun showEmptyList(show: Boolean) {
        if (show) {
            top_layout.visibility = View.GONE
            emptyList.visibility = View.VISIBLE
            list.visibility = View.GONE
        } else {
            top_layout.visibility = View.VISIBLE
            emptyList.visibility = View.GONE
            list.visibility = View.VISIBLE
        }
    }

    private fun setupScrollListener() {
        val layoutManager = list.layoutManager as LinearLayoutManager
        list.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val totalItemCount = layoutManager.itemCount
                val visibleItemCount = layoutManager.childCount
                val lastVisibleItem = layoutManager.findLastVisibleItemPosition()

                viewModel.listScrolled(visibleItemCount, lastVisibleItem, totalItemCount)
            }
        })
    }
}
