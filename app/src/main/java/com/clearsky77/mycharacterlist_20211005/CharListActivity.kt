package com.clearsky77.mycharacterlist_20211005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
        charListTabLayout.getTabAt(0)?.setIcon(R.drawable.character01)
        charListTabLayout.getTabAt(1)?.setIcon(R.drawable.character02)
        charListTabLayout.getTabAt(2)?.setIcon(R.drawable.character03)

    }
}