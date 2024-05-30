package com.beratagaca.worldcuisineapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.beratagaca.worldcuisineapp.databinding.CardCuisineDesignBinding
import com.beratagaca.worldcuisineapp.ui.fragment.CuisineFragmentDirections
import com.beratagaca.worldcuisineapp.ui.fragment.HomeFragmentDirections
import com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel
import com.beratagaca.worldcuisineapp.ui.viewmodel.HomeViewModel

class CuisineAdapter(var mContext: Context, var foodList: List<Foods>, var viewModel : CuisineViewModel)
    : RecyclerView.Adapter<CuisineAdapter.CardDesignHolder>(){

    inner class CardDesignHolder(var design: CardCuisineDesignBinding): RecyclerView.ViewHolder(design.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding : CardCuisineDesignBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.card_cuisine_design, parent, false)
        return CardDesignHolder(binding)
    }


    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val food = foodList.get(position)
        val d = holder.design
        d.imageViewFood.setImageResource(
            mContext.resources.getIdentifier(food.img_path, "drawable", mContext.packageName))
        d.foodObject = food

        d.button.setOnClickListener {
            val transition = CuisineFragmentDirections.actionCuisineFragmentToRecipeFragment(food)
            Navigation.findNavController(it).navigate(transition)
        }



        /*
        d.floatingActionButton.setOnClickListener {
            //viewModel.deleteFoodByName("Mantı")
            viewModel.saveFood(newFood4)
        }
         */

    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}