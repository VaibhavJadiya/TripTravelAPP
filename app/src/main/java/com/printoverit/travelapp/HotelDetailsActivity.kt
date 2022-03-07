package com.printoverit.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.navArgs
import coil.load
import com.printoverit.travelapp.utils.Constants
import kotlinx.android.synthetic.main.activity_flight_details.*
import kotlinx.android.synthetic.main.activity_hotel_details.*
import kotlinx.android.synthetic.main.activity_hotel_details.image1
import kotlinx.android.synthetic.main.activity_hotel_details.image2
import kotlinx.android.synthetic.main.activity_hotel_details.image3


class HotelDetailsActivity : AppCompatActivity() {
    val args by navArgs<HotelDetailsActivityArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hotel_details)

        if (args.selected=="Jaipur"){

            hotel_title.text=args.jaipur.name
            hotel_rooms.text=args.jaipur.room
            hotel_prices.text=args.jaipur.price

            hotel_star_rating.text=args.jaipur.rating
            if (args.jaipur.ac=="no"){
                hotel_ac_text.text="Non Ac"
            }
            if (args.jaipur?.veg=="yes"){
                hotel_veg_text.setTextColor(ContextCompat.getColor(hotel_veg_text.context, android.R.color.holo_green_light ))
                hotel_veg_image.setColorFilter(ContextCompat.getColor(hotel_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.jaipur?.hygenic=="yes"){
                hotel_health_text.setTextColor(ContextCompat.getColor(hotel_health_text.context, android.R.color.holo_blue_dark ))
                hotel_health_image.setColorFilter(ContextCompat.getColor(hotel_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.jaipur?.vIP=="yes"){
                hotel_vip_text.setTextColor(ContextCompat.getColor(hotel_vip_text.context, android.R.color.holo_orange_light ))
                hotel_vip_image.setColorFilter(ContextCompat.getColor(hotel_vip_image.context,android.R.color.holo_orange_light ))
            }

            hotel_screen_image.load(args.jaipur.image){
                crossfade(300)
            }
            image1.load(args.jaipur.x1){
                crossfade(300)
            }
            image2.load(args.jaipur.x2){
                crossfade(300)
            }
            image3.load(args.jaipur.x3){
                crossfade(300)
            }
            book_hotel_btn.setOnClickListener {
                if (args.jaipur.premium=="no"){
                    Toast.makeText(applicationContext, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if (args.selected=="Jodhpur"){
            hotel_title.text=args.jodhpur.name
            hotel_rooms.text=args.jodhpur.room
            hotel_prices.text=args.jodhpur.price
            hotel_star_rating.text=args.jodhpur.rating
            if (args.jodhpur.ac=="no"){
                hotel_ac_text.text="Non Ac"
            }
            if (args.jodhpur?.veg=="yes"){
                hotel_veg_text.setTextColor(ContextCompat.getColor(hotel_veg_text.context, android.R.color.holo_green_light ))
                hotel_veg_image.setColorFilter(ContextCompat.getColor(hotel_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.jodhpur?.hygenic=="yes"){
                hotel_health_text.setTextColor(ContextCompat.getColor(hotel_health_text.context, android.R.color.holo_blue_dark ))
                hotel_health_image.setColorFilter(ContextCompat.getColor(hotel_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.jodhpur?.vIP=="yes"){
                hotel_vip_text.setTextColor(ContextCompat.getColor(hotel_vip_text.context, android.R.color.holo_orange_light ))
                hotel_vip_image.setColorFilter(ContextCompat.getColor(hotel_vip_image.context,android.R.color.holo_orange_light ))
            }

            hotel_screen_image.load(args.jodhpur.image){
                crossfade(300)
            }
            image1.load(args.jodhpur.x1){
                crossfade(300)
            }
            image2.load(args.jodhpur.x2){
                crossfade(300)
            }
            image3.load(args.jodhpur.x3){
                crossfade(300)
            }
            book_hotel_btn.setOnClickListener {
                if (args.jodhpur.premium=="no"){
                    Toast.makeText(applicationContext, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if(args.selected=="Kota") {
            hotel_title.text=args.kota.name
            hotel_rooms.text=args.kota.room
            hotel_prices.text=args.kota.price

            hotel_star_rating.text=args.kota.rating
            if (args.kota.ac=="no"){
                hotel_ac_text.text="Non Ac"
            }
            if (args.kota?.veg=="yes"){
                hotel_veg_text.setTextColor(ContextCompat.getColor(hotel_veg_text.context, android.R.color.holo_green_light ))
                hotel_veg_image.setColorFilter(ContextCompat.getColor(hotel_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.kota?.hygenic=="yes"){
                hotel_health_text.setTextColor(ContextCompat.getColor(hotel_health_text.context, android.R.color.holo_blue_dark ))
                hotel_health_image.setColorFilter(ContextCompat.getColor(hotel_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.kota?.vIP=="yes"){
                hotel_vip_text.setTextColor(ContextCompat.getColor(hotel_vip_text.context, android.R.color.holo_orange_light ))
                hotel_vip_image.setColorFilter(ContextCompat.getColor(hotel_vip_image.context,android.R.color.holo_orange_light ))
            }
            hotel_screen_image.load(args.kota.image){
                crossfade(300)
            }
            image1.load(args.kota.x1){
                crossfade(300)
            }
            image2.load(args.kota.x2){
                crossfade(300)
            }
            image3.load(args.kota.x3){
                crossfade(300)
            }
            book_hotel_btn.setOnClickListener {
                if (args.kota.premium=="no"){
                    Toast.makeText(applicationContext, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }

        else if(args.selected=="Udaipur"){
            hotel_title.text=args.udaipur.name
            hotel_rooms.text=args.udaipur.room
            hotel_prices.text=args.udaipur.price

            hotel_star_rating.text=args.udaipur.rating
            if (args.udaipur.ac=="no"){
                hotel_ac_text.text="Non Ac"
            }
            if (args.udaipur?.veg=="yes"){
                hotel_veg_text.setTextColor(ContextCompat.getColor(hotel_veg_text.context, android.R.color.holo_green_light ))
                hotel_veg_image.setColorFilter(ContextCompat.getColor(hotel_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.udaipur?.hygenic=="yes"){
                hotel_health_text.setTextColor(ContextCompat.getColor(hotel_health_text.context, android.R.color.holo_blue_dark ))
                hotel_health_image.setColorFilter(ContextCompat.getColor(hotel_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.udaipur?.vIP=="yes"){
                hotel_vip_text.setTextColor(ContextCompat.getColor(hotel_vip_text.context, android.R.color.holo_orange_light ))
                hotel_vip_image.setColorFilter(ContextCompat.getColor(hotel_vip_image.context,android.R.color.holo_orange_light ))
            }
            hotel_screen_image.load(args.udaipur.image){
                crossfade(300)
            }
            image1.load(args.udaipur.x1){
                crossfade(300)
            }
            image2.load(args.udaipur.x2){
                crossfade(300)
            }
            image3.load(args.udaipur.x3){
                crossfade(300)
            }
            book_hotel_btn.setOnClickListener {
                if (args.udaipur.premium=="no"){
                    Toast.makeText(applicationContext, Constants.ERROR_MSG, Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
    }
}