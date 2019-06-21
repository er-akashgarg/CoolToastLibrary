package com.akashgarg.cooltoastlibrary

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.akashgarg.cooltoast.CoolToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnSuccessToast.setOnClickListener {
            CoolToast.successToast(this, "Success Toast!")
                .setPadding(10)
                .setTextSize(18f)

        }

        btnErrorToast.setOnClickListener {
            CoolToast.errorToast(this, "Error Toast!")
                .setPadding(10)
                .setTextSize(18f)
        }

        btnCustomToast.setOnClickListener {
            CoolToast.customToast(this, "Error Toast!", R.color.colorAccent, R.color.black)
                .setPadding(10)
                .setTextSize(18f)
        }
    }
}
