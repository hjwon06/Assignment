package com.example.threeweekassignment

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.threeweekassignment.databinding.ActivityMainBinding
import com.example.threeweekassignment.databinding.FrendslistItemBinding


class ItemAdapter(private val items: List<ItemList>) :
    RecyclerView.Adapter<ItemAdapter.ReViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReViewHolder {
        return ReViewHolder(
            FrendslistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: ReViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size

    class ReViewHolder(private var binding: FrendslistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ItemList) {
            binding.upProName.text = item.name
        }
    }


}