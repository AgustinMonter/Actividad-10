package com.example.calculadora2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText nu1,nu2;
    Button suma, resta, multiplicacion, division, modulo;

    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        nu1 = (EditText) findViewById(R.id.num1);
        nu2 = (EditText) findViewById(R.id.num2);

        suma = (Button) findViewById(R.id.suma);
        resta = (Button) findViewById(R.id.resta);
        multiplicacion = (Button) findViewById(R.id.multiplicacion);
        division = (Button) findViewById(R.id.division);

        res= (TextView) findViewById(R.id.resultado);

        suma.setOnClickListener(this);
        resta.setOnClickListener(this);
        multiplicacion.setOnClickListener(this);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        String n1 = nu1.getText().toString();
        String n2 = nu2.getText().toString();

        float decimal1 =Float.parseFloat(n1);
        float decimal2 =Float.parseFloat(n2);

        float rta=0;



        switch (v.getId()){
            case R.id.suma:
                rta = decimal1+decimal2;
                break;
            case R.id.resta:
                rta = decimal1-decimal2;
                break;
            case R.id.multiplicacion:
                rta= decimal1*decimal2;
                break;
            case R.id.division:
                rta = decimal1/decimal2;
                break;
        }
        res.setText(""+rta);
    }
}