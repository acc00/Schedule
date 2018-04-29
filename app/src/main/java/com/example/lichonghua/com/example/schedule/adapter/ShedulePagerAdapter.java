package com.example.lichonghua.com.example.schedule.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.lichonghua.com.example.schedule.Calendar.Constant;
import com.example.lichonghua.com.example.schedule.Fragment.ScheduleFragment;

/**
 * @author Admin
 * @version $Rev$
 * @des ${TODO}
 * @updateAuthor $Author$
 * @updateDes ${TODO}
 */
public class ShedulePagerAdapter extends FragmentPagerAdapter {
    public ShedulePagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public int getCount() {
        return 52;
    }

    public Fragment getItem(int position) {
        return ScheduleFragment.newInstance(position + 1);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return new String("第" + Constant.xuhaoArray[position + 1] + "周");
    }
}
