package com.example.prak3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prak3.HasilActivity.Companion.DATA_KELAMIN
import com.example.prak3.HasilActivity.Companion.DATA_NAMA
import com.example.prak3.HasilActivity.Companion.DATA_SETUJU
import com.example.prak3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var jenisKelamin = ""
    private var tampilSetuju = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            btnSubmit.setOnClickListener {
                val nama = isinama.text.toString()
                if (rdb1.isChecked) {
                    jenisKelamin = "Laki-laki"
                }
                if (rdb2.isChecked) {
                    jenisKelamin = "Perempuan"
                }
                tampilSetuju = checkAgree.isChecked()
                val intent = Intent(this@MainActivity,HasilActivity::class.java)
                    .putExtra(DATA_NAMA,nama)
                    .putExtra(DATA_KELAMIN,jenisKelamin)
                    .putExtra(DATA_SETUJU,tampilSetuju)
                startActivity(intent)
            }
        }
    }
}