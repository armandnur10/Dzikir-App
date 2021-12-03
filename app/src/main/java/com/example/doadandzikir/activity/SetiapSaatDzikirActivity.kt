package com.example.doadandzikir.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.doadandzikir.model.DataDzikirDoa
import com.example.doadandzikir.adapter.DzikirDoaAdapter
import com.example.doadandzikir.R

class SetiapSaatDzikirActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setiap_saat_dzikir)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val rvSetiapSaatDzikirActivity = findViewById<RecyclerView>(R.id.rv_dzikir_setiap_saat)
        rvSetiapSaatDzikirActivity.layoutManager = LinearLayoutManager(this)
        rvSetiapSaatDzikirActivity.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikir)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}