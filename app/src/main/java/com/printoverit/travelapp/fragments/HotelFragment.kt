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
import com.printoverit.travelapp.adapters.HotelAdapter
import com.printoverit.travelapp.utils.MyApplication
import com.printoverit.travelapp.viewmodels.TravelViewModel
import com.printoverit.travelapp.viewmodels.ViewModelFactory
import kotlinx.android.synthetic.main.fragment_flights.view.*
import kotlinx.android.synthetic.main.fragment_flights.view.flitgh_recycylerview
import kotlinx.android.synthetic.main.fragment_hotel.view.*


class HotelFragment : Fragment() {

    lateinit var showViewModel: TravelViewModel
    val location= arrayOf("Jaipur","Jodhpur","Kota","Udaipur")
    //val destination= arrayOf("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh")
    lateinit var  mAdapater: HotelAdapter
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
        val view= inflater.inflate(R.layout.fragment_hotel, container, false)
        showViewModel.loadHotels()
        view.hotel_recycylerview.layoutManager= LinearLayoutManager(requireContext())
        //loadDataInRecyclerView(view)
        val locationAdapter= ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,location)
        //val destinationAdapter= ArrayAdapter(requireActivity(),android.R.layout.simple_spinner_dropdown_item,destination)
        view.search_hotels.adapter=locationAdapter
        // view.search_cities.adapter=destinationAdapter
        view.search_hotels.onItemSelectedListener=object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                loadDataInRecyclerView(location[p2],view)
            }
            override fun onNothingSelected(p0: AdapterView<*>?) {
                loadDataInRecyclerView("Jaipur",view)
            }
        }
        return view
    }
    private fun loadDataInRecyclerView(selected:String,view:View) {
        showViewModel.getHotelLiveData().observe(requireActivity(),{hotels->
            mAdapater = HotelAdapter(hotels.hotels.jaipur,
                hotels.hotels.jodhpur,
                hotels.hotels.kota,
                hotels.hotels.udaipur, selected)
            view.hotel_recycylerview.adapter=mAdapater
            mAdapater.notifyDataSetChanged()
        })
    }

}