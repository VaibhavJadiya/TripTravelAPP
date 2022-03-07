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
import com.printoverit.travelapp.R
import com.printoverit.travelapp.fragments.FlightsFragmentDirections
import com.printoverit.travelapp.fragments.HotelFragmentDirections
import com.printoverit.travelapp.hotel.Jaipur
import com.printoverit.travelapp.hotel.Jodhpur
import com.printoverit.travelapp.hotel.Kota
import com.printoverit.travelapp.hotel.Udaipur
import com.printoverit.travelapp.trip.*
import kotlinx.android.synthetic.main.single_flight_row.view.*
import kotlinx.android.synthetic.main.single_flight_row.view.flightRowLayout
import kotlinx.android.synthetic.main.single_flight_row.view.flight_health_image
import kotlinx.android.synthetic.main.single_flight_row.view.flight_health_text
import kotlinx.android.synthetic.main.single_flight_row.view.flight_image
import kotlinx.android.synthetic.main.single_flight_row.view.flight_star_rating
import kotlinx.android.synthetic.main.single_flight_row.view.flight_veg_image
import kotlinx.android.synthetic.main.single_flight_row.view.flight_veg_text
import kotlinx.android.synthetic.main.single_hotel_row.view.*

class HotelAdapter(private val mJaipurList : List<Jaipur>?, private val mJodhpurList:List<Jodhpur>?
                   , private val mKotaList :List<Kota>?
                   , private val mUdaipurList:List<Udaipur>?,
                   private val selected :String): RecyclerView.Adapter<HotelAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val name: TextView =itemView.hotel_name
        val location: TextView =itemView.hotel_location
        val rating: TextView =itemView.hotel_star_rating
        val veg_text: TextView =itemView.hotel_veg_text
        val healthy_text: TextView =itemView.hotel_ac_text
        val flitgh_price: TextView =itemView.hotel_price
        val flitgh_date: TextView =itemView.hotel_rooms
        val image: ImageView =itemView.flight_image
        val veg_image: ImageView =itemView.hotel_veg_image
        val healthy_image: ImageView =itemView.hotel_ac_image
        val layout: CardView =itemView.hotelRowLayout
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HotelAdapter.MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.single_hotel_row,parent, false)
        return HotelAdapter.MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: HotelAdapter.MyViewHolder, position: Int) {
        val jaipurModel = mJaipurList?.get(position)
        val jodhpurModel = mJodhpurList?.get(position)
        val kotaModel = mKotaList?.get(position)
        val udaipurMOdel = mUdaipurList?.get(position)
        if (selected=="Jaipur"){
            holder.name.text = jaipurModel?.name
            holder.location.text = jaipurModel?.location
            holder.flitgh_price.text=jaipurModel?.price
            holder.flitgh_date.text=jaipurModel?.room
            holder.healthy_text.text=jaipurModel?.ac
            holder.layout.setOnClickListener {
                val action= HotelFragmentDirections.actionHotelFragmentToHotelDetailsActivity(jaipurModel!!,
                    jodhpurModel!!,
                    kotaModel!!,
                    udaipurMOdel!!,
                  "Jaipur")
                holder.layout.findNavController().navigate(action)

            }
            if (jaipurModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (jaipurModel?.ac=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Jodhpur"){
            holder.name.text = jodhpurModel?.name
            holder.location.text = jodhpurModel?.location
            holder.flitgh_price.text=jodhpurModel?.price
            holder.flitgh_date.text=jodhpurModel?.room
            holder.healthy_text.text=jodhpurModel?.ac
            holder.layout.setOnClickListener {
                val action= HotelFragmentDirections.actionHotelFragmentToHotelDetailsActivity(jaipurModel!!,
                    jodhpurModel!!,
                    kotaModel!!,
                    udaipurMOdel!!,
                    "Jodhpur")
                holder.layout.findNavController().navigate(action)

            }
            if (jodhpurModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (jodhpurModel?.ac=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Kota"){
            holder.name.text = kotaModel?.name
            holder.location.text = kotaModel?.location
            holder.flitgh_price.text=kotaModel?.price
            holder.flitgh_date.text=kotaModel?.room
            holder.healthy_text.text=kotaModel?.ac
            holder.layout.setOnClickListener {
                val action= HotelFragmentDirections.actionHotelFragmentToHotelDetailsActivity(jaipurModel!!,
                    jodhpurModel!!,
                    kotaModel!!,
                    udaipurMOdel!!,
                    "Kota")
                holder.layout.findNavController().navigate(action)

            }
            if (kotaModel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (kotaModel?.ac=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
        else if (selected=="Udaipur"){
            holder.name.text = udaipurMOdel?.name
            holder.location.text = udaipurMOdel?.location
            holder.flitgh_price.text=udaipurMOdel?.price
            holder.flitgh_date.text=udaipurMOdel?.room
            holder.healthy_text.text=udaipurMOdel?.ac
            holder.layout.setOnClickListener {
                val action= HotelFragmentDirections.actionHotelFragmentToHotelDetailsActivity(jaipurModel!!,
                    jodhpurModel!!,
                    kotaModel!!,
                    udaipurMOdel!!,
                    "Udaipur")
                holder.layout.findNavController().navigate(action)

            }
            if (udaipurMOdel?.veg=="yes"){
                holder.veg_text.setTextColor(ContextCompat.getColor(holder.veg_text.context, android.R.color.holo_green_light ))
                holder.veg_image.setColorFilter(ContextCompat.getColor(holder.veg_image.context,android.R.color.holo_green_light ))
            }
            if (udaipurMOdel?.ac=="yes"){
                holder.healthy_text.setTextColor(ContextCompat.getColor(holder.healthy_text.context, android.R.color.holo_blue_dark ))
                holder.healthy_image.setColorFilter(ContextCompat.getColor(holder.healthy_image.context,android.R.color.holo_blue_dark ))
            }
        }
    }

    override fun getItemCount(): Int {
        return mJaipurList!!.size
    }
}