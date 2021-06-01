package com.example.textvuewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
    }
}