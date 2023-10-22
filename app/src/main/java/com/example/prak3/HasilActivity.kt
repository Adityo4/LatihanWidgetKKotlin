package com.example.prak3

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prak3.databinding.ActivityHasilBinding


class HasilActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHasilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHasilBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val nama = intent.getStringExtra(DATA_NAMA)
        val jenisKelamin = intent.getStringExtra(DATA_KELAMIN)
        val resultSetuju = intent.getBooleanExtra(DATA_SETUJU,false)
        binding.apply {
            tampilNama.text = nama
            tampilJenisKelamin.text = jenisKelamin
            if(jenisKelamin=="Laki-laki"){
                tampilJenisKelamin.setBackgroundColor(Color.GRAY)
            }
            if(jenisKelamin=="Perempuan"){
                tampilJenisKelamin.setBackgroundColor(Color.MAGENTA)
            }
            if(resultSetuju==true){
                tampilSetuju.setText("Data yang diisikan benar")
                tampilSetuju.setBackgroundColor(Color.GREEN)
            }else{
                tampilSetuju.setText("Ada yang salah!")
                tampilSetuju.setBackgroundColor(Color.RED)
            }
        }
    }
    companion object{
        const val DATA_NAMA = "data_nama"
        const val DATA_KELAMIN = "data_kelamin"
        const val DATA_SETUJU = "data_setuju"
    }
}