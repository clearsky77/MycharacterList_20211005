package com.clearsky77.mycharacterlist_20211005.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.clearsky77.mycharacterlist_20211005.R
import kotlinx.android.synthetic.main.fragment_posts01.*

class Posts01Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_posts01, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
//        postImg01.setOnClickListener {
//            Toast.makeText(requireContext(), "postImg01.setOnClickListener", Toast.LENGTH_SHORT).show()
//        }
        // this로 시도
//        val imgeURL = "https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTAyMDlfMjQz%2FMDAxNjEyODY0NDY0OTEy.CyEmVaDiUjBLPASsOWz-1P-dpWh2GbXrtZggxsMRpBsg.9bNocgGaBJU1mFYm7D6PrNaN_TtU5y8dpU8DlsprWB8g.JPEG.dochi20%2F%25B9%25DF%25B7%25BB%25C6%25BC%25BF%25C2.jpg"
//        Glide.with(this).load(requireContext()).into(postImg01)

        // requireContext()로 시도
//        val imgeURL2 = "https://search.pstatic.net/common/?src=http%3A%2F%2Fpost.phinf.naver.net%2FMjAyMTA3MTVfMjU4%2FMDAxNjI2MzI2MDYzNDkx.7UFt3Yyix-OK2XKL0ARLgwoXFn9snhC-ZAEzUgbRNzQg.hn0pu8hWaxGuDPF5UygE4lRFcACiPbU16SheITAN2UQg.PNG%2FIuL2i1ZtrntAnQgbE2Ko-bQ4bhts.jpg&type=sc960_832"
//        Glide.with(requireContext()).load(imgeURL2).into(postImg02)

        // this.requireContext()로 시도
        val imgeURL3 = "https://search.pstatic.net/common/?src=http%3A%2F%2Fpost.phinf.naver.net%2FMjAxOTA0MDJfMTg1%2FMDAxNTU0MTg3NTY0ODIy.FYknc4fFRLPjehEACpb89a3aNbcpITfKx4uyQFC77d4g.rl2vAxnHfB_gnx3ezAOK8qvuzg08F6Vtch-9p-edCYQg.JPEG%2FITG636IM3VPsOdKSmYQmVFLS3aRs.jpg"
        Glide.with(this.requireContext()).load(imgeURL3).into(postImg03)

    }
}