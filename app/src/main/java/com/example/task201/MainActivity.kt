package com.example.task201

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.task201.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var previousBtn: Button
    private lateinit var nextBtn: Button


    private val imageList = listOf(
        R.drawable.frontcard,
        R.drawable.frontcard,
        R.drawable.frontcard
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        viewPager = findViewById(R.id.Viewpageslider)
        previousBtn = findViewById(R.id.previousBtn)
        nextBtn = findViewById(R.id.nextBtn)


        val imageAdapter = ImagePagerAdapter(imageList)
        viewPager.adapter = imageAdapter


        nextBtn.setOnClickListener {
            val nextItem = viewPager.currentItem + 1
            if (nextItem < imageList.size) {
                viewPager.currentItem = nextItem
            }
        }


        previousBtn.setOnClickListener {
            val prevItem = viewPager.currentItem - 1
            if (prevItem >= 0) {
                viewPager.currentItem = prevItem
            }
        }
    }
}