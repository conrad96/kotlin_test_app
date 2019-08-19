package  com.example.kotlin_test_app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //get values from views
        var counter = 0
        var counter_text = findViewById(R.id.counter_text) as TextView
        var subtract = findViewById(R.id.minusBtn) as Button
        var add = findViewById(R.id.plusBtn) as Button
        //button clicks
        subtract.setOnClickListener {
            counter--
            counter_text.setText(counter)
        }

        add.setOnClickListener {
            counter++
            counter_text.setText(counter)
        }

    }
}