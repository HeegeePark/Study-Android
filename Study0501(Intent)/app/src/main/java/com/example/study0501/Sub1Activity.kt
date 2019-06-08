package com.example.study0501

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sub1.*

class Sub1Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub1)

        bt_close.setOnClickListener {
            // subactivity를 그냥 끄기
            //finish()

            // 인텐트로 메인액티비티로 액티비티 전환
            val intent_main = Intent(applicationContext,MainActivity::class.java)
            startActivity(intent_main)
        }

        // 메인액티비티 putextra에서 받은 텍스트를 get해서 서브액티비티에 띄우기
        val mytext2 = intent.getStringExtra("text")
        Toast.makeText(applicationContext,mytext2,Toast.LENGTH_LONG).show()
    }
}
