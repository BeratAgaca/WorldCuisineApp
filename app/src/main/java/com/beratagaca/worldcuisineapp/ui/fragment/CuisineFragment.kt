package com.beratagaca.worldcuisineapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.beratagaca.worldcuisineapp.R
import com.beratagaca.worldcuisineapp.data.entity.Foods
import com.beratagaca.worldcuisineapp.databinding.FragmentCuisineBinding
import com.beratagaca.worldcuisineapp.databinding.FragmentHomeBinding
import com.beratagaca.worldcuisineapp.ui.adapter.CountriesAdapter
import com.beratagaca.worldcuisineapp.ui.adapter.CuisineAdapter
import com.beratagaca.worldcuisineapp.ui.viewmodel.CuisineViewModel
import com.beratagaca.worldcuisineapp.ui.viewmodel.HomeViewModel
import com.google.firebase.Firebase
import com.google.firebase.firestore.firestore
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class CuisineFragment : Fragment() {

    private lateinit var viewModel: CuisineViewModel
    private lateinit var binding: FragmentCuisineBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_cuisine ,container, false)
        val bundle : CuisineFragmentArgs by navArgs()
        val country = bundle.country
        viewModel.getFoodsByCountryName(countryName = country.name!!)
        binding.countryName = country.name
        viewModel.foodsList.observe(viewLifecycleOwner){
            val cuisineAdapter = CuisineAdapter(requireContext(), it, viewModel)
            binding.cuisineRv.adapter = cuisineAdapter
        }
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : CuisineViewModel by viewModels()
        viewModel = tempViewModel

    }




}