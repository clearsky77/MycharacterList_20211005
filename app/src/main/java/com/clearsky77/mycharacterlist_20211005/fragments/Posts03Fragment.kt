package com.clearsky77.mycharacterlist_20211005.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.clearsky77.mycharacterlist_20211005.R
import kotlinx.android.synthetic.main.fragment_posts02.*
import kotlinx.android.synthetic.main.fragment_posts03.*
import kotlinx.android.synthetic.main.fragment_posts03.postImg01
import kotlinx.android.synthetic.main.fragment_posts03.postImg02
import kotlinx.android.synthetic.main.fragment_posts03.postImg03

class Posts03Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_posts03, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        postImg01.setOnClickListener {
//            Toast.makeText(requireContext(), "postImg01.setOnClickListener", Toast.LENGTH_SHORT).show()
//        }

        // 화면에 이미지 표현
        val imgeURL = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2020/1119_memory_m5d2rk/listb_201119_memory.jpg"
        Glide.with(this).load(imgeURL).into(postImg01)
        val imgeURL2 = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2021/0909_bambul_29wse3/listb_210909_light.jpg"
        Glide.with(this).load(imgeURL2).into(postImg02)
        val imgeURL3 = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2021/0805_teaparty_fjdn2z/listb_210805_teaparty.jpg"
        Glide.with(this).load(imgeURL3).into(postImg03)

        // 이미지 클릭시 이벤트 사이트 in 브라우저
        postImg01.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW)
            myIntent.data = Uri.parse("https://mabinogi.nexon.com/page/event/2020/1119_memory/index.asp")
            startActivity(myIntent)
        }
        postImg02.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW)
            myIntent.data = Uri.parse("https://mabinogi.nexon.com/page/news/event_view.asp?id=4889307")
            startActivity(myIntent)
        }
        postImg03.setOnClickListener {
            val myIntent = Intent(Intent.ACTION_VIEW)
            myIntent.data = Uri.parse("https://mabinogi.nexon.com/page/news/event_view.asp?id=4889177")
            startActivity(myIntent)
        }
    }
}