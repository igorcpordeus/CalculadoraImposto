package com.example.calculadoraimposto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void btnCalcularISS(View v) {
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        EditText txtvalor = (EditText) findViewById(R.id.etValor);

        double imposto = Double.parseDouble(txtvalor.getText().toString());

        Tributos iss = new Tributos();
        iss.setNome("federal");
        iss.setImposto(Imposto.ISS);
        Calcula calcula = new Calcula(iss, imposto);
        tvResultado.setText("O Valor do iss e: " + calcula.calculaImposto());

    }
    public void btnCalcularICMS(View v){
        TextView tvResultado = (TextView) findViewById(R.id.tvResultado);
        EditText txtvalor = (EditText) findViewById(R.id.etValor);

        double imposto = Double.parseDouble(txtvalor.getText().toString());

        Tributos icms = new Tributos();
        icms.setNome("estadual");
        icms.setImposto(Imposto.ICMS);
        Calcula calcula = new Calcula(icms, imposto);
        tvResultado.setText("O Valor do icms e: " + calcula.calculaImposto());

    }

}
