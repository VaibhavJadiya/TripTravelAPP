package com.printoverit.travelapp.utils

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

class NetworkStatus {
    companion object{
        fun isNetworkAvailable(context: Context):Boolean{
            (context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager).run {
                if(Build.VERSION.SDK_INT>= Build.VERSION_CODES.M){
                    return  this.getNetworkCapabilities(this.activeNetwork)?.hasCapability(
                        NetworkCapabilities.NET_CAPABILITY_INTERNET
                    )?:false
                }
                else{
                    (@Suppress("Depecration")
                    return this.activeNetworkInfo?.isConnected?:false)

                }
            }
        }
    }
}