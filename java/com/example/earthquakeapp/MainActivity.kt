package com.example.earthquakeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Arrayadpater:Informationadapter;
        val information = ArrayList<Information>()
        information.add(Information("5.0","39km W OF","Almaty,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.color_reeed))
        information.add(Information("4.0","55km S OF","Kokshetau,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.circle_orange))
        information.add(Information("2.0","40km W OF","Kostanay,Kazakhsatan","Oct 05,2022","5:11pm",R.drawable.circle_yellow))
        information.add(Information("3.0","38km E OF","Karagandy,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.circle_orange))
        information.add(Information("4.0","39km N OF","Atyrau,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.circle_orange))
        information.add(Information("1.0","35km S OF","Aktau,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.circle_yellow))
        information.add(Information("9.0","51km W OF","Uskemen,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.color_reeed))
        information.add(Information("5.0","21km W OF","Zhezkazgan,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.color_reeed))
        information.add(Information("7.5","33km W OF","Ekibastuz,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.color_reeed))
        information.add(Information("5.0","31km W OF","Pavlodar,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.color_reeed))
        information.add(Information("3.0","34km W OF","Astana,Kazakhstan","Oct 05,2022","5:11pm",R.drawable.circle_orange))
        val listView = findViewById<ListView>(R.id.listView)
        Arrayadpater = Informationadapter(
            this,
            information,

            )
        listView.adapter= Arrayadpater



    }
}