package com.example.study0508

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import java.text.FieldPosition

class FoodRvAdapter(val context: Context, val foodList : ArrayList<Food>) :
        RecyclerView.Adapter<FoodRvAdapter.Holder>(){
    inner class Holder(itemView:View) : RecyclerView.ViewHolder(itemView) {

        val foodImage = itemView.findViewById<ImageView>(R.id.iv_food)
        val foodName = itemView.findViewById<TextView>(R.id.tv_name)

        fun bind(food : Food,context: Context) {
            if (food.image !="") {
                val resourceId : Int = context.resources
                    .getIdentifier(food.image, "drawable",context.packageName)

                foodImage.setImageResource(resourceId)
            } else
                foodImage.setImageResource(R.mipmap.ic_launcher)

            foodName.text = food.name
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): Holder {
        val view = LayoutInflater.from(context).inflate(        // LayoutInflater은 레이아웃을 쓰게해주는 아이
            R.layout.item_food,parent,false
        )
        return  Holder(view)
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bind(foodList[position], context)
    }


}