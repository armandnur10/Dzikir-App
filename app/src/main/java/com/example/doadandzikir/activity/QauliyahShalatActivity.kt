package com.example.doadandzikir.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.model.DataDzikirDoa
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.R

class QauliyahShalatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_qauliyah_shalat)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvQauliyah = findViewById<RecyclerView>(R.id.rv_qauliyah_shalat)
        rvQauliyah.layoutManager = LinearLayoutManager(this)
        rvQauliyah.adapter = DzikirDoaAdapter(DataDzikirDoa.listQauliyah)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}