package me.bytebeats.floatingwindow

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri

/**
 * Created by bytebeats on 2021/11/11 : 12:28
 * E-mail: happychinapc@gmail.com
 * Quote: Peasant. Educated. Worker
 */
class Initializer : ContentProvider() {
    override fun onCreate(): Boolean {
        // TODO: initialize FloatingWindow
        return true
    }

    override fun query(
        uri: Uri,
        projection: Array<out String>?,
        selection: String?,
        selectionArgs: Array<out String>?,
        sortOrder: String?
    ): Cursor? = null

    override fun getType(uri: Uri): String? = null

    override fun insert(uri: Uri, values: ContentValues?): Uri? = null

    override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int = -1

    override fun update(
        uri: Uri,
        values: ContentValues?,
        selection: String?,
        selectionArgs: Array<out String>?
    ): Int = -1
}