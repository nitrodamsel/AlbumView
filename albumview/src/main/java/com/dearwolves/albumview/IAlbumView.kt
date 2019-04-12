package com.dearwolves.albumview

import android.widget.ImageView

interface IAlbumView {
    fun load(url: String, imageView: ImageView)
}
