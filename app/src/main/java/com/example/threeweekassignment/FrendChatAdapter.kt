package com.example.threeweekassignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.threeweekassignment.databinding.FrelistBinding
import com.example.threeweekassignment.databinding.FrelistItemBinding

class FrendChatAdapter(private val fredns: List<FrendsList>) :
    RecyclerView.Adapter<FrendChatAdapter.ReViewHolder>()  {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FrendChatAdapter.ReViewHolder {
        return ReViewHolder(
            FrelistItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false,
            )
        )
    }

    override fun onBindViewHolder(holder: ReViewHolder, position: Int) {
        holder.bind(fredns[position])

    }

    override fun getItemCount(): Int = fredns.size

    class ReViewHolder(private var binding: FrelistItemBinding) :
        RecyclerView.ViewHolder(binding.root) {


        fun bind(fredns: FrendsList) {
            binding.freProName.text = fredns.name
            binding.freStateName.text = fredns.stateName

        }


    }
}