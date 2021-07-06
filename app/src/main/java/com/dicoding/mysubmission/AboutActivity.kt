package com.dicoding.mysubmission

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class AboutActivity : AppCompatActivity() {
    private var title:String = "About"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        setActionTitleBar(title)

    }

    private fun setActionTitleBar(title:String) {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title=title
    }
}