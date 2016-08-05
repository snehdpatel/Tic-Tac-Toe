package com.example.sneh.tic_tac_toe;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class two_player extends AppCompatActivity {

    int count = 0;
    int[][] flag = new int[10][2];
    int flag_end = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        Button home = (Button) findViewById(R.id.Button1);
        Button reset = (Button) findViewById(R.id.Button2);
        final RelativeLayout rl = (RelativeLayout) findViewById(R.id.background);
        final LinearLayout l1 = (LinearLayout) findViewById(R.id.ll_game);
        rl.setBackgroundColor(Color.RED);
        l1.setBackgroundColor(Color.YELLOW);
        final ImageView img_1 = (ImageView) findViewById(R.id.main_imageView_1);
        final ImageView img_2 = (ImageView) findViewById(R.id.main_imageView_2);
        final ImageView img_3 = (ImageView) findViewById(R.id.main_imageView_3);
        final ImageView img_4 = (ImageView) findViewById(R.id.main_imageView_4);
        final ImageView img_5 = (ImageView) findViewById(R.id.main_imageView_5);
        final ImageView img_6 = (ImageView) findViewById(R.id.main_imageView_6);
        final ImageView img_7 = (ImageView) findViewById(R.id.main_imageView_7);
        final ImageView img_8 = (ImageView) findViewById(R.id.main_imageView_8);
        final ImageView img_9 = (ImageView) findViewById(R.id.main_imageView_9);


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(new Intent(two_player.this, Tic_Tac_Toe.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*finish();
                startActivity(new Intent(two_player.this, two_player.class));*/
                img_1.setImageResource(R.drawable.plain);
                img_2.setImageResource(R.drawable.plain);
                img_3.setImageResource(R.drawable.plain);
                img_4.setImageResource(R.drawable.plain);
                img_5.setImageResource(R.drawable.plain);
                img_6.setImageResource(R.drawable.plain);
                img_7.setImageResource(R.drawable.plain);
                img_8.setImageResource(R.drawable.plain);
                img_9.setImageResource(R.drawable.plain);
                img_1.setEnabled(true);
                img_2.setEnabled(true);
                img_3.setEnabled(true);
                img_4.setEnabled(true);
                img_5.setEnabled(true);
                img_6.setEnabled(true);
                img_7.setEnabled(true);
                img_8.setEnabled(true);
                img_9.setEnabled(true);
                count = 0;
                flag_end = 0;
                flag = new int[10][2];
            }
        });

        img_1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_1.setImageResource(R.drawable.index);
                        flag[1][0] = 1;
                    } else {
                        img_1.setImageResource(R.drawable.images);
                        flag[1][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });


        img_2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_2.setImageResource(R.drawable.index);
                        flag[2][0] = 1;
                    } else {
                        img_2.setImageResource(R.drawable.images);
                        flag[2][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });


        img_3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_3.setImageResource(R.drawable.index);
                        flag[3][0] = 1;
                    } else {
                        img_3.setImageResource(R.drawable.images);
                        flag[3][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1) || (flag[3][0] == 1 && flag[5][0] == 1 && flag[7][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1) || (flag[3][1] == 1 && flag[5][1] == 1 && flag[7][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });


        img_4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_4.setImageResource(R.drawable.index);
                        flag[4][0] = 1;
                    } else {
                        img_4.setImageResource(R.drawable.images);
                        flag[4][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });

        //final ImageView img_5 = (ImageView) findViewById(R.id.main_imageView_5);
        img_5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_5.setImageResource(R.drawable.index);
                        flag[5][0] = 1;
                    } else {
                        img_5.setImageResource(R.drawable.images);
                        flag[5][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });

        //final ImageView img_6 = (ImageView) findViewById(R.id.main_imageView_6);
        img_6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_6.setImageResource(R.drawable.index);
                        flag[6][0] = 1;
                    } else {
                        img_6.setImageResource(R.drawable.images);
                        flag[6][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });

        //final ImageView img_7 = (ImageView) findViewById(R.id.main_imageView_7);
        img_7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_7.setImageResource(R.drawable.index);
                        flag[7][0] = 1;
                    } else {
                        img_7.setImageResource(R.drawable.images);
                        flag[7][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1) || (flag[7][1] == 1 && flag[5][1] == 1 && flag[3][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });

        //final ImageView img_8 = (ImageView) findViewById(R.id.main_imageView_8);
        img_8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_8.setImageResource(R.drawable.index);
                        flag[8][0] = 1;
                    } else {
                        img_8.setImageResource(R.drawable.images);
                        flag[8][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });

        //final ImageView img_9 = (ImageView) findViewById(R.id.main_imageView_9);
        img_9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_LONG).show();
                } else {
                    count++;
                    if (count % 2 == 0) {
                        img_9.setImageResource(R.drawable.index);
                        flag[9][0] = 1;
                    } else {
                        img_9.setImageResource(R.drawable.images);
                        flag[9][1] = 1;
                    }
                    v.setEnabled(false);
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if(count == 9 && flag_end == 0)
                        Toast.makeText(getApplicationContext(), "Game Tie...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
