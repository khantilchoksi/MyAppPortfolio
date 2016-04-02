package com.example.khantilchoksi.myappportfolio;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Using OnClickListener
        /*Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = "This button will launch my spotifier streamer app!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        });*/

    }

    public void showToast (View v){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch " + ((Button) v).getText() + " application!";
        // getText method is used so that project name will be displayed
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
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


    /*public static class MainFragment extends Fragment{
        ArrayAdapter<String> projectAdapter;

        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);

            String[] projects = {
                    "Spotify Streamer",
                    "Scores App",
                    "Library App",
                    "Build It Bigger",
                    "XYZ Reader",
                    "CAPSTONE: MY OWN APP"
            };

            List<String> projectList = new ArrayList<String>(Arrays.asList(projects));

            projectAdapter = new ArrayAdapter<String>(
                    getActivity(),
                    R.layout.list_item_project,
                    R.id.list_item_project_button,
                    projectList
            );

            ListView listView = (ListView) rootView.findViewById(R.id.listView_projects);
            listView.setAdapter(projectAdapter);

            return rootView;
        }*/
    }

