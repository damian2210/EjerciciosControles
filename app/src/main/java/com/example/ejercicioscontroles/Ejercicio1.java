package com.example.ejercicioscontroles;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaCodec;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Pattern;

public class Ejercicio1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);
        Button enviar=(Button)findViewById(R.id.btnEnviar);
        enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean correcto=true;
                String mensaje="";
                EditText nombre=findViewById(R.id.nombre);
                EditText correo=findViewById(R.id.correo);
                EditText tlf=findViewById(R.id.tlf);
                EditText contraseña=findViewById(R.id.contraseña);
                TextView error=findViewById(R.id.textError);
                CheckBox check1=findViewById(R.id.ch_Deportes);
                CheckBox check2=findViewById(R.id.ch_Leer);
                CheckBox check3=findViewById(R.id.ch_Videojuegos);
                if((TextUtils.isEmpty(nombre.getText())==true||nombre.getText().equals(" "))&&(TextUtils.isEmpty(correo.getText())==true||correo.getText().equals(" "))&&(TextUtils.isEmpty(tlf.getText())==true||tlf.getText().equals(" "))){
                    mensaje=mensaje+"El nombre,correo y telefono estan vacios.";
                    correcto=false;
                } else if ((TextUtils.isEmpty(nombre.getText())==true||nombre.getText().equals(" "))&&(TextUtils.isEmpty(correo.getText())==true||correo.getText().equals(" "))&&(TextUtils.isEmpty(tlf.getText())==false||!nombre.getText().equals(" "))){
                    mensaje=mensaje+"El nombre y el correo estan vacios.";
                    correcto=false;
                }else if ((TextUtils.isEmpty(nombre.getText())==true||nombre.getText().equals(" "))&&(TextUtils.isEmpty(correo.getText())==false||!correo.getText().equals(" "))&&(TextUtils.isEmpty(tlf.getText())==true||tlf.getText().equals(" "))){
                    mensaje=mensaje+"El nombre y el telefono estan vacios.";
                    correcto=false;
                }else if ((TextUtils.isEmpty(nombre.getText())==false||!nombre.getText().equals(" "))&&(TextUtils.isEmpty(correo.getText())==true||correo.getText().equals(" "))&&(TextUtils.isEmpty(tlf.getText())==true||tlf.getText().equals(" "))){
                    mensaje=mensaje+"El correo y el telefono estan vacios.";
                    correcto=false;
                } else if (TextUtils.isEmpty(nombre.getText())==true||nombre.getText().equals(" ")) {
                    mensaje=mensaje+"El nombre esta vacio.";
                    correcto=false;
                } else if (TextUtils.isEmpty(correo.getText())==true||correo.getText().equals(" ")) {
                    mensaje=mensaje+"El correo esta vacio.";
                    correcto=false;
                } else if (TextUtils.isEmpty(tlf.getText())==true||tlf.getText().equals(" ")) {
                    mensaje=mensaje+"El telefono esta vacio.";
                    correcto=false;
                }
                if(!Patterns.EMAIL_ADDRESS.matcher(correo.getText()).matches()){
                   mensaje=mensaje+"El email no es valido.";
                   correcto=false;
               }
               if(check1.isChecked()==false&&check2.isChecked()==false&&check3.isChecked()==false){
                   mensaje=mensaje+"Hay que seleccionar una aficcion.";
                   correcto=false;
               }
               if(!contraseña.getText().equals("ejerciciO3")){
                   mensaje=mensaje+"Contraseña incorrecta.";
                   correcto=false;
               }
               if(correcto==true){
                   error.setText("");
                   Toast.makeText(Ejercicio1.this, "Enviado", Toast.LENGTH_SHORT).show();
               }else{
                   error.setText(mensaje);
               }
            }
        });
    }
}