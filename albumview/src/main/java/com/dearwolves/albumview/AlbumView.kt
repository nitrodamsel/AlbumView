package com.dearwolves.albumview

import android.content.Context
import android.util.AttributeSet
import android.util.TypedValue
import android.view.LayoutInflater
import android.widget.RelativeLayout
import android.view.View
import android.widget.ImageView
import android.widget.ImageView.ScaleType
import java.util.*

class AlbumView : RelativeLayout {



    private var f1:ImageView? = null

    private var ff1:ImageView? = null
    private var ff2:ImageView? = null

    private var fff1:ImageView? = null
    private var fff2:ImageView? = null
    private var fff3:ImageView? = null

    private var ffff1:ImageView? = null
    private var ffff2:ImageView? = null
    private var ffff3:ImageView? = null
    private var ffff4:ImageView? = null

    /**
     * Image Background Color.
     */
    private var imageBackgroundColor:Int = 0

    /**
     * Image Background Color.
     */
    private var imageSpacing:Int = 0


    public var iAlbumView:IAlbumView? = null
    /**
     * Image URLs
     */
    public var images:List<String>? = null
        set(value) {
            if(value != null) if(value.isNotEmpty()) when(value.size) {
                1 -> {
                    ffff1?.visibility = View.GONE
                    ffff2?.visibility = View.GONE
                    ffff3?.visibility = View.GONE
                    ffff4?.visibility = View.GONE

                    fff1?.visibility = View.GONE
                    fff2?.visibility = View.GONE
                    fff3?.visibility = View.GONE

                    ff1?.visibility = View.GONE
                    ff2?.visibility = View.GONE

                    f1?.visibility = View.VISIBLE
                }
                2 -> {
                    ffff1?.visibility = View.GONE
                    ffff2?.visibility = View.GONE
                    ffff3?.visibility = View.GONE
                    ffff4?.visibility = View.GONE

                    fff1?.visibility = View.GONE
                    fff2?.visibility = View.GONE
                    fff3?.visibility = View.GONE

                    f1?.visibility = View.GONE

                    ff1?.visibility = View.VISIBLE
                    ff2?.visibility = View.VISIBLE
                }
                3 -> {
                    ffff1?.visibility = View.GONE
                    ffff2?.visibility = View.GONE
                    ffff3?.visibility = View.GONE
                    ffff4?.visibility = View.GONE

                    ff1?.visibility = View.GONE
                    ff2?.visibility = View.GONE

                    f1?.visibility = View.GONE

                    fff1?.visibility = View.VISIBLE
                    fff2?.visibility = View.VISIBLE
                    fff3?.visibility = View.VISIBLE
                }
                4 -> {
                    fff1?.visibility = View.GONE
                    fff2?.visibility = View.GONE
                    fff3?.visibility = View.GONE

                    ff1?.visibility = View.GONE
                    ff2?.visibility = View.GONE

                    f1?.visibility = View.GONE

                    ffff1?.visibility = View.VISIBLE
                    ffff2?.visibility = View.VISIBLE
                    ffff3?.visibility = View.VISIBLE
                    ffff4?.visibility = View.VISIBLE
                }
            }
            else {
                ffff1?.visibility = View.GONE
                ffff2?.visibility = View.GONE
                ffff3?.visibility = View.GONE
                ffff4?.visibility = View.GONE

                fff1?.visibility = View.GONE
                fff2?.visibility = View.GONE
                fff3?.visibility = View.GONE

                ff1?.visibility = View.GONE
                ff2?.visibility = View.GONE

                f1?.visibility = View.GONE
            }
            field = value
        }

    fun loadImages(){
        if(images != null) if(iAlbumView != null) if(images!!.isNotEmpty()) when(images!!.size) {
            1 -> {
                iAlbumView!!.load(images!![0], f1!!)
            }
            2 -> {
                iAlbumView!!.load(images!![0], ff1!!)
                iAlbumView!!.load(images!![1], ff2!!)
            }
            3 -> {
                iAlbumView!!.load(images!![0], fff1!!)
                iAlbumView!!.load(images!![1], fff2!!)
                iAlbumView!!.load(images!![2], fff3!!)
            }
            4 -> {
                iAlbumView!!.load(images!![0], ffff1!!)
                iAlbumView!!.load(images!![1], ffff2!!)
                iAlbumView!!.load(images!![2], ffff3!!)
                iAlbumView!!.load(images!![3], ffff4!!)
            }
        }
    }


    constructor(context: Context) : super(context) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {
        init()
        setupAttributes(attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {
        init()
        setupAttributes(attrs)
    }

    private fun init() {
        View.inflate(context, R.layout.albumview, this)

        this.f1 = findViewById(R.id.f1) as ImageView

        this.ff1 = findViewById(R.id.ff1) as ImageView
        this.ff2 = findViewById(R.id.ff2) as ImageView

        this.fff1 = findViewById(R.id.fff1) as ImageView
        this.fff2 = findViewById(R.id.ffff3) as ImageView
        this.fff3 = findViewById(R.id.ffff4) as ImageView

        this.ffff1 = findViewById(R.id.ffff1) as ImageView
        this.ffff2 = findViewById(R.id.ffff2) as ImageView
        this.ffff3 = findViewById(R.id.ffff3) as ImageView
        this.ffff4 = findViewById(R.id.ffff4) as ImageView

    }

    private fun setupAttributes(attrs: AttributeSet?) {
        val a = context.obtainStyledAttributes(attrs, R.styleable.AlbumView, 0, 0);
        // how to correctly get scale type defined in xml ?
        val scaleTypeIndex = a.getInt(R.styleable.AlbumView_scaleType, 1);
        when(scaleTypeIndex) {

            1 -> {
                f1?.setScaleType(ImageView.ScaleType.CENTER_CROP);

                ff1?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ff2?.setScaleType(ImageView.ScaleType.CENTER_CROP);

                fff1?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                fff2?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                fff3?.setScaleType(ImageView.ScaleType.CENTER_CROP);

                ffff1?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ffff2?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ffff3?.setScaleType(ImageView.ScaleType.CENTER_CROP);
                ffff4?.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            else -> {
                f1?.setScaleType(ImageView.ScaleType.FIT_CENTER);

                ff1?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ff2?.setScaleType(ImageView.ScaleType.FIT_CENTER);

                fff1?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                fff2?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                fff3?.setScaleType(ImageView.ScaleType.FIT_CENTER);

                ffff1?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ffff2?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ffff3?.setScaleType(ImageView.ScaleType.FIT_CENTER);
                ffff4?.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }

        }
        a.recycle()
    }
}