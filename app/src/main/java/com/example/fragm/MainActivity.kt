package com.example.fragm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var Estfrag:Boolean=true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener{

            val fragmento2 = fragmento2()
            val fragmento3 = fragmento3()
            val manager = supportFragmentManager
            val transaction = manager.beginTransaction()

            if (Estfrag) {
                Estfrag = false
                transaction.replace(R.id.scroll, fragmento3)
                transaction.addToBackStack(null)
                transaction.commit()

            } else {
                Estfrag = true
                transaction.replace(R.id.scroll, fragmento2)
                transaction.addToBackStack(null)
                transaction.commit()
            }

        }

    }
}
