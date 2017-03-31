package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class PizzaInfActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView txtSabor;
    TextView txtDescricao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_inf);

        //Pegando os dados do beans
        Pizzas pizza = (Pizzas) getIntent().getExtras().get("pizza");

        //Colocando a seta
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(pizza.getSabor());

        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtSabor = (TextView)findViewById(R.id.txtSabor);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);
        //txtPontuacao = (TextView)findViewById(R.id.txtPontuacao);

        imgPizza.setImageResource(pizza.getImg());
        txtSabor.setText(pizza.getSabor());
        txtDescricao.setText(pizza.getDes());
        //txtPontuacao.setText(pizza.getPontuacao());

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        //Verifica se foi o botao de voltar da actionbar
        if(item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
