package com.application.zomato.starter.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.application.zomato.starter.R
import com.application.zomato.starter.adapter.MyListAdapter
import com.application.zomato.starter.data.Restaurant
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {
    private val adapter = MyListAdapter()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter
        /**
         * Change the initialisation to your type of list
         */

        var list = ArrayList<Restaurant>()
        list.add(Restaurant())
        list.add(Restaurant("Pizza Hut","Sector 12","Pizzas"))
        list.add(Restaurant("Mc Donalds","Sector 20","Burger"))
        list.add(Restaurant("Wow","Sector 40","Momos"))
        list.add(Restaurant("Burger King","Sector 80","Burger"))
//        list.add(Restaurant())

        adapter.items = list
        /**
         * Very important operation to perform when data is changed
         */
        adapter.notifyDataSetChanged()
    }
}