package com.example.android.myappportfolio300;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
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
    }

    public void movieAppButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This buton will launch Movie Player App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }

    public void scoresAppButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Scores App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }
    public void libraryAppButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Library App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }
    public void buildItBiggerAppButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Build It Bigger App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }
    public void xyzReaderButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch XYZ Reader App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }
    public void capstoneButtonCLick(View v) {
        Context context = getApplicationContext();
        CharSequence text = "This button will launch Capstone App";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.setGravity(0,0,0);
        toast.show();
    }




}
