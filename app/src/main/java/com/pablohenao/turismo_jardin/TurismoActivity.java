package com.pablohenao.turismo_jardin;

import android.app.Activity;
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


public class TurismoActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_turismo);
        final ImageView imagen1 = (ImageView) findViewById(R.id.imagen1_turismo);
        final ImageView imagen2 = (ImageView) findViewById(R.id.imagen2_turismo);
        final TextView info = (TextView) findViewById(R.id.txtinfo);
        final TextView txtturismo = (TextView) findViewById(R.id.txtturismo);
        final Spinner spinner = (Spinner) findViewById(R.id.turismo_spinner);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.turismo_array, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                txtturismo.setText(String.valueOf(spinner.getSelectedItem()));

                if (position == 0) {
                    imagen1.setImageResource(R.drawable.turismo_cuevadelesplendor1);
                    imagen2.setImageResource(R.drawable.turismo_cuevadelesplendor2);
                    info.setText(getResources().getString(R.string.turismo1info));

                }
                if (position == 1) {
                    imagen1.setImageResource(R.drawable.jardinbasilica1);
                    imagen2.setImageResource(R.drawable.jardinbasilica2);
                    info.setText(getResources().getString(R.string.turismo2info));
                }
                if (position == 2) {

                    imagen1.setImageResource(R.drawable.turismo_cuevadeguacharos1);
                    imagen2.setImageResource(R.drawable.turismo_cuevadeguacharos2);
                    info.setText(getResources().getString(R.string.turismo3info));
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
}