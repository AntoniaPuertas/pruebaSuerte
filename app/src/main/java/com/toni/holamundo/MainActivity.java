package com.toni.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtHolaMundo;
    String[] frases;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtHolaMundo = findViewById(R.id.txtHolaMundo);

        frases = new String[5];
        frases[0] = "Te va a tocar la lotería";
        frases[1] = "No vas a tener errores en el código";
        frases[2] = "Todos los alumnos aprobaran";
        frases[3] = "Me va a salir un proyecto muy chulo";
        frases[4] = "El domingo, cuando vaya de excursión, no me va a llover";
    }


    public void generarSaludo(View view) {
        //Generar un número aleatorio
        int num = (int)(Math.random()*5);
        //Mostrar la frase del array
        txtHolaMundo.setText(frases[num]);
    }
}