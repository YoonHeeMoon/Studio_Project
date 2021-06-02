package com.example.textvuewkt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.textvuewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var mBinding: ActivityMainBinding? = null
    private val binding get() = mBinding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main) // xml화면 뷰 연결
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tvTitle.setText("Change the world")
        binding.btnA.setOnClickListener{
            val intent = Intent(this,imageActivity :: class.java)
            intent.putExtra("msg",binding.tvTitle.text.toString())
            startActivity(intent)   // intent에 저장된곳으로 이
            finish() //자기자신 액티비티 파괴
        }
    }
}