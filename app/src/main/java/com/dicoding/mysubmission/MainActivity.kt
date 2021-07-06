package com.dicoding.mysubmission

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var rvInstrument: RecyclerView
    private var list:ArrayList<Instrument> = arrayListOf()
    private var title:String = "Alat Musik"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvInstrument  = findViewById(R.id.rv_instrument)
        rvInstrument.setHasFixedSize(true)

        list.addAll(InstrumentData.listData)
        showRecyclerList()

        setActionBarTitle(title)

    }

    private fun showRecyclerGrid(){
        rvInstrument.layoutManager = GridLayoutManager(this,2)
        val gridInstrumentAdapter = GridInstrumentAdapter(list)
        rvInstrument.adapter = gridInstrumentAdapter

        gridInstrumentAdapter.setOnItemClickCallback(object : GridInstrumentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Instrument) {
//                showSelectedInstrument(data)
                showDetailItem(data)
            }
        })
    }

    private fun showRecyclerList(){
        rvInstrument.layoutManager = LinearLayoutManager(this)
        val listInstrumentAdapter = ListInstrumentAdapter(list)
        rvInstrument.adapter = listInstrumentAdapter

        listInstrumentAdapter.setOnItemClickCallback(object : ListInstrumentAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Instrument) {
//                showSelectedInstrument(data)
                showDetailItem(data)
            }
        })
    }

    private fun showAbout(){
        val moveIntent = Intent(this@MainActivity, AboutActivity::class.java)
        startActivity(moveIntent)
    }
//    private fun showRecyclerCardView(){
//        rvInstrument.layoutManager= LinearLayoutManager(this)
//        val cardViewAdapter = CardViewAdapter(list)
//        rvInstrument.adapter = cardViewAdapter
//
//    }

    private fun setActionBarTitle(title:String) {
        supportActionBar?.title = title
    }
//    private fun showSelectedInstrument(instrument: Instrument) {
//        Toast.makeText(this, "Kamu memilih " + instrument.name, Toast.LENGTH_SHORT).show()
//    }

    private fun showDetailItem(item:Instrument){
        val moveToDetail = Intent(this@MainActivity, DetailMainActivity::class.java)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_IMAGE, item.photo)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_NAMES, item.name)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_DETAIL, item.detail)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_JENIS, item.jenis)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_BAHAN, item.bahan)
        moveToDetail.putExtra(DetailMainActivity.EXTRA_YEAR, item.tahun)
        startActivity(moveToDetail)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when(selectedMode){
            R.id.action_list->{
                title = "Alat Musik"
            showRecyclerList()
            }
            R.id.action_grid->{
                title = "Alat Musik"
            showRecyclerGrid()
            }
            R.id.about_dev->{
                title ="About"
            showAbout()
            }
        }
        setActionBarTitle(title)
    }

}