package com.example.textvuewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.textvuewkt.databinding.ActivityImageBinding
import com.example.textvuewkt.databinding.ActivityMainBinding

class imageActivity : AppCompatActivity() {
    private lateinit var binding: ActivityImageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_image)
        setContentView(binding.root)

        binding.btnToast.setOnClickListener{
            Toast.makeText(this@imageActivity,"클릭",Toast.LENGTH_SHORT ).show()
        }
    }
}