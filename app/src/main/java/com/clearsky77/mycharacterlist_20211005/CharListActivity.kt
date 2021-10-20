package com.clearsky77.mycharacterlist_20211005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.clearsky77.mycharacterlist_20211005.atapters.ImageViewPagerAdapter
import kotlinx.android.synthetic.main.activity_char_list.*

class CharListActivity : AppCompatActivity() {
    lateinit var mvpa : ImageViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_char_list)

        mvpa = ImageViewPagerAdapter(supportFragmentManager) // 어댑터를 만들고
        charListViewPager.adapter = mvpa // xml에 있는 charListViewPager에 어댑터를 얻는다

        // xml에 viewPager와 tabLayout연결
        charListTabLayout.setupWithViewPager(charListViewPager)

        // 탭에 이미지 얹기
        val charImg01 = ImageView(this)
        charImg01.setImageResource(R.drawable.character01)
        charImg01.setPadding(35,35,35,35)
        val charImg02 = ImageView(this)
        charImg02.setImageResource(R.drawable.character02)
        charImg02.setPadding(35,35,35,35)
        val charImg03 = ImageView(this)
        charImg03.setImageResource(R.drawable.character03)
        charImg03.setPadding(35,35,35,35)

        charListTabLayout.getTabAt(0)?.setCustomView(charImg01)
        charListTabLayout.getTabAt(1)?.setCustomView(charImg02)
        charListTabLayout.getTabAt(2)?.setCustomView(charImg03)

    }
}