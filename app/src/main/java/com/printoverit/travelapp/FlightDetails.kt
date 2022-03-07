package com.printoverit.travelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.navigation.navArgs
import coil.load
import com.printoverit.travelapp.utils.Constants.Companion.ERROR_MSG
import kotlinx.android.synthetic.main.activity_flight_details.*

class FlightDetails : AppCompatActivity() {
    val args by navArgs<FlightDetailsArgs>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flight_details)
        if (args.selected=="Dubai"){
            val trip="Trip to ${args.dubai.destination}"
            flight_title.text=trip
            val dates="Date: ${args.dubai.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.dubai.price}"
            flight_pricee.text=prifcesss
            if (args.dubai?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.dubai?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.dubai?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.dubai.rating
            flight_class_text.text=args.dubai.classX


            flight_screen_image.load(args.dubai.image){
                crossfade(300)
            }
            image1.load(args.dubai.x1){
                crossfade(300)
            }
            image2.load(args.dubai.x2){
                crossfade(300)
            }
            image3.load(args.dubai.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if (args.selected=="USA"){
            val trip="Trip to ${args.usa.destination}"
            flight_title.text=trip
            val dates="Date: ${args.usa.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.usa.price}"
            flight_pricee.text=prifcesss
            if (args.usa?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.usa?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.usa?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.usa.rating
            flight_class_text.text=args.usa.classX

            flight_screen_image.load(args.usa.image){
                crossfade(300)
            }
            image1.load(args.usa.x1){
                crossfade(300)
            }
            image2.load(args.usa.x2){
                crossfade(300)
            }
            image3.load(args.usa.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if(args.selected=="Japan"){
            val trip="Trip to ${args.japan.destination}"
            flight_title.text=trip
            val dates="Date: ${args.japan.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.japan.price}"
            flight_pricee.text=prifcesss
            if (args.japan?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.japan?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.japan?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.japan.rating
            flight_class_text.text=args.japan.classX

            flight_screen_image.load(args.japan.image){
                crossfade(300)
            }
            image1.load(args.japan.x1){
                crossfade(300)
            }
            image2.load(args.japan.x2){
                crossfade(300)
            }
            image3.load(args.japan.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if(args.selected=="South Korea"){
            val trip="Trip to ${args.southKorea.destination}"
            flight_title.text=trip
            val dates="Date: ${args.southKorea.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.southKorea.price}"
            flight_pricee.text=prifcesss
            if (args.southKorea?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.southKorea?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.southKorea?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.southKorea.rating
            flight_class_text.text=args.southKorea.classX

            flight_screen_image.load(args.southKorea.image){
                crossfade(300)
            }
            image1.load(args.southKorea.x1){
                crossfade(300)
            }
            image2.load(args.southKorea.x2){
                crossfade(300)
            }
            image3.load(args.southKorea.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if(args.selected=="Philippines"){
            val trip="Trip to ${args.philipines.destination}"
            flight_title.text=trip
            val dates="Date: ${args.philipines.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.philipines.price}"
            flight_pricee.text=prifcesss
            if (args.philipines?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.philipines?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.philipines?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.philipines.rating
            flight_class_text.text=args.philipines.classX

            flight_screen_image.load(args.philipines.image){
                crossfade(300)
            }
            image1.load(args.philipines.x1){
                crossfade(300)
            }
            image2.load(args.philipines.x2){
                crossfade(300)
            }
            image3.load(args.philipines.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }
        else if(args.selected=="Malaysia"){
            val trip="Trip to ${args.malaysia.destination}"
            flight_title.text=trip
            val dates="Date: ${args.malaysia.date}"
            flight_datess.text=dates
            val prifcesss="Price: ${args.malaysia.price}"
            flight_pricee.text=prifcesss
            if (args.malaysia?.veg=="yes"){
                flight_veg_text.setTextColor(ContextCompat.getColor(flight_veg_text.context, android.R.color.holo_green_light ))
                flight_veg_image.setColorFilter(ContextCompat.getColor(flight_veg_image.context,android.R.color.holo_green_light ))
            }
            if (args.malaysia?.hygenic=="yes"){
                flight_health_text.setTextColor(ContextCompat.getColor(flight_health_text.context, android.R.color.holo_blue_dark ))
                flight_health_image.setColorFilter(ContextCompat.getColor(flight_health_image.context,android.R.color.holo_blue_dark ))
            }
            if (args.malaysia?.charging=="yes"){
                flight_charge_text.setTextColor(ContextCompat.getColor(flight_charge_text.context, android.R.color.holo_orange_light ))
                flight_charge_image.setColorFilter(ContextCompat.getColor(flight_charge_image.context,android.R.color.holo_orange_light ))
            }
            flight_star_rating.text=args.malaysia.rating
            flight_class_text.text=args.malaysia.classX
            flight_screen_image.load(args.malaysia.image){
                crossfade(300)
            }
            image1.load(args.malaysia.x1){
                crossfade(300)
            }
            image2.load(args.malaysia.x2){
                crossfade(300)
            }
            image3.load(args.malaysia.x3){
                crossfade(300)
            }
            book_flight_btn.setOnClickListener {
                if (args.dubai.premium=="no"){
                    Toast.makeText(applicationContext,ERROR_MSG,Toast.LENGTH_SHORT).show()
                }else{
                    //Do Booking
                }
            }
        }

    }
}