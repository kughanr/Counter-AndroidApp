package kughan_ravindran.counter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        currentCount.text = "$count"

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
