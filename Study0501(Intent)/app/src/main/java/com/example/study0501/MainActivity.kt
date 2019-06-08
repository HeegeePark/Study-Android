package com.example.study0501

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        gotosub1.setOnClickListener {
            // 에딧텍스트에 입력한 데이터 얻기
            et_hello.clearComposingText()
            val intent1 = Intent(applicationContext,Sub1Activity::class.java)
            var mytext = et_hello.text.toString()       //input은 바뀔 수 있으니 변경 가능한 var로 선언
            intent1.putExtra("text",mytext)

            startActivity(intent1)

        }
    }
}
