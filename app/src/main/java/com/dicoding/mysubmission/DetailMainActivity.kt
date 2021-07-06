package com.dicoding.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class DetailMainActivity : AppCompatActivity() {
//    private lateinit var rvImageView: ImageView
//    private lateinit var rvIntrumentNames : TextView
//    private lateinit var rvInstrumentBahan :TextView
//    private lateinit var rvInstrumentJenis :TextView
//    private lateinit var rvInstrumentTahun :TextView
//    private lateinit var rvInstrumentDetail : TextView

    companion object{
        const val EXTRA_IMAGE = "extra_name"
        const val EXTRA_NAMES = "extra_names_1"
        const val EXTRA_DETAIL = "extra_detail"
        const val EXTRA_JENIS = "extra_jenis"
        const val EXTRA_BAHAN = "extra_bahan"
        const val EXTRA_YEAR = "extra_year"
    }

    private val title : String = "Detail Alat Musik"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_main)
        setActionBarTitle(title)
        var rvImageView : ImageView = findViewById(R.id.img_item)
        var rvInstrumentNames : TextView = findViewById(R.id.tv_item_name)
        var rvInstrumentDetails : TextView = findViewById(R.id.tv_item_detail)
        var rvInstrumentJenis : TextView = findViewById(R.id.tv_item_jenis)
        var rvInstrumentBahan : TextView = findViewById(R.id.tv_item_bahan)
        var rvInstrumentTahun : TextView = findViewById(R.id.tv_item_tahun)

        val instrumentImg = intent.getIntExtra(EXTRA_IMAGE,0)
        val instrumentName = intent.getStringExtra(EXTRA_NAMES)
        val instrumentDetail = intent.getStringExtra(EXTRA_DETAIL)
        val instrumentJenis = intent.getStringExtra(EXTRA_JENIS)
        val instrumentBahan = intent.getStringExtra(EXTRA_BAHAN)
        val instrumentTahun = intent.getStringExtra(EXTRA_YEAR)

        rvImageView.setImageResource(instrumentImg)
        rvInstrumentNames.text = instrumentName
        rvInstrumentDetails.text=instrumentDetail
        rvInstrumentJenis.text = instrumentJenis
        rvInstrumentBahan.text = instrumentBahan
        rvInstrumentTahun.text = instrumentTahun
    }
    private fun setActionBarTitle(title:String){
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=title
    }

}