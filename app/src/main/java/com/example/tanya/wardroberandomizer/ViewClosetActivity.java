package com.example.tanya.wardroberandomizer;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

/**
 * Created by tanya on 11/6/16.
 */

public class ViewClosetActivity extends ActionBarActivity{
    private ListView listView;

    private Integer imageid[] = {
            R.drawable.dress_outfit,
        R.drawable.shorts_outfit,
        R.drawable.eighty_degrees,
       R.drawable.seventyfive_degrees,
        R.drawable.seventy_degrees,
        R.drawable.sixtyfive_degrees,
        R.drawable.sixty_degrees,
       R.drawable.fiftyfive_degrees,
        R.drawable.fifty_degrees,
        R.drawable.fourtyfive_degrees,
        R.drawable.fourty_degrees,
        R.drawable.thirtyfive_degrees,
        R.drawable.thirty_degrees,
        R.drawable.twentyfive_degrees,
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_closet);
        CustomList customList = new CustomList(this, imageid);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(customList);
    }

    /*public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }*/

}
