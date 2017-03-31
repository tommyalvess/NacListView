package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class GerarPizza {

    public static List<Pizzas> listPizzas(){
        List<Pizzas> pizzas = new ArrayList<>();
        pizzas.add(new Pizzas(R.drawable.calabresacatupiry, "Calabresa c/ Catupiry", "55,00", R.string.txtDes, "4 Estrelas"));

        pizzas.add(new Pizzas(R.drawable.catupiry, "Catupiry", "45,00", R.string.txtDes1, "3 Estrelas"));

        pizzas.add(new Pizzas(R.drawable.romeujulieta, "Romeu & Julieta", "40,00", R.string.txtDes2, "5 Estrelas"));

        pizzas.add(new Pizzas(R.drawable.marguerita, "Marguerita", "55,00", R.string.txtDes3, "5 Estrelas"));

        pizzas.add(new Pizzas(R.drawable.portuguesa, "Portuguesa", "35,00", R.string.txtDes4, "4 Estrelas "));

        pizzas.add(new Pizzas(R.drawable.presuntomussarela, "Presunto c/ Mussarela", "45,00", R.string.txtDes5, "5 Estrelas"));

        return pizzas;
    }

}
