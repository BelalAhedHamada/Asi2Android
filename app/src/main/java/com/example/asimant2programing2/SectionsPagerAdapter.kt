package com.example.asimant2programing2

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.asimant2programing2.ui.main.TAB_TITLES

/**
 * A [FragmentPagerAdapter] that returns a fragment corresponding to
 * one of the sections/tabs/pages.
 */
class SectionsPagerAdapter(private val context: Context, fm: FragmentManager) :
    FragmentPagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        val tabName = TAB_TITLES[position]
        return if (tabName.equals("samrtphone")) {
            samrtphone()
        } else {
            PlaceholderFragment.newInstance(position + 1)
        }
    }
fun updateTabs(tabs:ArrayList<String>){
    TAB_TITLES
    notifyDataSetChanged()
}
    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(TAB_TITLES[position])
    }

    override fun getCount(): Int {
        // Show 2 total pages.
        return 2
    }
}