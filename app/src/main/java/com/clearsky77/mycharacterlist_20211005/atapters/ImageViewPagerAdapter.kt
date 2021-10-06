package com.clearsky77.mycharacterlist_20211005.atapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.clearsky77.mycharacterlist_20211005.fragments.Posts01Fragment
import com.clearsky77.mycharacterlist_20211005.fragments.Posts02Fragment
import com.clearsky77.mycharacterlist_20211005.fragments.Posts03Fragment

class ImageViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    //    몇 장의 뷰를 만들 것인가?
    override fun getCount(): Int {
        return 3 //테스트로 하나의 프래그먼트를 올려보자
    }

    //  번호에 따른 프래그먼트 반환
    override fun getItem(position: Int): Fragment {
        if(position == 0) {
            return Posts01Fragment() //테스트로 하나의 프래그먼트를 올려보자
        }else if(position == 1){
            return Posts02Fragment()
        }else{
            return Posts03Fragment()
        }
    }
}