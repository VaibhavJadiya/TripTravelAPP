package com.printoverit.travelapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.printoverit.travelapp.R
import com.printoverit.travelapp.days.*
import kotlinx.android.synthetic.main.single_days_item.view.*
import kotlinx.android.synthetic.main.single_flight_row.view.*
import kotlinx.android.synthetic.main.single_hotel_row.view.*
import kotlinx.android.synthetic.main.single_hotel_row.view.flight_image


class DaysAdapter(private val mAmristar : List<Amritsar>?, private val mAssamList:List<Assam>?
                  , private val mGoaList :List<Goa>?
                  , private val mJodhpurList:List<Jodhpur>?,
                   private val mMaharastraList:List<Maharastra>?,
                   private val mShimlaList:List<Shimla>?,
                  private val selected :String): RecyclerView.Adapter<DaysAdapter.MyViewHolder>()  {
    class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val days_count: TextView =itemView.days_count
        val days_place_name: TextView =itemView.days_place_name
        val place_price: TextView =itemView.place_price
        val days_pictures: ImageView =itemView.days_pictures
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.single_days_item,parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val amristsarModel = mAmristar?.get(position)
        val assamModel = mAssamList?.get(position)
        val goaModel = mGoaList?.get(position)
        val jodhpurModel = mJodhpurList?.get(position)
        val maharastharaModel = mMaharastraList?.get(position)
        val shimlaModel = mShimlaList?.get(position)
        holder.days_count.text=jodhpurModel?.days
        holder.place_price.text=jodhpurModel?.expenses
        holder.days_place_name.text=jodhpurModel?.placename
        holder.days_pictures.load(jodhpurModel?.placeimage){
            crossfade(300)
        }
        if (selected=="Jodhpur"){
            holder.days_count.text=jodhpurModel?.days
            holder.days_place_name.text=jodhpurModel?.placename
            holder.place_price.text=jodhpurModel?.expenses
            holder.days_pictures.load(jodhpurModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Jaisalmer"){
            holder.days_count.text=jodhpurModel?.days
            holder.days_place_name.text=jodhpurModel?.placename
            holder.place_price.text=jodhpurModel?.expenses
            holder.days_pictures.load(jodhpurModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Amritsar"){
            holder.days_count.text=amristsarModel?.days
            holder.days_place_name.text=amristsarModel?.placename
            holder.place_price.text=amristsarModel?.expenses
            holder.days_pictures.load(amristsarModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Ladakh"){
            holder.days_count.text=maharastharaModel?.days
            holder.days_place_name.text=maharastharaModel?.placename
            holder.place_price.text=maharastharaModel?.expenses
            holder.days_pictures.load(maharastharaModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Assam"){
            holder.days_count.text=assamModel?.days
            holder.days_place_name.text=assamModel?.placename
            holder.place_price.text=assamModel?.expenses
            holder.days_pictures.load(assamModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Sonmarg"){
            holder.days_count.text=shimlaModel?.days
            holder.days_place_name.text=shimlaModel?.placename
            holder.place_price.text=shimlaModel?.expenses
            holder.days_pictures.load(shimlaModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Shimla"){
            holder.days_count.text=shimlaModel?.days
            holder.days_place_name.text=shimlaModel?.placename
            holder.place_price.text=shimlaModel?.expenses
            holder.days_pictures.load(shimlaModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Goa"){
            holder.days_count.text=goaModel?.days
            holder.days_place_name.text=goaModel?.placename
            holder.place_price.text=goaModel?.expenses
            holder.days_pictures.load(goaModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Udaipur"){
            holder.days_count.text=jodhpurModel?.days
            holder.days_place_name.text=jodhpurModel?.placename
            holder.place_price.text=jodhpurModel?.expenses
            holder.days_pictures.load(jodhpurModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Maharashtra"){
            holder.days_count.text=maharastharaModel?.days
            holder.days_place_name.text=maharastharaModel?.placename
            holder.place_price.text=maharastharaModel?.expenses
            holder.days_pictures.load(maharastharaModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Jaipur"){
            holder.days_count.text=jodhpurModel?.days
            holder.days_place_name.text=jodhpurModel?.placename
            holder.place_price.text=jodhpurModel?.expenses
            holder.days_pictures.load(jodhpurModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Mysore"){
            holder.days_count.text=amristsarModel?.days
            holder.days_place_name.text=amristsarModel?.placename
            holder.place_price.text=amristsarModel?.expenses
            holder.days_pictures.load(amristsarModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Ran of Kutch"){
            holder.days_count.text=assamModel?.days
            holder.days_place_name.text=assamModel?.placename
            holder.place_price.text=assamModel?.expenses
            holder.days_pictures.load(assamModel?.placeimage){
                crossfade(300)
            }
        }
        else if (selected=="Varansi"){
            holder.days_count.text=amristsarModel?.days
            holder.days_place_name.text=amristsarModel?.placename
            holder.place_price.text=amristsarModel?.expenses
            holder.days_pictures.load(amristsarModel?.placeimage){
                crossfade(300)
            }
        }
    }

    override fun getItemCount(): Int {
       return mAmristar!!.size
    }
}