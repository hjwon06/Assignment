package com.example.threeweekassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.threeweekassignment.databinding.ActivityMainBinding
import com.example.threeweekassignment.databinding.ChatBinding

class Chat : AppCompatActivity() {

    lateinit var binding: ChatBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding = ChatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var name = intent.getStringExtra("name")
        var stateName = intent.getStringExtra("stateName")
        binding.proName.text = name

        binding.clo.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            //intent.putExtra("name","test")
            startActivity(intent)
        }

        binding.msg.setOnClickListener{
            var intent = Intent(this,ChatList::class.java)
            intent.putExtra("name",name)
            intent.putExtra("msg",stateName)
            startActivity(intent)
        }


    }
}