package com.pablohenao.turismo_jardin;

import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        FragmentPrincipal fmain = new FragmentPrincipal();
        fragmentTransaction.add(android.R.id.content, fmain).commit();

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

        if(id == R.id.Principal){
 //           Intent i = new Intent(this, MainActivity.class);
 //           startActivity(i);
            FragmentPrincipal fmain = new FragmentPrincipal();
            getFragmentManager().beginTransaction().replace(android.R.id.content, fmain).commit();
            return true;
        }

        if(id == R.id.Hoteles){
  //          Intent i = new Intent(this, HotelesActivity.class);
  //          startActivity(i);

            FragmentHoteles fhotel = new FragmentHoteles();
            getFragmentManager().beginTransaction().replace(android.R.id.content, fhotel).commit();

            return true;
        }

        if(id == R.id.Bares){
  //          Intent i = new Intent(this, BaresActivity.class);
  //          startActivity(i);

            FragmentBares fbar = new FragmentBares();
            getFragmentManager().beginTransaction().replace(android.R.id.content, fbar).commit();

            return true;
        }

        if(id == R.id.Turismo){
    //        Intent i = new Intent(this, TurismoActivity.class);
    //        startActivity(i);

            FragmentTurismo ftur = new FragmentTurismo();
            getFragmentManager().beginTransaction().replace(android.R.id.content, ftur).commit();

            return true;
        }

        if(id == R.id.Acerca){
    //        Intent i = new Intent(this, AcercaActivity.class);
    //         startActivity(i);

            new AlertDialog.Builder(this)
                    .setTitle(getResources().getString(R.string.acerca))
                    .setMessage(getResources().getString(R.string.acercainfo))
                    .setNeutralButton(getResources().getString(R.string.Ok), new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // TODO Auto-generated method stub

                        }
                    }).show();

            return true;
        }

        if(id == R.id.Demografia){
     //       Intent i = new Intent(this, DemografiaActivity.class);
     //       startActivity(i);

            FragmentDemografia fdemografia = new FragmentDemografia();
            getFragmentManager().beginTransaction().replace(android.R.id.content, fdemografia).commit();

            return true;
        }



        return super.onOptionsItemSelected(item);
    }
}
