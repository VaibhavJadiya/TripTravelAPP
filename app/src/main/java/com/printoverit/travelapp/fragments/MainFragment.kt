package com.printoverit.travelapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.chip.Chip
import com.printoverit.travelapp.R
import com.printoverit.travelapp.adapters.TravelLocationAdapter
import com.printoverit.travelapp.utils.MyApplication
import com.printoverit.travelapp.viewmodels.TravelViewModel
import com.printoverit.travelapp.viewmodels.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_main.*
import kotlinx.android.synthetic.main.fragment_main.view.*


class MainFragment : Fragment() {
    lateinit var showViewModel: TravelViewModel
    val city= arrayOf("Ajmer","Beawar","Bhilwara","Bikaner","Jaipur","Jodhpur","Kota","Tonk","Udaipur")
    lateinit var  mAdapater:TravelLocationAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repo=(activity?.application as MyApplication).repository
        showViewModel= ViewModelProvider(requireActivity(),ViewModelFactory(repo)).get(TravelViewModel::class.java)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_main, container, false)
        showViewModel.loadTravelData()
        view.visit_place_recyclerView.layoutManager= LinearLayoutManager(requireContext())
        val arrayAdapter=ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,city)
        view.loaction_dropdown.adapter=arrayAdapter
        view.loaction_dropdown.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                view.mealType_ChipGroup.setOnCheckedChangeListener { group,selectedChipId ->
                    val chip= group.findViewById<Chip>(selectedChipId)
                    val selectedMealType=chip.text.toString().lowercase()
                   // Toast.makeText(context,selectedMealType,Toast.LENGTH_SHORT).show()
                    loadDataInRecyclerView(city[p2],view,selectedMealType)
                }
                loadDataInRecyclerView(city[p2],view,"sea")

            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                loadDataInRecyclerView("Ajmer",view,"sea")
            }
        }
        return view
    }
    private fun loadDataInRecyclerView(selection:String,view:View,filterType:String) {
        showViewModel.getTravelLiveData().observe(requireActivity(),{loactions->
            mAdapater = TravelLocationAdapter(loactions.places.ajmer,
                loactions.places.beawar,
                loactions.places.bhilwara,
                loactions.places.bikaner
                ,loactions.places.jaipur
                ,loactions.places.jodhpur
                ,loactions.places.kishangarh
                ,loactions.places.kota
                ,loactions.places.tonk
                ,loactions.places.udaipur
                ,loactions.places
                ,selection,filterType)
            view.visit_place_recyclerView.adapter=mAdapater
            mAdapater.notifyDataSetChanged()
        })
    }

}