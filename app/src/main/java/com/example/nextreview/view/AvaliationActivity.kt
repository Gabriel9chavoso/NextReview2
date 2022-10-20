package com.example.nextreview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.datastore.preferences.core.floatPreferencesKey
import androidx.lifecycle.lifecycleScope
import com.example.nextreview.R
import com.example.nextreview.preferences.dataStore
import kotlinx.android.synthetic.main.activity_avaliation.*
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class AvaliationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_avaliation)

        val id = intent.getSerializableExtra("id")

        lifecycleScope.launch {

            // Organização
            val dataid1rat1 = floatPreferencesKey("1rating1")
            val dataid2rat1 = floatPreferencesKey("2rating1")
            val dataid3rat1 = floatPreferencesKey("3rating1")


            val dataid1rat2 = floatPreferencesKey("1rating1")
            val dataid2rat2 = floatPreferencesKey("2rating2")
            val dataid3rat2 = floatPreferencesKey("3rating2")


            val dataid1rat3 = floatPreferencesKey("1rating3")
            val dataid2rat3 = floatPreferencesKey("2rating3")
            val dataid3rat3 = floatPreferencesKey("3rating3")


            val dataid1rat4 = floatPreferencesKey("1rating4")
            val dataid2rat4 = floatPreferencesKey("2rating4")
            val dataid3rat4 = floatPreferencesKey("3rating4")


            // Participação
            val dataid1rat5 = floatPreferencesKey("1rating5")
            val dataid2rat5 = floatPreferencesKey("2rating5")
            val dataid3rat5 = floatPreferencesKey("3rating5")


            val dataid1rat6 = floatPreferencesKey("1rating6")
            val dataid2rat6 = floatPreferencesKey("2rating6")
            val dataid3rat6 = floatPreferencesKey("3rating6")


            val dataid1rat7 = floatPreferencesKey("1rating7")
            val dataid2rat7 = floatPreferencesKey("2rating7")
            val dataid3rat7 = floatPreferencesKey("3rating7")


            val dataid1rat8 = floatPreferencesKey("1rating8")
            val dataid2rat8 = floatPreferencesKey("2rating8")
            val dataid3rat8 = floatPreferencesKey("3rating8")


            // Alimentação
            val dataid1rat9 = floatPreferencesKey("1rating9")
            val dataid2rat9 = floatPreferencesKey("2rating9")
            val dataid3rat9 = floatPreferencesKey("3rating9")


            val dataid1rat10 = floatPreferencesKey("1rating10")
            val dataid2rat10 = floatPreferencesKey("2rating10")
            val dataid3rat10 = floatPreferencesKey("3rating10")


            val dataid1rat11 = floatPreferencesKey("1rating11")
            val dataid2rat11 = floatPreferencesKey("2rating11")
            val dataid3rat11 = floatPreferencesKey("3rating11")


            val dataid1rat12 = floatPreferencesKey("1rating12")
            val dataid2rat12 = floatPreferencesKey("2rating12")
            val dataid3rat12 = floatPreferencesKey("3rating12")


            // Recomendação
            val dataid1rat13 = floatPreferencesKey("1rating13")
            val dataid2rat13 = floatPreferencesKey("2rating13")
            val dataid3rat13 = floatPreferencesKey("3rating13")


            val dataid1rat14 = floatPreferencesKey("1rating14")
            val dataid2rat14 = floatPreferencesKey("2rating14")
            val dataid3rat14 = floatPreferencesKey("3rating14")


            val dataid1rat15 = floatPreferencesKey("1rating15")
            val dataid2rat15 = floatPreferencesKey("2rating15")
            val dataid3rat15 = floatPreferencesKey("3rating15")


            // Organização
            val id1rat1 = dataStore.data.first()[dataid1rat1]
            val id2rat1 = dataStore.data.first()[dataid2rat1]
            val id3rat1 = dataStore.data.first()[dataid3rat1]


            val id1rat2 = dataStore.data.first()[dataid3rat2]
            val id2rat2 = dataStore.data.first()[dataid3rat2]
            val id3rat2 = dataStore.data.first()[dataid3rat2]


            val id1rat3 = dataStore.data.first()[dataid3rat3]
            val id2rat3 = dataStore.data.first()[dataid3rat3]
            val id3rat3 = dataStore.data.first()[dataid3rat3]


            val id1rat4 = dataStore.data.first()[dataid3rat4]
            val id2rat4 = dataStore.data.first()[dataid3rat4]
            val id3rat4 = dataStore.data.first()[dataid3rat4]


            // Participação
            val id1rat5 = dataStore.data.first()[dataid3rat5]
            val id2rat5 = dataStore.data.first()[dataid3rat5]
            val id3rat5 = dataStore.data.first()[dataid3rat5]


            val id1rat6 = dataStore.data.first()[dataid3rat6]
            val id2rat6 = dataStore.data.first()[dataid3rat6]
            val id3rat6 = dataStore.data.first()[dataid3rat6]


            val id1rat7 = dataStore.data.first()[dataid3rat7]
            val id2rat7 = dataStore.data.first()[dataid3rat7]
            val id3rat7 = dataStore.data.first()[dataid3rat7]


            val id1rat8 = dataStore.data.first()[dataid3rat8]
            val id2rat8 = dataStore.data.first()[dataid3rat8]
            val id3rat8 = dataStore.data.first()[dataid3rat8]


            // Alimentação
            val id1rat9 = dataStore.data.first()[dataid3rat9]
            val id2rat9 = dataStore.data.first()[dataid3rat9]
            val id3rat9 = dataStore.data.first()[dataid3rat9]


            val id1rat10 = dataStore.data.first()[dataid3rat10]
            val id2rat10 = dataStore.data.first()[dataid3rat10]
            val id3rat10 = dataStore.data.first()[dataid3rat10]


            val id1rat11 = dataStore.data.first()[dataid3rat11]
            val id2rat11 = dataStore.data.first()[dataid3rat11]
            val id3rat11 = dataStore.data.first()[dataid3rat11]


            val id1rat12 = dataStore.data.first()[dataid3rat12]
            val id2rat12 = dataStore.data.first()[dataid3rat12]
            val id3rat12 = dataStore.data.first()[dataid3rat2]


            // Recomendação
            val id1rat13 = dataStore.data.first()[dataid3rat13]
            val id2rat13 = dataStore.data.first()[dataid3rat13]
            val id3rat13 = dataStore.data.first()[dataid3rat13]


            val id1rat14 = dataStore.data.first()[dataid3rat14]
            val id2rat14 = dataStore.data.first()[dataid3rat14]
            val id3rat14 = dataStore.data.first()[dataid3rat14]


            val id1rat15 = dataStore.data.first()[dataid3rat15]
            val id2rat15 = dataStore.data.first()[dataid3rat15]
            val id3rat15 = dataStore.data.first()[dataid3rat15]


            val org1 = (id1rat1!! + id2rat1!! + id3rat1!!) / 3
            val org2 = (id1rat2!! + id2rat2!! + id3rat2!!) / 3
            val org3 = (id1rat3!! + id2rat3!! + id3rat3!!) / 3
            val org4 = (id1rat4!! + id2rat4!! + id3rat4!!) / 3

            val part1 = (id1rat5!! + id2rat5!! + id3rat5!!) / 3
            val part2 = (id1rat6!! + id2rat6!! + id3rat6!!) / 3
            val part3 = (id1rat7!! + id2rat7!! + id3rat7!!) / 3
            val part4 = (id1rat8!! + id2rat8!! + id3rat8!!) / 3

            val ali1 = (id1rat9!! + id2rat9!! + id3rat9!!) / 3
            val ali2 = (id1rat10!! + id2rat10!! + id3rat10!!) / 3
            val ali3 = (id1rat11!! + id2rat11!! + id3rat11!!) / 3
            val ali4 = (id1rat12!! + id2rat12!! + id3rat12!!) / 3


            val rec1 = (id1rat13!! + id2rat13!! + id3rat13!!) / 3
            val rec2 = (id1rat14!! + id2rat14!! + id3rat14!!) / 3
            val rec3 = (id1rat15!! + id2rat15!! + id3rat15!!) / 3


            val medOrg = (org1 + org2 + org3 + org4) / 4
            val medPart = (part1 + part2 + part3 + part4) / 4
            val medAli = (ali1 + ali2 + ali3 + ali4) / 4
            val medRec = (rec1 + rec2 + rec3) / 3


            tv_otganizacao.text = medOrg.toString()
            tv_alimentacao.text = medAli.toString()
            tv_participacao.text = medPart.toString()
            tv_recomendacao.text = medRec.toString()


        }
    }
}