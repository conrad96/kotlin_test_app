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

        //get reference to views
        var username = findViewById(R.id.et_user_name) as EditText
        var password = findViewById(R.id.et_password) as EditText
        var button_login = findViewById(R.id.btn_submit) as Button
        var button_reset = findViewById(R.id.btn_reset) as Button

        button_reset.setOnClickListener {
            username.setText("")
            password.setText("")
        }
        button_login.setOnClickListener {
            val _username = username.text
            val _password = password.text
            Toast.makeText(this@MainActivity, _password, Toast.LENGTH_LONG).show()
        }
    }
}