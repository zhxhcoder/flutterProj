package com.zhxh.flutterProj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhxh.base.BaseMainActivity
import kotlinx.android.synthetic.main.activity_main.*

/// @time：2/8/22
/// @author zhxh
/// @description：
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toBaseMain.setOnClickListener {
            startActivity(Intent(this, BaseMainActivity::class.java))
        }
    }
}