package com.percentage.percentagedesign

import android.app.Activity
import android.util.DisplayMetrics
import android.util.Log
import android.view.View
import android.view.ViewGroup

class utils {

    companion object{

        fun setMargin (activity: Activity, view: View, start : Float = 0f, end : Float= 0f, top : Float= 0f, bottom : Float= 0f)
        {

            Log.e("MarginStart===","${widthPer(activity,start).toInt()}")
            Log.e("MarginEnd===","${widthPer(activity,end).toInt()}")
            Log.e("MarginTop===","${heightPer(activity,top).toInt()}")
            Log.e("MarginBottom===","${heightPer(activity,bottom).toInt()}")

            val param = view.layoutParams as ViewGroup.MarginLayoutParams
            param.setMargins(widthPer(activity,start).toInt(),heightPer(activity,top).toInt(),widthPer(activity,end).toInt(),heightPer(activity,bottom).toInt())

            view.layoutParams = param // Tested!! - You need this line for the params to be applied.

        }

        fun heightPer(activity: Activity, per : Float) : Float
        {


            val displayMetrics = DisplayMetrics()
            activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
            val height = displayMetrics.heightPixels

            return  (height*per)/100

//            val pixel = activity.windowManager.defaultDisplay.height
//            val dp = pixel / activity.resources.displayMetrics.density.toInt()
//            return  (dp * per)/100f
        }

        fun widthPer(activity: Activity, per : Float) : Float
        {
//            val pixel = activity.windowManager.defaultDisplay.width
//            val dp = pixel / activity.resources.displayMetrics.density.toInt()
//            return  (dp * per)/100f

            val displayMetrics = DisplayMetrics()
            activity.windowManager.defaultDisplay.getMetrics(displayMetrics)
            val widht = displayMetrics.widthPixels

            return  (widht*per)/100
        }




    }
}