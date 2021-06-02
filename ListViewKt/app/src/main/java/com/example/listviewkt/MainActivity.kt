package com.example.listviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.listviewkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding

    var UserList = arrayListOf<User>(
        User(R.drawable.pepeb,"1번친구","28","안녕하세요~"),
        User(R.drawable.pepeb,"2번친구","29","안녕하세요123~"),
        User(R.drawable.pepeb,"3번친구","26","안녕하세요456~"),
        User(R.drawable.pepeb,"4번친구","29","안녕하세요123~"),
        User(R.drawable.pepeb,"5번친구","26","안녕하세요456~"),
        User(R.drawable.pepeb,"6번친구","29","안녕하세요123~"),
        User(R.drawable.pepeb,"7번친구","26","안녕하세요456~")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val item = arrayOf("1번","2번","3번","4번","5번")
//        binding.listView.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,item)


        val Adapter = UserAdapter(this,UserList)
        binding.listView.adapter = Adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener{parent,view,position,id->
            val selectItem = parent.getItemAtPosition(position) as User
            Toast.makeText(this,selectItem.name,Toast.LENGTH_SHORT).show()
        }
    }
}