package com.innobot.learnkotlinwithoutjava.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.innobot.learnkotlinwithoutjava.R
import com.innobot.learnkotlinwithoutjava.ViewHolder

/**
 * Created by innobot-linux-7 on 3/9/19,03,Experiment.
 */
class BasicSyntaxAdapter(val context: Context, var basicList: ArrayList<String>) : RecyclerView.Adapter<ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.animal_list_item, parent, false))
    }

    override fun getItemCount(): Int {
        return basicList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvAnimalType?.text = basicList.get(position)
//        holder?.tvAnimalType?.setOnClickListener {
//            if (position==1)
//            {
//
//            }
//        }
    }

}