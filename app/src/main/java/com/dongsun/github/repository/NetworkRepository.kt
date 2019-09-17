package com.test.googlefit.service

import android.content.Context
import android.util.Log
import android.widget.Toast
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.dongsun.github.db.TableCountry
import com.dongsun.github.model.DataList
import com.dongsun.github.ui.MainDataListener
import org.json.JSONException
import org.json.JSONObject


class NetworkRepository {

    val BASE_URL = "https://api.exchangeratesapi.io/"
    private var mRequestQueue : RequestQueue? = null
    private var mStringRequest: StringRequest? = null

    fun sendAndRequestResponse(context: Context, base:String, dataView: MainDataListener) {
        var requestURL = BASE_URL + base;
        //RequestQueue initialized
        mRequestQueue = Volley.newRequestQueue(context)

        //String Request initialized
        mStringRequest = StringRequest(Request.Method.GET, requestURL, object : Response.Listener<String> {
            override fun onResponse(response: String) {
                var dataItem = DataList()
                try {
                    val jsonObject = JSONObject(response)
                    dataItem.base = jsonObject.getString("base")
                    dataItem.date = jsonObject.getString("date")
                    dataItem.rates = ArrayList<TableCountry>()

                    var jsonRates = jsonObject.getJSONObject("rates")
                    val keys = jsonRates.keys()

                    while (keys.hasNext()) {
                        val keyValue = keys.next() as String
                        val valueString : Double? = jsonRates.getDouble(keyValue)

                        val country = TableCountry(keyValue, valueString!!, null)
                        dataItem.rates.add(country)
                    }
                } catch (err: JSONException) {
                    Log.d("Error", err.toString())
                }

                dataView.updateList(dataItem)
            }
        }, object : Response.ErrorListener {
            override fun onErrorResponse(error: VolleyError) {
                Toast.makeText(context, "error :$error", Toast.LENGTH_LONG).show()
            }
        })

        mRequestQueue?.add(mStringRequest)
    }

}