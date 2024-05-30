package com.beratagaca.worldcuisineapp.ui.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.databinding.CardCountryDesignBinding
import com.beratagaca.worldcuisineapp.ui.fragment.HomeFragmentDirections
import com.beratagaca.worldcuisineapp.ui.viewmodel.HomeViewModel
import com.google.android.material.snackbar.Snackbar

class CountriesAdapter(var mContext: Context, var countriesList: List<Countries>, var viewModel : HomeViewModel)
    : RecyclerView.Adapter<CountriesAdapter.CardDesignHolder>(){

    inner class CardDesignHolder(var design: CardCountryDesignBinding): RecyclerView.ViewHolder(design.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesignHolder {

        val binding : CardCountryDesignBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),
            R.layout.card_country_design, parent, false)
        return CardDesignHolder(binding)
    }

    override fun onBindViewHolder(holder: CardDesignHolder, position: Int) {
        val country = countriesList.get(position)
        val d = holder.design

        d.cardViewCountry.setOnClickListener {
            val transition = HomeFragmentDirections.homeToCuisine(country = country)
            Navigation.findNavController(it).navigate(transition)
        }

        d.imageViewCountry.setImageResource(
            mContext.resources.getIdentifier(country.flag_path, "drawable", mContext.packageName))

        d.countryObj = country
    }

    override fun getItemCount(): Int {
        return countriesList.size
    }



}