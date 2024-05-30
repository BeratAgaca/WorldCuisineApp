package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.beratagaca.worldcuisineapp.R
import androidx.fragment.app.viewModels
import androidx.lifecycle.map
import com.beratagaca.worldcuisineapp.data.entity.Countries
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.beratagaca.worldcuisineapp.databinding.CardCountryDesignBinding
import com.beratagaca.worldcuisineapp.databinding.FragmentHomeBinding
import com.beratagaca.worldcuisineapp.ui.adapter.CountriesAdapter
import com.beratagaca.worldcuisineapp.ui.adapter.CuisineAdapter
import com.beratagaca.worldcuisineapp.ui.viewmodel.HomeViewModel
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : Fragment() {
    private lateinit var viewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home ,container, false)

        binding.homeToolbarTitle = "WORLD CUISINE APP"
        viewModel.countriesList.observe(viewLifecycleOwner){
            val countriesAdapter = CountriesAdapter(requireContext(), it, viewModel)
            binding.countryRv.adapter = countriesAdapter
        }
        return binding.root
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : HomeViewModel by viewModels()
        viewModel = tempViewModel
    }
}