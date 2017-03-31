package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class PizzaNowActivity extends AppCompatActivity {

    //Listando as pizzas
    ListView lstPizzas;
    List<Pizzas> pizzasList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_now);

        //Colocando as informaçoes para abrir na nova activity
        pizzasList = GerarPizza.listPizzas();

        PizzaAdapter pizzaAdapter = new PizzaAdapter(this, pizzasList);

        lstPizzas = (ListView) findViewById(R.id.lstPizzas);
        lstPizzas.setAdapter(pizzaAdapter);

        lstPizzas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Pizzas pizzas = pizzasList.get(position);

                Intent it = new Intent(PizzaNowActivity.this, PizzaInfActivity.class);
                it.putExtra("pizza", pizzas);
                startActivity(it);

            }
        });




    }
}

