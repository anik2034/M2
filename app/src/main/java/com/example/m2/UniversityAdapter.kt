package com.example.m2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.m2.databinding.CardItemBinding

class UniversityAdapter(val list :List<University?>?): RecyclerView.Adapter<UniversityAdapter.UniversityViewHolder>() {
    inner class UniversityViewHolder(val itemBinding: CardItemBinding):
        RecyclerView.ViewHolder(itemBinding.root){
        fun bindItem(user : University){
            itemBinding.country.text = user.country
            itemBinding.name.text = user.name
            itemBinding.code.text = user.code

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UniversityViewHolder {
        return UniversityViewHolder(CardItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }

    override fun onBindViewHolder(holder: UniversityViewHolder, position: Int) {
        val user = list?.get(position)
        if (user != null) {
            holder.bindItem(user)
        }
    }


}




