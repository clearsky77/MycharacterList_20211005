package com.clearsky77.mycharacterlist_20211005

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.clearsky77.mycharacterlist_20211005.atapters.ImageViewPagerAdapter
import com.google.android.material.navigation.NavigationView
import kotlinx.android.synthetic.main.activity_char_list.*

class CharListActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
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

        // 햄버거 아이콘 터치
        naviBtn.setOnClickListener {
            layout_drawer.openDrawer(GravityCompat.START) // START: left, END: right 와 같은 의미. 왼쪽에서부터 열림.
        }

        // 네비게이션 메뉴 터치 시
        naviView.setNavigationItemSelectedListener(this)

    }

    //    네비게이션 메뉴의 아이템 선택 시 수행할 내용 지정
    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.myInfo -> Toast.makeText(applicationContext, "내정보", Toast.LENGTH_SHORT).show()
            R.id.friends -> Toast.makeText(applicationContext, "스케줄", Toast.LENGTH_SHORT).show()
        }
        layout_drawer.closeDrawers() // 선택이 끝났으니 네비게이션 메뉴 창은 닫아줘야한다.
        return false
    }
}