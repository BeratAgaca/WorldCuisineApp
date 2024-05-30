package com.beratagaca.worldcuisineapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.beratagaca.worldcuisineapp.databinding.CardRecipeDesignBinding
import com.beratagaca.worldcuisineapp.ui.fragment.CuisineFragmentDirections
import com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel

class FoodRecipeAdapter(var mContext: Context, var food: Foods, var recipe: List<String>)
    : RecyclerView.Adapter<FoodRecipeAdapter.CardDesignHolder>(){

    inner class CardDesignHolder(var design: CardRecipeDesignBinding): RecyclerView.ViewHolder(design.root)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {
        val binding : CardRecipeDesignBinding = DataBindingUtil.inflate(
            LayoutInflater.from(mContext),
            R.layout.card_recipe_design, parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {

        val d = holder.design
        val line = recipe.get(position)

       /* d.imageViewRecipe.setImageResource(
            mContext.resources.getIdentifier(food.imgPath, "drawable", mContext.packageName))*/
        d.foodObject = food
        d.textViewRecipe.setText(line)
    }

    override fun getItemCount(): Int {
        return recipe.size
    }


}