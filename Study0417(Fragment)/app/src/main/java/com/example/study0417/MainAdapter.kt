package com.example.study0417

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.view.ViewGroup

class MainAdapter(fm:FragmentManager):FragmentStatePagerAdapter(fm){
    override fun getItem(p0: Int): Fragment {
        return when(p0) {
            0-> AFragment()
            1-> BFragment()
            2-> CFragment()

            else -> AFragment()
        }
    }
    //ViewPager로 보여줄 뷰의 전체 개수
    override fun getCount()=3
    //ViewPager에서 뷰가 사라질 때 제거하는 작업
    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        super.destroyItem(container, position, `object`)
    }


}