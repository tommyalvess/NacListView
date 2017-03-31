package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by logonrm on 30/03/2017.
 */

public class PizzaAdapter extends BaseAdapter {

    private Context context;
    private List<Pizzas> pizzasList;

    public PizzaAdapter(Context context, List<Pizzas> pizzasList){

        this.context = context;
        this.pizzasList = pizzasList;

    }

    //Ele contabiliza contos itens vai precisar renderizar
    @Override
    public int getCount() {
        return this.pizzasList.size();
    }

    //Ele pega o item
    @Override
    public Object getItem(int i) {
        return this.pizzasList.get(i);
    }


    @Override
    public long getItemId(int i) {
        return i;
    }

    //Ele retorna a view que renderizo
    @Override
    public View getView(int i, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(this.context);

        Pizzas pizzas = this.pizzasList.get(i);
        View v = inflater.inflate(R.layout.listview_pizzas, null);
        ImageView imgPizza = (ImageView)v.findViewById(R.id.imgPizza);
        TextView txtSabor = (TextView)v.findViewById(R.id.txtSabor);
        TextView txtValor = (TextView)v.findViewById(R.id.txtValor);
        /*TextView txtDes = (TextView)v.findViewById(R.id.txtSobre);*/

        imgPizza.setImageResource(pizzas.getImg());
        txtSabor.setText(pizzas.getSabor());
        txtValor.setText(pizzas.getValor());

        return v;
    }


}
