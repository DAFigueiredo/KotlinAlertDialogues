package com.example.kotlinalertdialogues

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun save(view: View) {
        val alert = AlertDialog.Builder(this)

        alert.setTitle("Save")
        alert.setMessage("Are you sure you want to save?")
        alert.setPositiveButton("Yes") {
                dialogInterface: DialogInterface, i:Int -> Toast.makeText(applicationContext,"Saved",Toast.LENGTH_SHORT).show()
        }
        alert.setNegativeButton("No") {
                dialogInterface: DialogInterface, i:Int -> Toast.makeText(applicationContext,"Discarded",Toast.LENGTH_SHORT).show()
        }
        alert.show()
    }
}