package com.example.nextreview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.nextreview.view.QuestionaryActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        bt_1.setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionaryActivity::class.java)
            intent.putExtra("id", 1)
            startActivity(intent)
        }

        bt_2.setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionaryActivity::class.java)
            intent.putExtra("id", 2)
            startActivity(intent)
        }

        bt_3.setOnClickListener {
            val intent = Intent(this@MainActivity, QuestionaryActivity::class.java)
            intent.putExtra("id", 3)
            startActivity(intent)
        }


    }
}