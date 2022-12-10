package com.example.threeweekassignment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.threeweekassignment.databinding.ActivityMainBinding


data class Profile(val name:String)
class MainActivity : AppCompatActivity() {

    private lateinit var itemAdapter: ItemAdapter
    lateinit var binding: ActivityMainBinding
    var UpdateProfileList = arrayListOf<ItemList>() // 아이템 배열
    var FrendsList = arrayListOf<FrendsList>()

    val ListAdapter = ItemAdapter(UpdateProfileList)
    val FrendAdapter = FrendAdapter(FrendsList) // 어댑터
    val stateArray = arrayOf<String>("하나","둘","셋","넷","다섯","여섯","일곱","여덟","아홉","열","화창","좋은","우울","화남","별루")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        binding.pro.setOnClickListener{
            var intent = Intent(this,Chat::class.java)
            //intent.putExtra("name","test")
            startActivity(intent)
        }
        initializeViews()

    }



    private fun initializeViews() {

        // 레이아웃 매니저와 어댑터 설정
        binding.rvList.adapter = ListAdapter

        binding.freList.adapter = FrendAdapter

        //친구 추천 리스트
        for (i in 0..20){
            UpdateProfileList.add(ItemList(name = "황지원" + i))
        }

        //친구 리스트
        for (i in 0..14) {
            FrendsList.add(FrendsList(name = "황" + i, stateName = stateArray[i]))
        }

        binding.upFrendTxt.text = "업데이트한 친구 " + UpdateProfileList.size
        binding.listTxt.text = "친구 " + FrendsList.size
    }

}

