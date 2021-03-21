package com.example.tema1.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.tema1.R
import com.example.tema1.fragments.ForthFragment
import com.example.tema1.fragments.SecondFragment
import com.example.tema1.fragments.ThirdFragment

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var fragment=SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

    fun CloseApp(view: View)
    {
     this.finish()
    }
    fun toThirdFragment(view: View)
    {
        var fragment=ForthFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }
    fun toSecondFragment(view: View)
    {
        var fragment=ThirdFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }
    fun toFirstFragment(view: View)
    {
        var fragment=SecondFragment()
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.FrameLayout,fragment)
            commit()
        }

    }
}