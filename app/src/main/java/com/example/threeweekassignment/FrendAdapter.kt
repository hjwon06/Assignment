package com.example.threeweekassignment

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.threeweekassignment.databinding.FrednsItemBinding

class FrendAdapter(private val fredns: List<FrendsList>) :
    RecyclerView.Adapter<FrendAdapter.ReViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrendAdapter.ReViewHolder {
        return ReViewHolder(
            FrednsItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: ReViewHolder, position: Int) {
        holder.bind(fredns[position])
        holder.itemView.setOnClickListener{
            var intent = Intent(holder.itemView?.context,Chat::class.java)
            intent.putExtra("name",fredns[position].name)
            intent.putExtra("stateName",fredns[position].stateName)
            ContextCompat.startActivity(holder.itemView.context, intent, null)
        }

    }

    override fun getItemCount(): Int = fredns.size

    class ReViewHolder(private var binding: FrednsItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(fredns: FrendsList) {
            binding.freProName.text = fredns.name
            binding.freStateName.text = fredns.stateName


        }


    }




}