package com.example.study0508

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf<Food>(
        Food("","라라라라라라"),
        Food("","라라라라라라")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mAdapter = FoodRvAdapter(this, foodList)
        recyclerView.adapter = mAdapter

        val lm = LinearLayoutManager(this)
        recyclerView.layoutManager = lm
        recyclerView.setHasFixedSize(true)      //바뀔 수 있는 크기를 고정해줌.

    }
}
