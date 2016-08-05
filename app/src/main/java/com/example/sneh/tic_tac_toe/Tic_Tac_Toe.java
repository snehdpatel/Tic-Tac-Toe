package com.example.sneh.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;


public class Tic_Tac_Toe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic__tac__toe);

        final ImageView img_2_3 = (ImageView) findViewById(R.id.main_2_imageView_3);
        final ImageView img_2_7 = (ImageView) findViewById(R.id.main_2_imageView_7);
        final ImageView img_2_8 = (ImageView) findViewById(R.id.main_2_imageView_8);

        img_2_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        img_2_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Tic_Tac_Toe.this, two_player.class));
            }
        });

        img_2_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(Tic_Tac_Toe.this, Infinite_tic_tac_toe.class));
            }
        });
    }
}
