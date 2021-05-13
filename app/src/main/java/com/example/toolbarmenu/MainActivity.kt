package com.example.toolbarmenu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.tool_bar_menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.home -> {
                val intentHome = Intent(this@MainActivity,Home::class.java)
                startActivity(intentHome)
            }
            R.id.about -> {
                val intentAbout = Intent(this@MainActivity,About::class.java)
                startActivity(intentAbout)
            }
        }
        return true
    }
}