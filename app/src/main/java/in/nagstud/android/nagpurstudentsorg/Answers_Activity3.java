package in.nagstud.android.nagpurstudentsorg;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class Answers_Activity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answers_3);
        //add the text view to display the activity name
  //      TextView textView = findViewById(R.id.text_view);
//        textView.setText("A TextView in answers activity 3");
        //add the toolbar
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        //add the actionbar
        ActionBar actionBar = getSupportActionBar();
        //add the title at the action bar
        actionBar.setTitle(getIntent().getStringExtra("string"));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
    @Override
    public void onBackPressed()
    {
        finish();
    }
    public void gotopaymentgateway(View view)
    {
        Intent intent = new Intent(Answers_Activity3.this,Answers_Activity4.class);
        startActivity(intent);
    }
}
