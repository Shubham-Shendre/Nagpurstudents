package in.nagstud.android.nagpurstudentsorg;
//this class is not under used
//adapter class used to generate the grid view

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created for nagstud projectname: nagpurstudents.org
 * creatorslist
 * shubham dilip shendre aka ( SdS )
 *
 *
 *
 *
 */
public class GridViewAdapter extends BaseAdapter {
    private Context mContext;

    public GridViewAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    //pass the data to the gridviewadapter to shw on the page
    private Integer[] mThumbIds = {
            R.drawable.adele, R.drawable.adele,
            R.drawable.adele, R.drawable.adele,
            R.drawable.adele, R.drawable.adele,
            R.drawable.adele, R.drawable.adele,

    };
}