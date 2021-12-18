package ru.anasoft.kotlin_1_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
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

        // примеры циклов
        val weatherList: List<Weather> = listOf(city1, city2)
        for(weather in weatherList) Log.d("Anasoft", weather.toString())

        for(i in 1..5) {
            Log.d("Anasoft", "$i. $city1")
        }

        for(i in 9 downTo 1 step 2) {
            Log.d("Anasoft", "$city1$i")
        }

        var city3 = city1.copy()
        while (city1.equals(city3)) {
            Log.d("Anasoft", "${city1.temperature} = ${city2.temperature}")
            city3 = Weather("Казань", -3)
        }

    }
}