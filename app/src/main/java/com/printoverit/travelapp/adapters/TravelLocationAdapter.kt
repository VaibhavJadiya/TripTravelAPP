package com.printoverit.travelapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.printoverit.travelapp.R
import com.printoverit.travelapp.dataclasses.*
import com.printoverit.travelapp.fragments.MainFragmentDirections
import kotlinx.android.synthetic.main.sinlge_item_map.view.*

class TravelLocationAdapter(private val mList : List<Ajmer>? ,
                            private val mBeawar:List<Beawar>?,
                            private val mBhilwarar:List<Bhilwara>?,
                            private val mBikaner:List<Bikaner>?,
                            private val mJaipurList : List<Jaipur>? ,
                            private val mJodhpurList : List<Jodhpur>? ,
                            private val mKishangarhList : List<Kishangarh>? ,
                            private val mKotaList : List<Kota>? ,
                            private val mTonkList : List<Tonk>? ,
                            private val mUdaipurList : List<Udaipur>? ,
                            private val places: Places,
                            private var selection:String,
                            private val filyerType:String ): RecyclerView.Adapter<TravelLocationAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val id: TextView =itemView.travel_id_text
        val location: TextView =itemView.travel_location_text
        val image: ImageView =itemView.travel_image
        val layout: CardView=itemView.travel_layout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.sinlge_item_map,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {


        if (selection=="Jaipur"){
          //  val location= arrayOf("Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh")
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
                holder.id.text = ajmerModel?.id
                val trip="Jaipur to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
                holder.id.text = beawarModel?.id
                val trip="Jaipur to ${beawarModel?.name}"
                holder.location.text = trip
                holder.image.load(beawarModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Beawar"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
                holder.id.text = kotaModel?.id
                val trip="Jaipur to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Udaipur"
                holder.id.text = udaipurModel?.id
                val trip="Jaipur to ${udaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(udaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Udaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Beawar"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                //selection="Kota"
                holder.id.text = kotaModel?.id
                val trip="Beawar to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
               // selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Beawar to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
                //selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Beawar to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
               // selection="Ajmer"
                holder.id.text = ajmerModel?.id
                val trip="Beawar to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
              //  selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Beawar to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Bhilwara"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                //selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Bhilwara to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
               // selection="Kota"
                holder.id.text = kotaModel?.id
                val trip="Beawar to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
               // selection="Jodhpur"
                holder.id.text = jodhpurModel?.id
                val trip="Jaipur to ${jodhpurModel?.name}"
                holder.location.text = trip
                holder.image.load(jodhpurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jodhpur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
               // selection="Ajmer"
                holder.id.text = ajmerModel?.id
                val trip="Jaipur to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Jaipur to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Bikaner"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
               // selection="Bikaner"
                holder.id.text = bikanerModel?.id
                val trip="Bikaner to ${bikanerModel?.name}"
                holder.location.text = trip
                holder.image.load(bikanerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bikaner"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
               // selection="Kota"
                holder.id.text = kotaModel?.id
                val trip="Beawar to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
                //selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
               // selection="Ajmer"
                holder.id.text = ajmerModel?.id
                val trip="Jaipur to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Jaipur to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Jodhpur"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                //selection="Jodhpur"
                holder.id.text = jodhpurModel?.id
                val trip="Jodhpur to ${jodhpurModel?.name}"
                holder.location.text = trip
                holder.image.load(jodhpurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jodhpur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
               // selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Beawar to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
               // selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
               // selection="Ajmer"
                holder.id.text = ajmerModel?.id
                val trip="Jaipur to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Beawar"
                holder.id.text = beawarModel?.id
                val trip="Jaipur to ${beawarModel?.name}"
                holder.location.text = trip
                holder.image.load(beawarModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Beawar"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Kishangarh"){
            val ItemsViewModel = mKishangarhList?.get(position)
            holder.id.text = ItemsViewModel?.id
            val trip="Kishangarh to ${ItemsViewModel?.name}"
            holder.location.text = trip
            holder.image.load(ItemsViewModel?.image){
                crossfade(600)
            }
        }
        else if(selection=="Kota"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
               // selection="Kota"
                holder.id.text = kotaModel?.id
                val trip="Kota to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
                //selection="Jodhpur"
                holder.id.text = jodhpurModel?.id
                val trip="Beawar to ${jodhpurModel?.name}"
                holder.location.text = trip
                holder.image.load(jodhpurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jodhpur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
              //  selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
                //selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Jaipur to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Beawar"
                holder.id.text = beawarModel?.id
                val trip="Jaipur to ${beawarModel?.name}"
                holder.location.text = trip
                holder.image.load(beawarModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Beawar"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Tonk"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                //selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Tonk to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
               // selection="Jodhpur"
                holder.id.text = jodhpurModel?.id
                val trip="Beawar to ${jodhpurModel?.name}"
                holder.location.text = trip
                holder.image.load(jodhpurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jodhpur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
               // selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
              //  selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Jaipur to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Jaipur to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else if(selection=="Udaipur"){
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            if(filyerType=="mountain"){
                //selection="Udaipur"
                holder.id.text = udaipurModel?.id
                val trip="Udaipur to ${udaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(udaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Udaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
                //selection="Jodhpur"
                holder.id.text = jodhpurModel?.id
                val trip="Beawar to ${jodhpurModel?.name}"
                holder.location.text = trip
                holder.image.load(jodhpurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jodhpur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
                //selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Jaipur to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
               // selection="Tonk"
                holder.id.text = tonkModel?.id
                val trip="Jaipur to ${tonkModel?.name}"
                holder.location.text = trip
                holder.image.load(tonkModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Tonk"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Jaipur to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }
        else{
            val ajmerModel = mList?.get(position)
            val beawarModel = mBeawar?.get(position)
            val bhilwaraModel = mBhilwarar?.get(position)
            val bikanerModel = mBikaner?.get(position)
            val jaipurModel = mJaipurList?.get(position)
            val jodhpurModel = mJodhpurList?.get(position)
            val kotaModel = mKotaList?.get(position)
            val tonkModel = mTonkList?.get(position)
            val udaipurModel = mUdaipurList?.get(position)
            //val Itemss= arrayListOf(places.ajmer).get(position)
            if(filyerType=="mountain"){
                //selection="Ajmer"
                holder.id.text = ajmerModel?.id
                val trip="Ajmer to ${ajmerModel?.name}"
                holder.location.text = trip
                holder.image.load(ajmerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Ajmer"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if (filyerType=="sea"){
                //selection="Bhilwara"
                holder.id.text = bhilwaraModel?.id
                val trip="Ajmer to ${bhilwaraModel?.name}"
                holder.location.text = trip
                holder.image.load(bhilwaraModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bhilwara"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="desert"){
               // selection="Jaipur"
                holder.id.text = jaipurModel?.id
                val trip="Ajmer to ${jaipurModel?.name}"
                holder.location.text = trip
                holder.image.load(jaipurModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Jaipur"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="cultural"){
                //selection="Kota"
                holder.id.text = kotaModel?.id
                val trip="Ajmer to ${kotaModel?.name}"
                holder.location.text = trip
                holder.image.load(kotaModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Kota"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }
            if(filyerType=="historical"){
               // selection="Bikaner"
                holder.id.text = bikanerModel?.id
                val trip="Ajmer to ${bikanerModel?.name}"
                holder.location.text = trip
                holder.image.load(bikanerModel?.image){
                    crossfade(600)
                }
                holder.layout.setOnClickListener {
                    val action=MainFragmentDirections.actionMainFragmentToLocationDetailsActivity(ajmerModel!!,position,"Bikaner"
                        ,beawarModel!!
                        ,bhilwaraModel!!
                        ,bikanerModel!!
                        ,jaipurModel!!
                        ,jodhpurModel!!
                        ,kotaModel!!
                        ,tonkModel!!
                        ,udaipurModel!!)
                    holder.layout.findNavController().navigate(action)
                }
            }

        }

    }

    override fun getItemCount(): Int {
        return  mList!!.size
    }
}