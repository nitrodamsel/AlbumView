package com.dearwolves.albumviewsample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.dearwolves.albumview.AlbumView
import com.dearwolves.albumview.IAlbumView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val view = my_album_view
        view.images = Arrays.asList(
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSld6q-rjcpLG5_97mkm-CSKysEFKIGldz2APVo2QZ1QGG-1OJv",
            //"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSgyhXFgPYSGFN1oYiBPzgs_9JoC5J6iDbNkyPSTiTeBJe2GXOh",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTSPlVZcqH4_LUpjyWsDxRZXG9SqUBBgRHHXFnlKvSd51agTsPR",
            "https://4.img-dpreview.com/files/p/E~TS590x0~articles/3925134721/0266554465.jpeg")

        view.iAlbumView = object : IAlbumView {
            override fun load(url: String, imageView: ImageView) {
                Picasso.with(this@MainActivity).load(url).into(imageView)
            }
        }

        view.loadImages()



    }
}
