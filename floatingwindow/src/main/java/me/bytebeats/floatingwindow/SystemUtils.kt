package me.bytebeats.floatingwindow

import android.content.Context

/**
 * Created by bytebeats on 2021/11/11 : 12:01
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */

/**
 * height of status bar
 */
fun statusBarHeight(context: Context): Int {
    var height = 0
    val resId = context.resources.getIdentifier("status_bar_height", "dimen", "android")
    if (resId > 0) {
        height = context.resources.getDimensionPixelSize(resId)
    }
    return height
}

/**
 * screen width
 */
fun screenWidth(context: Context): Int = try {
    context.resources.displayMetrics.widthPixels
} catch (ignore: Exception) {
    -1
}

/**
 * screen height
 */
fun screenHeight(context: Context): Int = try {
    context.resources.displayMetrics.heightPixels
} catch (ignore: Exception) {
    -1
}