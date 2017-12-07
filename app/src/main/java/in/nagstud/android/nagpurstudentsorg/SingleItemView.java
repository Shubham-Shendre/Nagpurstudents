package in.nagstud.android.nagpurstudentsorg;

/**
 * Created by dell on 12/7/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class SingleItemView extends AppCompatActivity {
    // Declare Variables
    TextView txtrank;
    TextView txtcountry;
    TextView txtpopulation;
    ImageView imgflag;
    String[] rank;
    String[] country;
    String[] population;
    int[] flag;
    int position;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.singleitemview);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(getIntent().getStringExtra(String.valueOf(country)));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        // Retrieve data from MainActivity on listview item click
        Intent i = getIntent();
        // Get a single position
        position = i.getExtras().getInt("position");
        // Get the list of rank
        rank = i.getStringArrayExtra("rank");
        // Get the list of country
        country = i.getStringArrayExtra("country");
        // Get the list of population
        population = i.getStringArrayExtra("population");
        // Get the list of flag
        flag = i.getIntArrayExtra("flag");

        // Locate the TextViews in singleitemview.xml
        txtrank = (TextView) findViewById(R.id.rank);
        txtcountry = (TextView) findViewById(R.id.country);
        txtpopulation = (TextView) findViewById(R.id.population);

        // Locate the ImageView in singleitemview.xml
        imgflag = (ImageView) findViewById(R.id.flag);

        // Load the text into the TextViews followed by the position
        txtrank.setText(rank[position]);
        txtcountry.setText(country[position]);
        txtpopulation.setText(population[position]);

        // Load the image into the ImageView followed by the position
        imgflag.setImageResource(flag[position]);


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