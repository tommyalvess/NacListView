package br.com.fiap.exercicios.listview.rm77283.pizzanow;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.content.Context;

import static br.com.fiap.exercicios.listview.rm77283.pizzanow.R.id.radioG;

public class PreferenciasActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    RadioButton rbAtivar, rbDesativar;
    SharedPreferences sharedpreferences;
    Button BtnSubmit;

    public static final String MyPREFERENCES = "txtTela";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        //Botao de voltar
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);

        //Salvando a preferencia
        radioGroup = (RadioGroup) findViewById(radioG);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                rbAtivar = (RadioButton) findViewById(R.id.rbAtivar);
                rbDesativar = (RadioButton) findViewById(R.id.rbDesativar);

                if (rbAtivar.isChecked()) {
                    Toast.makeText(getBaseContext(), "Tela Inicial Ativada",
                            Toast.LENGTH_LONG).show();
                } else if (rbDesativar.isChecked()) {
                    Toast.makeText(getBaseContext(), "Tela Inicial Desativada",
                            Toast.LENGTH_LONG).show();
                }

            }

        });

    }


        public SharedPreferences getSharedPreferences(Context context) {
            return context.getSharedPreferences("energy", Context.MODE_PRIVATE);
        }

        //// preferencia de checkbox
        public  boolean setcbremember(Context context, boolean a) {
            SharedPreferences sharedPref = getSharedPreferences(context);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.putBoolean("Cbremember", a);
            editor.commit();
            return a;

        }
        public  boolean getcbremember(Context context) {
            SharedPreferences sharedPref = getSharedPreferences(context);
            return sharedPref.getBoolean("Cbremember", true);
        }
        //// Deletar preferencia de login e senha
        public  void deletar(Context context, String login) {
            SharedPreferences sharedPref = getSharedPreferences(context);
            SharedPreferences.Editor editor = sharedPref.edit();
            editor.clear();
            editor.commit();

        }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void Salvar(View view) {


        int idRadio = radioGroup.getCheckedRadioButtonId();
        if (idRadio == R.id.rbAtivar) {

            Intent it = new Intent(PreferenciasActivity.this, SplashScreenActivity.class);
            startActivity(it);

        } else if (idRadio == R.id.rbDesativar) {

            Intent it = new Intent(PreferenciasActivity.this, PizzaNowActivity.class);
            startActivity(it);

        }
    }
}

