package in.nagstud.android.nagpurstudentsorg;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by shubham dilip shendre aka SdS
 */

public class Fragment_questionpapers extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_questionpapers, container, false);
    }

    @SuppressLint("ResourceType")
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //display the text by finding the view by id parameter
        TextView textView = (TextView) view.findViewById(R.id.text_view);
        textView.setText("A TextView in Question Paper Fragment");
        //
        ListView listView = (ListView) view.findViewById(R.id.list);
        String[] dummyStrings = getResources().getStringArray(R.array.my_items);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, dummyStrings);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                Toast.makeText(getActivity(), "You clicked at position: " + (position + 1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), AboutusActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: " + (position + 1));
                startActivity(intent);
            }


        });
    //
        String[] years = getResources().getStringArray(R.array.years);
        Spinner spinner = (Spinner) view.findViewById(R.id.year);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(getActivity(), android.R.layout.simple_spinner_dropdown_item, years);

// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter2);
        /*
        Spinner.OnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), "You clicked at position: " + (position + 1), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), AboutusActivity.class);
                intent.putExtra("string", "go to another Activity from ListView position: " + (position + 1));
                startActivity(intent);
            }
        });
        */
    }

    }

