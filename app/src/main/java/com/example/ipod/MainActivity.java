package com.example.ipod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button botonplay,botonpause,botoncontinue,botonparar,botonrepetir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botonplay = (Button)findViewById(R.id.buttonplay);
        botonpause = (Button)findViewById(R.id.buttonpause);
        botonparar = (Button)findViewById(R.id.buttonstop);
        botonrepetir = (Button)findViewById(R.id.buttonrepetir);
    }
    public void reoroducir(View v){

    }
    public void pausar(View v){

    }
    public void parar (View v){

    }
    public void continuar(View v){

    }
    public void repetir (View v){

    }
    public void destruir(View v){

    }
}
