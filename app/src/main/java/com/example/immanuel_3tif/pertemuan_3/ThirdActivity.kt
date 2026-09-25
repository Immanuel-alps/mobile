package com.example.immanuel_3tif.pertemuan_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.immanuel_3tif.R
import com.example.immanuel_3tif.databinding.ActivityThirdBinding

class ThirdActivity : AppCompatActivity() {

    private lateinit var binding: ActivityThirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityThirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 1. Blok khusus untuk mengatur padding layar (Edge to Edge)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets // Harus berada di baris paling akhir dari blok listener ini
        }

        // 2. Kode logika aplikasi di luar listener window insets
        val inputNoTujuan = binding.inputNoTujuan.text
        val btnKirim = findViewById<Button>(R.id.btnKirim)

        binding.btnKirim.setOnClickListener {
            val teks = binding.inputNoTujuan.text
            Toast.makeText(this, "Pesan berhasil dikirim ke $teks", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ThirdResultActivity::class.java)
            startActivity(intent)
        }
    }
}