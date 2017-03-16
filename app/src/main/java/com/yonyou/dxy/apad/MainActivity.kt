package com.yonyou.dxy.apad

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.Window
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        setContentView(R.layout.activity_main)

        virtualbtn.setOnClickListener {
            startActivity(Intent(MainActivity@ this, BokeActivity::class.java))

        }

        scanrfid.setOnClickListener {


        }
    }
}