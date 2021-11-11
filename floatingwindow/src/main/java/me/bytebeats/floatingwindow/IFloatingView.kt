package me.bytebeats.floatingwindow

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import androidx.annotation.DrawableRes
import androidx.annotation.LayoutRes

/**
 * Created by bytebeats on 2021/11/11 : 12:13
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */
interface IFloatingView {
    fun remove(): IFloatingView
    fun add(): IFloatingView
    fun attach(activity: Activity): IFloatingView
    fun attach(container: ViewGroup): IFloatingView
    fun detach(activity: Activity): IFloatingView
    fun detach(container: ViewGroup): IFloatingView
    fun getView(): FloatingLayout
    fun icon(@DrawableRes resId: Int, block: (View) -> Unit): IFloatingView
    fun customView(view: FloatingLayout): IFloatingView
    fun customView(@LayoutRes resId: Int): IFloatingView
    fun layoutParams(params: ViewGroup.LayoutParams): IFloatingView
    fun listener(listener: OnFloatingListener): IFloatingView
    fun draggable(draggable: Boolean): IFloatingView
    fun autoPullOver(enable: Boolean): IFloatingView
}