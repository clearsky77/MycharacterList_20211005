package com.clearsky77.mycharacterlist_20211005.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.clearsky77.mycharacterlist_20211005.R
import kotlinx.android.synthetic.main.fragment_posts02.*

class Posts02Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_posts02, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        postImg01.setOnClickListener {
//            Toast.makeText(requireContext(), "postImg01.setOnClickListener", Toast.LENGTH_SHORT).show()
//        }
        val imgeURL = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2020/1119_memory_m5d2rk/listb_201119_memory.jpg"
        Glide.with(this).load(imgeURL).into(postImg01)
        val imgeURL2 = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2021/0909_bambul_29wse3/listb_210909_light.jpg"
        Glide.with(this).load(imgeURL2).into(postImg02)
        val imgeURL3 = "https://ssl.nx.com/s2/game/mabinogi/MabiWeb/event/2021/0805_teaparty_fjdn2z/listb_210805_teaparty.jpg"
        Glide.with(this).load(imgeURL3).into(postImg03)

    }
}