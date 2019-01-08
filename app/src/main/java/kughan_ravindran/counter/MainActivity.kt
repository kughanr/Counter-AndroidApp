package kughan_ravindran.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var count : Int = currentCount.text.toString().toInt()

        incrementButton.setOnClickListener {
            count++
            currentCount.text = "$count"
        }

        resetButton.setOnClickListener {
            count = 0
            currentCount.text = "$count"
        }

        decrementButton.setOnClickListener {
            count--
            currentCount.text = "$count"
        }
    }
}
