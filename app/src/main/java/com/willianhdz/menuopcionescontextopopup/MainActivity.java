package com.willianhdz.menuopcionescontextopopup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo que infla el menu de opciones
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }

    //Metodo para controlar las acciones de cada opcion del menu
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.item1:
                //instruciones o acciones a ejecutar
                Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item2:
                //instrucciones a ejecutar
                Toast.makeText(this, "About", Toast.LENGTH_SHORT).show();
                break;

            case R.id.item3:
                Toast.makeText(this, "Salir", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Elige una opcion", Toast.LENGTH_SHORT).show();
        }

        return super.onOptionsItemSelected(item);
    }
}