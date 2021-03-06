package com.rhenigan.roberthenigantmdb.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import com.rhenigan.roberthenigantmdb.R;

/**
 * Created by henig on 1/13/2018.
 * Activity to contain app description and recognitions
 */

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);

        Toolbar toolbar = findViewById(R.id.infoToolBar);
        toolbar.setTitleTextColor(0xFF000000);
        setSupportActionBar(toolbar);

        TextView infoPage = findViewById(R.id.infoPage);

        String[] desc = getResources().getStringArray(R.array.desc);

        //Adding all bullet points to App info page from string resources
        infoPage.setText(desc[0] + desc[1] +
                desc[2] + desc[3] +
                desc[4] + desc[5] +
                desc[6] + desc[7]);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.info_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.back:
                //Destroy info activity and return to main activity
                finish();
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
