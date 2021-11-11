package me.bytebeats.floatingwindow

import android.app.Activity
import android.view.View
import android.view.ViewGroup

/**
 * Created by bytebeats on 2021/11/11 : 12:23
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */
class FloatingView:IFloatingView {
    override fun remove(): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun add(): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun attach(activity: Activity): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun attach(container: ViewGroup): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun detach(activity: Activity): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun detach(container: ViewGroup): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun getView(): FloatingLayout {
        TODO("Not yet implemented")
    }

    override fun icon(resId: Int, block: (View) -> Unit): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun customView(view: FloatingLayout): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun customView(resId: Int): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun layoutParams(params: ViewGroup.LayoutParams): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun listener(listener: OnFloatingListener): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun draggable(draggable: Boolean): IFloatingView {
        TODO("Not yet implemented")
    }

    override fun autoPullOver(enable: Boolean): IFloatingView {
        TODO("Not yet implemented")
    }
}