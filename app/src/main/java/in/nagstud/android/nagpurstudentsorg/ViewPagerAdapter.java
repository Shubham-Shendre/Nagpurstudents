package in.nagstud.android.nagpurstudentsorg;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created for nagstud projectname: nagpurstudents.org
 * creatorslist
 * shubham dilip shendre aka ( SdS )
 *
 *
 *
 *
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new Fragment_home();
        } else if (position == 1) {
            return new Fragment_questionpapers();
        } else return new Fragment_answerpapers();
    }

    @Override
    public int getCount() {
        return 3;
    }
}
