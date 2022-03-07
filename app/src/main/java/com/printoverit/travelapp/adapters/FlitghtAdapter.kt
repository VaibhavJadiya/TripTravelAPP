package com.printoverit.travelapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.printoverit.travelapp.R
import com.printoverit.travelapp.dataclasses.Ajmer
import com.printoverit.travelapp.flights.Flight
import com.printoverit.travelapp.fragments.FlightsFragmentDirections
import com.printoverit.travelapp.fragments.MainFragmentDirections
import com.printoverit.travelapp.trip.*
import kotlinx.android.synthetic.main.single_flight_row.view.*
import kotlinx.android.synthetic.main.sinlge_item_map.view.*

class FlitghtAdapter(private val mList : List<Dubai>? , private val mJapanList:List<Japan>?
                    , private val mMalaysiaList :List<Malaysia>?
                    , private val mPhiliipinesList:List<Philippine>?,
                    private val mSouthKoreaList: List<SouthKorea>?,
                    private val mUSAList: List<USA>?,
                    private val selected :String): RecyclerView.Adapter<FlitghtAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val name: TextView =itemView.arilines_name
        val location: TextView =itemView.flight_route
        val rating: TextView =itemView.flight_star_rating
        val veg_text: TextView =itemView.flight_veg_text
        val healthy_text: TextView =itemView.flight_health_text
        val flitgh_price: TextView =itemView.flitgh_price
        val flitgh_date: TextView =itemView.flight_date
        val image: ImageView =itemView.flight_image
        val veg_image: ImageView =itemView.flight_veg_image
        val healthy_image: ImageView =itemView.flight_health_image
        val layout: CardView =itemView.flightRowLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FlitghtAdapter.MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.single_flight_row,parent, false)
        return FlitghtAdapter.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: FlitghtAdapter.MyViewHolder, position: Int) {
        val flightModel = mList?.get(position)
        val japanModel = mJapanList?.get(position)
        val malaysiaModel = mMalaysiaList?.get(position)
        val phillipinesModel = mPhiliipinesList?.get(position)
        val southKoreaModel = mSouthKoreaList?.get(position)
        val USAModel = mUSAList?.get(position)
        if (selected=="Dubai"){
            holder.name.text = flightModel?.name
            val trip="${flightModel?.location} to ${flightModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=flightModel?.price
            holder.flitgh_date.text=flightModel?.date
            holder.rating.text=flightModel?.rating
            holder.healthy_text.text=flightModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                USAModel!!,
                japanModel!!,
                southKoreaModel!!,
                phillipinesModel!!,
                malaysiaModel!!,"Dubai")
                holder.layout.findNavController().navigate(action)

            }
            if (flightModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (flightModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="USA"){
            holder.name.text = USAModel?.name
            val trip="${USAModel?.location} to ${USAModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=USAModel?.price
            holder.flitgh_date.text=USAModel?.date
            holder.rating.text=USAModel?.rating
            holder.healthy_text.text=USAModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                USAModel!!,
                japanModel!!,
                southKoreaModel!!,
                phillipinesModel!!,
                malaysiaModel!!,"USA")
                holder.layout.findNavController().navigate(action)

            }
            if (USAModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (USAModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Japan"){
            holder.name.text = japanModel?.name
            val trip="${japanModel?.location} to ${japanModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=japanModel?.price
            holder.flitgh_date.text=japanModel?.date
            holder.rating.text=japanModel?.rating
            holder.healthy_text.text=japanModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                    USAModel!!,
                    japanModel!!,
                    southKoreaModel!!,
                    phillipinesModel!!,
                    malaysiaModel!!,"Japan")
                holder.layout.findNavController().navigate(action)

            }
            if (japanModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (japanModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="South Korea"){
            holder.name.text = southKoreaModel?.name
            val trip="${southKoreaModel?.location} to ${southKoreaModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=southKoreaModel?.price
            holder.flitgh_date.text=southKoreaModel?.date
            holder.rating.text=southKoreaModel?.rating
            holder.healthy_text.text=southKoreaModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                    USAModel!!,
                    japanModel!!,
                    southKoreaModel!!,
                    phillipinesModel!!,
                    malaysiaModel!!,"South Korea")
                holder.layout.findNavController().navigate(action)

            }
            if (southKoreaModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (southKoreaModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Philippines"){
            holder.name.text = phillipinesModel?.name
            val trip="${phillipinesModel?.location} to ${phillipinesModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=phillipinesModel?.price
            holder.flitgh_date.text=phillipinesModel?.date
            holder.rating.text=phillipinesModel?.rating
            holder.healthy_text.text=phillipinesModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                    USAModel!!,
                    japanModel!!,
                    southKoreaModel!!,
                    phillipinesModel!!,
                    malaysiaModel!!,"Philippines")
                holder.layout.findNavController().navigate(action)

            }
            if (phillipinesModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (phillipinesModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Malaysia"){
            holder.name.text = malaysiaModel?.name
            val trip="${malaysiaModel?.location} to ${malaysiaModel?.destination}"
            holder.location.text = trip
            holder.flitgh_price.text=malaysiaModel?.price
            holder.flitgh_date.text=malaysiaModel?.date
            holder.rating.text=malaysiaModel?.rating
            holder.healthy_text.text=malaysiaModel?.classX
            holder.layout.setOnClickListener {
                val action= FlightsFragmentDirections.actionFlightsFragmentToFlightDetails(flightModel!!,
                    USAModel!!,
                    japanModel!!,
                    southKoreaModel!!,
                    phillipinesModel!!,
                    malaysiaModel!!,"Malaysia")
                holder.layout.findNavController().navigate(action)

            }
            if (malaysiaModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (malaysiaModel?.hygenic=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }


    }

    override fun getItemCount(): Int {
       return mList!!.size
    }
}