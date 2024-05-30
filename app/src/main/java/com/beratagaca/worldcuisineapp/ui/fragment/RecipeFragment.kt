package com.beratagaca.worldcuisineapp.ui.fragment

import android.graphics.Color
import android.graphics.Paint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.core.view.children
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.databinding.FragmentCuisineBinding
import com.beratagaca.worldcuisineapp.databinding.FragmentRecipeBinding
import com.beratagaca.worldcuisineapp.ui.adapter.CountriesAdapter
import com.beratagaca.worldcuisineapp.ui.adapter.FoodRecipeAdapter
import com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel
import dagger.hilt.android.AndroidEntryPoint
import com.bumptech.glide.Glide


@AndroidEntryPoint
class RecipeFragment : Fragment() {

    private lateinit var binding: FragmentRecipeBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_recipe, container, false)
        val bundle : RecipeFragmentArgs by navArgs()
        val food = bundle.foodObject
        var lines : List<String> = food.long_recipe!!.split("\n")
        val recipeAdapter = FoodRecipeAdapter(requireContext(), food, lines )
        binding.imageViewRecipe.setImageResource(requireContext().resources.getIdentifier(food.img_path, "drawable", requireContext().packageName))
        binding.recipeRv.adapter = recipeAdapter
        binding.food = food

        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }


}
//GLIDE
//val url = "https://www.panningtheglobe.com/wp-content/uploads/2013/11/turkish-manti-web-best.jpg"
//Glide.with(requireContext()).load(url).override(400,300).into(binding.imageView)

