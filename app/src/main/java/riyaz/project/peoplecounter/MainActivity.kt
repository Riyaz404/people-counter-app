package riyaz.project.peoplecounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvclicked = 0
        var tvIntput = findViewById<TextView>(R.id.count)
        var btn: Button = findViewById<Button>(R.id.button) as Button
        var txtReset: TextView = findViewById<TextView>(R.id.count) as TextView


        btn.setOnClickListener {
            tvclicked += 1
            tvIntput.text = tvclicked.toString()
        }
        txtReset.setOnClickListener {
            tvclicked = 0
            tvIntput.text = "0"
        }
    }

}