package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Gunakan kelas ClassName di sini
        val obj = ClassName()
        obj.method()
    }

    // Deklarasi kelas ClassName
    class ClassName {
        fun method() {
            // Contoh method dari ClassName
            Toast.makeText(this, "Hello from ClassName!", Toast.LENGTH_SHORT).show()
        }
    }
}
