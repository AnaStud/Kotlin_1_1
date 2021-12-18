package ru.anasoft.kotlin_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOk = findViewById<Button>(R.id.button_ok)
        buttonOk.setOnClickListener {
            Toast.makeText(this, getString(R.string.message_text), Toast.LENGTH_LONG).show()
        }

        val textWeather = findViewById<TextView>(R.id.text_view_weather)
        textWeather.text = Weather("Москва", -5).toString()

        val city1 = Weather("Уфа", -1)
        val city2 = city1.copy()
        textWeather.text = textWeather.text as String + "\n" + city2.toString()

    }
}