package com.printoverit.travelapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.printoverit.travelapp.R
import com.printoverit.travelapp.adapters.FlitghtAdapter
import com.printoverit.travelapp.adapters.TravelLocationAdapter
import com.printoverit.travelapp.utils.MyApplication
import com.printoverit.travelapp.viewmodels.TravelViewModel
import com.printoverit.travelapp.viewmodels.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_flights.view.*
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.android.synthetic.main.fragment_main.view.loaction_dropdown
import kotlinx.android.synthetic.main.fragment_main.view.visit_place_recyclerView


class FlightsFragment : Fragment() {

    lateinit var showViewModel: TravelViewModel
    val location= arrayOf("Dubai","USA","Japan","South Korea","Philippines","Malaysia")
    //val destination= arrayOf("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh")
    lateinit var  mAdapater: FlitghtAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val repo=(activity?.application as MyApplication).repository
        showViewModel= ViewModelProvider(requireActivity(), ViewModelFactory(repo)).get(TravelViewModel::class.java)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_flights, container, false)
        showViewModel.loadFlightsData()
        view.flitgh_recycylerview.layoutManager= LinearLayoutManager(requireContext())
        //loadDataInRecyclerView(view)
       val locationAdapter= ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,location)
       //val destinationAdapter= ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,destination)
       view.destination_dropdown.adapter=locationAdapter
      // view.search_cities.adapter=destinationAdapter
       view.destination_dropdown.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
           override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
               loadDataInRecyclerView(location[p2],view)
           }
           override fun onNothingSelected(p0: AdapterView<*>?) {
               loadDataInRecyclerView("Dubai",view)
           }
       }
        return  view
    }
    private fun loadDataInRecyclerView(selected:String,view:View) {
        showViewModel.getFlightLiveData().observe(requireActivity(),{flights->
            mAdapater = FlitghtAdapter(flights.flights.dubai,
                                        flights.flights.japan,
                                        flights.flights.malaysia,
                                        flights.flights.philippines,
                                        flights.flights.southKorea,
                                        flights.flights.uSA, selected)
            view.flitgh_recycylerview.adapter=mAdapater
            mAdapater.notifyDataSetChanged()
        })
    }

}