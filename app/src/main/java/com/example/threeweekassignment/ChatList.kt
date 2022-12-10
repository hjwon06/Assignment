package com.example.threeweekassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.threeweekassignment.databinding.FrelistBinding

class ChatList: AppCompatActivity() {

    lateinit var binding: FrelistBinding
    var frendsList = arrayListOf<FrendsList>()
    val frendChatAdapter = FrendChatAdapter(frendsList)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FrelistBinding.inflate(layoutInflater)
        val view = binding.root

        binding.mainT.setOnClickListener{
            var intent = Intent(this,MainActivity::class.java)
            //intent.putExtra("name","test")
            startActivity(intent)
        }

        initializeViews()
        setContentView(view)
    }


    private fun initializeViews() {
        var name = intent.getStringExtra("name")
        var msg = intent.getStringExtra("msg")
        frendsList.add(FrendsList(name = name, stateName = msg))
        // 레이아웃 매니저와 어댑터 설정
        binding.freList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.freList.adapter = frendChatAdapter


    }

}

