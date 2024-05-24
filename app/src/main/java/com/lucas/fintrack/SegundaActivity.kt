package com.lucas.fintrack

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.lucas.fintrack.databinding.ActivitySegundaBinding

class SegundaActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySegundaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_segunda)
        binding = ActivitySegundaBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.Done2.setOnClickListener {
            val intent = Intent(this,TerceiraActivity::class.java)
            startActivity(intent)
        }
        val rvDado = findViewById<RecyclerView>(R.id.rv_dado)

    }
}