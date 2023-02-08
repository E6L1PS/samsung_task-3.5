package com.example.fragments34

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn: Button = findViewById(R.id.button)

        var boolean = false
        btn.setOnClickListener {

            if (boolean) {
                loadFragments(RedFragment(), BlueFragment())
            } else {
                loadFragments(BlueFragment(), RedFragment())
            }

            boolean = !boolean
        }
    }

    private fun loadFragments(f1: Fragment, f2: Fragment) {
        val fm: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = fm.beginTransaction()
        ft.replace(R.id.fragment1, f1)
        ft.replace(R.id.fragment2, f2)
        ft.commit()
    }
}