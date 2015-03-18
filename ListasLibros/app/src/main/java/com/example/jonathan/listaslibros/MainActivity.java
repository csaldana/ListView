package com.example.jonathan.listaslibros;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.lVLibro1);

        String[] lista = new String[]{"Diario de Anna Frank","Las aventuras de tom saawer","Padre rico, Padre pobre", "Principito","Frida khalo","Divergente","El viejo y el mar","El alquimista", "El caballero de la armadura oxidada", "Insurgente","El desconocido"};

        //Manipular el ArrayList
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,lista);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int posicion, long id) {
                int itemPosition = posicion;
                String itemValue = (String) listView.getItemAtPosition(posicion);
                //Toast.makeText(getApplicationContext(), "posicion :" + itemPosition, Toast.LENGTH_LONG).show();
               switch(posicion) {
                   case 0:
                   Intent diario = new Intent(getApplicationContext(), Librouno.class);
                   startActivity(diario);
                   break;
                   case 1:
                    Intent aventuras = new Intent(getApplicationContext(), Librodos.class);
                    startActivity(aventuras);
                   break;
                   case 2:
                       Intent padre = new Intent(getApplicationContext(), Librotres.class);
                       startActivity(padre);
                       break;
                   case 3:
                       Intent principito = new Intent(getApplicationContext(), Librocuatro.class);
                       startActivity(principito);
                       break;
                   case 4:
                       Intent frida = new Intent(getApplicationContext(), Librocinco.class);
                       startActivity(frida);
                       break;
                   case 5:
                       Intent divergente = new Intent(getApplicationContext(), Libroseis.class);
                       startActivity(divergente);
                       break;
                   case 6:
                       Intent viejo = new Intent(getApplicationContext(), Librosiete.class);
                       startActivity(viejo);
                       break;
                   case 7:
                       Intent alquimista = new Intent(getApplicationContext(), Libroocho.class);
                       startActivity(alquimista);
                       break;
                   case 8:
                       Intent caballero = new Intent(getApplicationContext(), Libronueve.class);
                       startActivity(caballero);
                       break;
                   case 9:
                       Intent insurgente = new Intent(getApplicationContext(), Librodiez.class);
                       startActivity(insurgente);
                       break;
                   default:
                       Toast.makeText(getApplicationContext(), "Lo siento aun no me pongo hacer esa sección"/* + itemPosition*/, Toast.LENGTH_LONG).show();

               }
            }
        });
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
}
