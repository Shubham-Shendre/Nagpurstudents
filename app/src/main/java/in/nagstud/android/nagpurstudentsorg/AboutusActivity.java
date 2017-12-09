package in.nagstud.android.nagpurstudentsorg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class AboutusActivity extends AppCompatActivity {
    // Declare Variables
    ListView list;
    ListViewAdapter adapter;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus);

        TextView textView = findViewById(R.id.text_view);
        textView.setText("A TextView in about us activity");

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getIntent().getStringExtra("string"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Generate sample data into string arrays
        rank = new String[] { "1", "2", "3", "4" };

        country = new String[] { "China", "India", "United States",
                "Indonesia" };

        population = new String[] { "1,354,040,000", "1,210,193,422",
                "315,761,000", "237,641,326" };

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
                Intent i = new Intent(AboutusActivity.this, SingleItemView.class);
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
}
