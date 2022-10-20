package com.example.nextreview.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import com.example.nextreview.R
import com.example.nextreview.preferences.dataStore
import kotlinx.android.synthetic.main.activity_questionary.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class QuestionaryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionary)


        ratingBar.setOnRatingBarChangeListener { ratingBar, int, b ->


            tv_rating.text = int.toString()

        }



        ratingBar2.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating2.text = int.toString()

        }

        ratingBar3.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating3.text = int.toString()

        }

        ratingBar4.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating4.text = int.toString()

        }

        ratingBar5.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating5.text = int.toString()

        }

        ratingBar6.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating6.text = int.toString()

        }

        ratingBar7.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating7.text = int.toString()

        }

        ratingBar8.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating8.text = int.toString()

        }

        ratingBar9.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating9.text = int.toString()

        }

        ratingBar10.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating10.text = int.toString()

        }

        ratingBar11.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating11.text = int.toString()

        }

        ratingBar12.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating12.text = int.toString()

        }

        ratingBar13.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating13.text = int.toString()

        }

        ratingBar14.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating14.text = int.toString()

        }

        ratingBar15.setOnRatingBarChangeListener { ratingBar, int, b ->

            tv_rating15.text = int.toString()

        }


        bt_questionary.setOnClickListener() {
            addReview()
            Toast.makeText(this, "Obrigado por avaliar", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, AvaliationActivity::class.java)
            startActivity(intent)

        }



    }



    private fun addReview() {

        val id = intent.getSerializableExtra("id")

        val rating1 = ratingBar.rating
        val rating2 = ratingBar2.rating
        val rating3 = ratingBar3.rating
        val rating4 = ratingBar4.rating
        val rating5 = ratingBar5.rating
        val rating6 = ratingBar6.rating
        val rating7 = ratingBar7.rating
        val rating8 = ratingBar8.rating
        val rating9 = ratingBar9.rating
        val rating10 = ratingBar10.rating
        val rating11 = ratingBar11.rating
        val rating12 = ratingBar12.rating
        val rating13 = ratingBar13.rating
        val rating14 = ratingBar14.rating
        val rating15 = ratingBar15.rating


        val rat1 = floatPreferencesKey("${id}rating1")
        val rat2 = floatPreferencesKey("${id}rating2")
        val rat3 = floatPreferencesKey("${id}rating3")
        val rat4 = floatPreferencesKey("${id}rating4")
        val rat5 = floatPreferencesKey("${id}rating5")
        val rat6 = floatPreferencesKey("${id}rating6")
        val rat7 = floatPreferencesKey("${id}rating7")
        val rat8 = floatPreferencesKey("${id}rating8")
        val rat9 = floatPreferencesKey("${id}rating9")
        val rat10 = floatPreferencesKey("${id}rating10")
        val rat11 = floatPreferencesKey("${id}rating11")
        val rat12 = floatPreferencesKey("${id}rating12")
        val rat13 = floatPreferencesKey("${id}rating13")
        val rat14 = floatPreferencesKey("${id}rating14")
        val rat15 = floatPreferencesKey("${id}rating15")

        CoroutineScope(Dispatchers.IO).launch {


            dataStore.edit { REVIEW ->

                REVIEW[rat1] = rating1
                REVIEW[rat2] = rating2
                REVIEW[rat3] = rating3
                REVIEW[rat4] = rating4
                REVIEW[rat5] = rating5
                REVIEW[rat6] = rating6
                REVIEW[rat7] = rating7
                REVIEW[rat8] = rating8
                REVIEW[rat9] = rating9
                REVIEW[rat10] = rating10
                REVIEW[rat11] = rating11
                REVIEW[rat12] = rating12
                REVIEW[rat13] = rating13
                REVIEW[rat14] = rating14
                REVIEW[rat15] = rating15


            }


        }

    }
}