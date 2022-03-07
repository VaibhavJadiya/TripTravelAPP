package com.printoverit.travelapp

import android.Manifest
import android.app.Activity
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import com.printoverit.travelapp.adapters.DaysAdapter
import com.printoverit.travelapp.adapters.HotelAdapter
import com.printoverit.travelapp.utils.MyApplication
import com.printoverit.travelapp.viewmodels.TravelViewModel
import com.printoverit.travelapp.viewmodels.ViewModelFactory
import kotlinx.android.synthetic.main.activity_location_details.*
import kotlinx.android.synthetic.main.fragment_hotel.view.*
import org.jsoup.Jsoup

class LocationDetailsActivity : AppCompatActivity() {
    private val requestCall = 1
    val args by navArgs<LocationDetailsActivityArgs>()
    val postoin by navArgs<LocationDetailsActivityArgs>()
    lateinit var showViewModel: TravelViewModel
    lateinit var  mAdapater: DaysAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_location_details)
        val repo=(application as MyApplication).repository
        showViewModel= ViewModelProvider(this, ViewModelFactory(repo)).get(TravelViewModel::class.java)
        showViewModel.loadDays()
        //travel_recyclerview.layoutManager= LinearLayoutManager(this)
        travel_recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        if (postoin.city=="Ajmer"){
            location_image.load(args.location.image){
                crossfade(600)
            }
            val textu="Trip to ${args.location.name}"
            location_name.text=textu
            location_travels.text=args.location.travelsname
            location_hotels.text=args.location.hotelname
            travel_call_button.setOnClickListener {
                checkPermission(args.location.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.location.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.location.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })

        }
        else if (postoin.city=="Bhilwara"){
            location_image.load(args.bhilwara.image){
                crossfade(600)
            }
            val textu="Trip to ${args.bhilwara.name}"
            location_name.text=textu
            location_travels.text=args.bhilwara.travelsname
            location_hotels.text=args.bhilwara.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.bhilwara.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.bhilwara.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.bhilwara.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Bikaner"){
            location_image.load(args.bikaner.image){
                crossfade(600)
            }
            val textu="Trip to ${args.bikaner.name}"
            location_name.text=textu
            location_travels.text=args.bikaner.travelsname
            location_hotels.text=args.bikaner.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.bikaner.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.bikaner.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.bikaner.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Jaipur"){
            location_image.load(args.jaipur.image){
                crossfade(600)
            }
            val textu="Trip to ${args.jaipur.name}"
            location_name.text=textu
            location_travels.text=args.jaipur.travelsname
            location_hotels.text=args.jaipur.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.jaipur.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.jaipur.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.jaipur.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Jodhpur"){
            location_image.load(args.jodhpur.image){
                crossfade(600)
            }
            val textu="Trip to ${args.jodhpur.name}"
            location_name.text=textu
            location_travels.text=args.jodhpur.travelsname
            location_hotels.text=args.jodhpur.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.jodhpur.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.jodhpur.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.jodhpur.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Kota"){
            location_image.load(args.kota.image){
                crossfade(600)
            }
            val textu="Trip to ${args.kota.name}"
            location_name.text=textu
            location_travels.text=args.kota.travelsname
            location_hotels.text=args.kota.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.kota.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.kota.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.kota.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Tonk"){
            location_image.load(args.tonk.image){
                crossfade(600)
            }
            val textu="Trip to ${args.tonk.name}"
            location_name.text=textu
            location_travels.text=args.tonk.travelsname
            location_hotels.text=args.tonk.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.tonk.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.tonk.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.tonk.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }
        else if (postoin.city=="Udaipur"){
            location_image.load(args.udaipur.image){
                crossfade(600)
            }
            val textu="Trip to ${args.udaipur.name}"
            location_name.text=textu
            location_travels.text=args.udaipur.travelsname
            location_hotels.text=args.udaipur.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.udaipur.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.udaipur.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.udaipur.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }

       else if (postoin.city=="Beawar"){
            location_image.load(args.beawar.image){
                crossfade(600)
            }
            val textu="Trip to ${args.beawar.name}"
            location_name.text=textu
            location_travels.text=args.beawar.travelsname
            location_hotels.text=args.beawar.hotelname

            travel_call_button.setOnClickListener {
                checkPermission(args.beawar.travelsnumber.toString())
            }
            travel_call_button2.setOnClickListener {
                checkPermission(args.beawar.hotelnumber.toString())
            }
            showViewModel.getDaysLiveData().observe(this,{days->
                mAdapater = DaysAdapter(days.trips.amritsar,
                    days.trips.assam,
                    days.trips.goa,
                    days.trips.jodhpur,
                    days.trips.maharastra,
                    days.trips.shimla
                    ,args.beawar.name)
                travel_recyclerview.adapter=mAdapater
                mAdapater.notifyDataSetChanged()
            })
        }


    }
    fun checkPermission(phone:String) {
        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.CALL_PHONE)
            != PackageManager.PERMISSION_GRANTED) {

            // Permission is not granted
            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.CALL_PHONE)) {
                // Show an explanation to the user *asynchronously* -- don't block
                // this thread waiting for the user's response! After the user
                // sees the explanation, try again to request the permission.
            } else {
                // No explanation needed, we can request the permission.
                ActivityCompat.requestPermissions(this,
                    arrayOf(Manifest.permission.CALL_PHONE),
                    42)
            }
        } else {
            // Permission has already been granted
            callPhone(phone)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int,
                                            permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == 42) {
            // If request is cancelled, the result arrays are empty.
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                // permission was granted, yay!
               // callPhone()
            } else {
                // permission denied, boo! Disable the
                // functionality
            }
            return
        }
    }
    fun callPhone(myNumber:String){
        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + myNumber))
        startActivity(intent)
    }
}