package com.example.mypet

import android.database.sqlite.SQLiteDatabase
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SharePage: AppCompatActivity() {

    lateinit var puppyImg :ImageView
    lateinit var puppyNameT: TextView
    lateinit var shareIdEditT:EditText
    lateinit var shareButton: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.share_page)

        puppyImg = findViewById(R.id.puppyImg)
        puppyNameT=findViewById(R.id.puppyNameT)
        shareIdEditT=findViewById(R.id.shareIdEditT)
        shareButton=findViewById(R.id.shareButton)

    }
}