package in.nagstud.android.nagpurstudentsorg;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created for nagstud projectname: nagpurstudents.org
 * creatorslist
 * shubham dilip shendre aka ( SdS )
 *
 *
 *
 *
 */
public class Answers_Activity2 extends AppCompatActivity {
    // Declare Variables for list data
    ListView list,list2;
    ListViewAdapter adapter,adapter2;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers2);
        //add the text view to display the activity name
        TextView textView = findViewById(R.id.text_view);
        textView.setText("A TextView in about us activity");



        CardView cardView = findViewById(R.id.card_view);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //add the title at the action bar
        //add the actionbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getIntent().getStringExtra("string"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Generate sample data into string arrays
        rank = new String[] { "1", "2", "3", "4" };
        country = new String[] { "China", "India", "United States","Indonesia" };
        population = new String[] { "1,354,040,000", "1,210,193,422","315,761,000", "237,641,326" };
        flag = new int[] { R.drawable.china, R.drawable.india,
                R.drawable.unitedstates, R.drawable.indonesia,
                R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria,
                R.drawable.bangladesh, R.drawable.russia, R.drawable.japan };
        // Locate the ListView in listview_main.xml
        list = (ListView) findViewById(R.id.listview);
        // Pass results to ListViewAdapter Class
        adapter = new ListViewAdapter(this, rank, country, population, flag);
        // Binds the Adapter to the ListView
        list.setAdapter(adapter);
        // Capture ListView item click
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(Answers_Activity2.this, SingleItemView.class);
                // Pass all data rank
                i.putExtra("rank", rank);
                // Pass all data country
                i.putExtra("country", country);
                // Pass all data population
                i.putExtra("population", population);
                // Pass all data flag
                i.putExtra("flag", flag);
                // Pass a single position
                i.putExtra("position", position);
                // Open SingleItemView.java Activity
                startActivity(i);
            }

        });
        //list2
        // Generate sample data into string arrays
        rank = new String[] { "1", "2", "3", "4" };
        country = new String[] { "China", "India", "United States","Indonesia" };
        population = new String[] { "1,354,040,000", "1,210,193,422","315,761,000", "237,641,326" };
        flag = new int[] { R.drawable.china, R.drawable.india,
                R.drawable.unitedstates, R.drawable.indonesia,
                R.drawable.brazil, R.drawable.pakistan, R.drawable.nigeria,
                R.drawable.bangladesh, R.drawable.russia, R.drawable.japan };
        // Locate the ListView in listview_main.xml
        list2 = (ListView) findViewById(R.id.listview2);
        // Pass results to ListViewAdapter Class
        adapter2 = new ListViewAdapter(this, rank, country, population, flag);
        // Binds the Adapter to the ListView
        list2.setAdapter(adapter2);
        // Capture ListView item click
        list2.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent i = new Intent(Answers_Activity2.this, SingleItemView.class);
                // Pass all data rank
                i.putExtra("rank", rank);
                // Pass all data country
                i.putExtra("country", country);
                // Pass all data population
                i.putExtra("population", population);
                // Pass all data flag
                i.putExtra("flag", flag);
                // Pass a single position
                i.putExtra("position", position);
                // Open SingleItemView.java Activity
                startActivity(i);
            }

        });

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed() {
        finish();
    }
    public void gotopaymentdetail(View view)
    {
        Intent intent = new Intent(Answers_Activity2.this,Answers_Activity3.class);
        startActivity(intent);
    }

}
