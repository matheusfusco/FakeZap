package com.rm45401.fiap.fakezap

import android.os.Parcel
import android.os.Parcelable
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import java.util.ArrayList

/**
 * Created by logonrm on 19/03/2018.
 */

class ViewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager){
    val meusFragments = ArrayList<Fragment>()

    override fun getItem(position: Int): Fragment {
        return meusFragments[position]
    }

    override fun getCount(): Int {
        return meusFragments.size
    }

    fun adicionarFragment(fragment: Fragment) {
        meusFragments.add(fragment)
    }

}