package com.pzy.chopin.basicmodel.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Chopin on 2017/8/12.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listfragment=null;
    String []listname=new String[]{"A","B","C","D"};

    public ViewPagerAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.listfragment=list;
    }

    @Override
    public Fragment getItem(int position) {
        return listfragment.get(position);
    }

    @Override
    public int getCount() {
        return listfragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return listname[position];
    }

}
