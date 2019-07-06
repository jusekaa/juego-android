package com.juego;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnplayer,btnMultiPlayer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnplayer = (ImageButton)findViewById(R.id.btnPlayer);
        btnMultiPlayer = (ImageButton)findViewById(R.id.btnMultiplayer);

        btnplayer.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    Intent btnPlayer = new Intent(MainActivity.this,Rplayer.class);
                    startActivity(btnPlayer);

                }

        });

        btnMultiPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent btnMultiPlayer = new Intent(MainActivity.this,Rmultiplayer.class);
                startActivity(btnMultiPlayer);
            }
        });









    }


}
