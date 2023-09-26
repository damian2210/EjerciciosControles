package com.example.ejercicioscontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ejercicio2 extends AppCompatActivity {

    int color=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView cuenta=(TextView) findViewById(R.id.texto);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio2);
        Button botonIncr=(Button)findViewById(R.id.button);

        botonIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView cuenta=(TextView) findViewById(R.id.texto);
                int numero=Integer.parseInt(cuenta.getText().toString());
                numero++;
                Integer numeroCam=new Integer(numero);
                cuenta.setText(numeroCam.toString());
                if(color%2==0){
                    cuenta.setTextColor(Color.RED);
                }else{
                    cuenta.setTextColor(Color.BLUE);
                }
                color++;
            }
        });
        Button botonDism=(Button)findViewById(R.id.button2);
        botonDism.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView cuenta=(TextView) findViewById(R.id.texto);
                int numero=Integer.parseInt(cuenta.getText().toString());
                if (numero>0) {
                    numero--;
                }
                Integer numeroCam=new Integer(numero);
                cuenta.setText(numeroCam.toString());
                if(color%2==0){
                    cuenta.setTextColor(Color.RED);
                    color++;
                }else{
                    cuenta.setTextColor(Color.BLUE);
                    color++;
                }
            }
        });

    }
}