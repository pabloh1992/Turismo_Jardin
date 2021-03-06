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


public class HotelesActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        final ImageView imagen1 = (ImageView) findViewById(R.id.imagen1_hotel);
        final ImageView imagen2 = (ImageView) findViewById(R.id.imagen2_hotel);
        final TextView info = (TextView) findViewById(R.id.txtinfo);
        final TextView txthotel = (TextView) findViewById(R.id.txthotel);
        final Spinner spinner = (Spinner) findViewById(R.id.hotel_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.hoteles_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txthotel.setText(String.valueOf(spinner.getSelectedItem()));

                if (position == 0) {
                    imagen1.setImageResource(R.drawable.hotel_haciendabalandu1);
                    imagen2.setImageResource(R.drawable.hotel_haciendabalandu2);
                    info.setText(getResources().getString(R.string.hotel1info));

                }
                if (position == 1) {
                    imagen1.setImageResource(R.drawable.hotel_balconesdelparque1);
                    imagen2.setImageResource(R.drawable.hotel_balconesdelparque2);
                    info.setText(getResources().getString(R.string.hotel2info));
                }
                if (position == 2) {

                    imagen1.setImageResource(R.drawable.hotel_jardin1);
                    imagen2.setImageResource(R.drawable.hotel_jardin2);
                    info.setText(getResources().getString(R.string.hotel3info));
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
        getMenuInflater().inflate(R.menu.menu_hoteles, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if(id == R.id.Principal){
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
            return true;
        }

        if(id == R.id.Bares){
            Intent i = new Intent(this, BaresActivity.class);
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



