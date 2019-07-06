package com.juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Rmultiplayer extends AppCompatActivity {

    Button btnJugar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rmultiplayer);

        btnJugar =(Button)findViewById(R.id.btnJugar);

        btnJugar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnJugar = new Intent(Rmultiplayer.this,NivelUno.class);
                startActivity(btnJugar);
            }
        });
    }
}
