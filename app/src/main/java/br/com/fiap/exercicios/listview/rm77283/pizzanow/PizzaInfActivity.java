package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;


public class PizzaInfActivity extends AppCompatActivity {

    ImageView imgPizza;
    TextView txtSabor;
    TextView txtDescricao;
    TextView txtValor;
    RatingBar pontuacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_inf);

        //Pegando os dados do beans
        Pizzas pizza = (Pizzas) getIntent().getExtras().get("pizza");

        //Colocando a seta e colocando os valores nas txt
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setTitle(pizza.getSabor());

        imgPizza = (ImageView)findViewById(R.id.imgPizza);
        txtSabor = (TextView)findViewById(R.id.txtSabor);
        txtDescricao = (TextView)findViewById(R.id.txtDescricao);
        txtValor = (TextView)findViewById(R.id.txtValor);
        RatingBar pontuacao = (RatingBar)findViewById(R.id.ratingBar1);

        imgPizza.setImageResource(pizza.getImg());
        txtSabor.setText(pizza.getSabor());
        txtDescricao.setText(pizza.getDes());
        txtValor.setText(pizza.getValor());
        pontuacao.setRating(pizza.getPontuacao());

        

    }

    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromTouch) {

        final int pontuacao = ratingBar.getNumStars();
        ratingBar.getRating() ;
        final float ratingBarStepSize = ratingBar.getStepSize();

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
