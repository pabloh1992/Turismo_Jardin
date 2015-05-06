package com.pablohenao.turismo_jardin;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;


public class BaresActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bares);

        final ImageView imagen1 = (ImageView) findViewById(R.id.imagen1_bar);
        final ImageView imagen2 = (ImageView) findViewById(R.id.imagen2_bar);
        final TextView info = (TextView) findViewById(R.id.txtinfo);
        final TextView txtbar = (TextView) findViewById(R.id.txtbar);
        final Spinner spinner = (Spinner) findViewById(R.id.bar_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.bares_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtbar.setText(String.valueOf(spinner.getSelectedItem()));

                if (position == 0) {
                    imagen1.setImageResource(R.drawable.bar_trucheria_valdivia2);
                    imagen2.setImageResource(R.drawable.bar_trucheria_valdivia1);
                    info.setText(getResources().getString(R.string.bar1info));

                }
                if (position == 1) {
                    imagen1.setImageResource(R.drawable.bar_latrucheria1);
                    imagen2.setImageResource(R.drawable.bar_latrucheria2);
                    info.setText(getResources().getString(R.string.bar2info));
                }
                if (position == 2) {

                    imagen1.setImageResource(R.drawable.bar_argelia1);
                    imagen2.setImageResource(R.drawable.bar_argelia2);
                    info.setText(getResources().getString(R.string.bar3info));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
    public class SpinnerActivity extends Activity implements AdapterView.OnItemSelectedListener {


        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            // An item was selected. You can retrieve the selected item using
            // parent.getItemAtPosition(pos)

        }

        public void onNothingSelected(AdapterView<?> parent) {
            // Another interface callback
        }




    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_bares, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        if(id == R.id.Hoteles){
            Intent i = new Intent(this, HotelesActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.Principal){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.Turismo){
            Intent i = new Intent(this, TurismoActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.Acerca){
            Intent i = new Intent(this, AcercaActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.Demografia){
            Intent i = new Intent(this, DemografiaActivity.class);
            startActivity(i);
            return true;
        }



        return super.onOptionsItemSelected(item);
    }

}
