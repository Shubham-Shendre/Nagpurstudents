package in.nagstud.android.nagpurstudentsorg;
//this class handle the fragment home layout

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created for nagstud projectname: nagpurstudents.org
 * creatorslist
 * shubham dilip shendre aka ( SdS )
 *
 *
 *
 *
 */
public class Fragment_home extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_home, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //display the text by finding the view by id parameter
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText("A TextView in Home Fragment");

    }
}
