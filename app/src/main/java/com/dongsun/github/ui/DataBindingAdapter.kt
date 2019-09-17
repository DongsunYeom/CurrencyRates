package com.dongsun.github.ui

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.dongsun.github.R
import com.dongsun.github.databinding.ViewItemBinding
import com.dongsun.github.db.TableCountry
import java.math.RoundingMode
import java.text.DecimalFormat
import java.util.*


class DataBindingAdapter(private val context: Context) : RecyclerView.Adapter<DataBindingAdapter.UserViewHolder>() {

    protected var arrayList: MutableList<TableCountry>? = null
    internal var onItemClickListener: OnItemClickListener? = null
    private var layoutInflater: LayoutInflater? = null
    private var currentRate: Float? = 1.0f

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item, parent, false)
//        return UserViewHolder(view)

        if (layoutInflater == null) {
            layoutInflater = LayoutInflater.from(parent.context)
        }

        val binding:ViewItemBinding = DataBindingUtil.inflate(
            layoutInflater!!,
            R.layout.view_item, parent, false
        )

        return UserViewHolder(binding)

    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
        var country = arrayList!!.get(position);
        holder.repoViewItemBinding.tableCountry = country
        holder.repoViewItemBinding.rate.text = roundOffDecimal(country.rate*currentRate!!);
        holder.repoViewItemBinding.itemlayout.setOnClickListener {
            if (onItemClickListener != null) {
                onItemClickListener!!.onItemClick(country, position)
                swapeItem(position, 0)
            }
        }
    }

    fun roundOffDecimal(number: Double): String? {
        val df = DecimalFormat("#.##")
        df.roundingMode = RoundingMode.FLOOR
        return df.format(number).toString()
    }

    override fun getItemCount(): Int {
        return if (arrayList == null) 0 else arrayList!!.size
    }

    fun getItem(position: Int): TableCountry? {
        return if (arrayList == null) null else arrayList!![position]
    }

    fun updateItems(items: List<TableCountry>) {

        if (this.arrayList == null) {
            arrayList = ArrayList()
        }
        this.arrayList!!.clear()
        this.arrayList!!.addAll(items)

        notifyDataSetChanged()
    }

    fun updateRates(value: String) {
        if (!value.toFloat().equals(currentRate)) {
            currentRate = value.toFloat()

            notifyDataSetChanged()
        }
    }

    fun swapeItem(fromPosition: Int, toPosition: Int) {
        Collections.swap(arrayList, fromPosition, toPosition)
        notifyItemMoved(fromPosition, toPosition)
    }

    fun setOnItemClickListener(onItemClickListener: OnItemClickListener) {
        this.onItemClickListener = onItemClickListener
    }

    interface OnItemClickListener {
        fun onItemClick(country: TableCountry, position: Int)
    }

    inner class UserViewHolder(var repoViewItemBinding: ViewItemBinding) :
        RecyclerView.ViewHolder(repoViewItemBinding.getRoot())
}