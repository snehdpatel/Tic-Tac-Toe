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

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Infinite_tic_tac_toe extends AppCompatActivity {

    int count = 0;
    int count_X = 0;
    int count_O = 0;
    int[][] flag = new int[10][2];
    int flag_end = 0;
    Queue<ImageView> X = new ConcurrentLinkedQueue<ImageView>();
    Queue<ImageView> O = new ConcurrentLinkedQueue<ImageView>();
    Queue<Integer> XO = new ConcurrentLinkedQueue<Integer>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infinite_tic_tac_toe);

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
                startActivity(new Intent(Infinite_tic_tac_toe.this, Tic_Tac_Toe.class));
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*finish();
                startActivity(new Intent(Infinite_tic_tac_toe.this, Infinite_tic_tac_toe.class));*/
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
                count_O = 0;
                count_X = 0;
                flag_end = 0;
                flag = new int[10][2];
                O.clear();
                X.clear();
                XO.clear();
            }
        });


        img_1.setOnClickListener(new View.OnClickListener() {

            //@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View v) {

                if (flag_end == 1) {
                    v.setEnabled(false);
                    Toast.makeText(getApplicationContext(), "Game over...", Toast.LENGTH_SHORT).show();
                } else {
                    v.setEnabled(false);
                    XO.add(1);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_1.setImageResource(R.drawable.index);
                        O.add(img_1);
                        if(count_O >= 4) {
                            O.peek().setImageResource(R.drawable.plain);
                            O.remove().setEnabled(true);
                            if(count >= 6){
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[1][0] = 1;
                    } else {
                        count_X++;
                        img_1.setImageResource(R.drawable.images);
                        X.add(img_1);
                        if(count_X >= 4) {
                            X.peek().setImageResource(R.drawable.plain);
                            X.remove().setEnabled(true);
                            if(count >= 6){
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[1][1] = 1;
                    }
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_SHORT).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_SHORT).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(2);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_2.setImageResource(R.drawable.index);
                        O.add(img_2);
                        if(count_O >= 4) {
                            O.peek().setImageResource(R.drawable.plain);
                            O.remove().setEnabled(true);
                            if(count >= 6){
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[2][0] = 1;
                    } else {
                        count_X++;
                        img_2.setImageResource(R.drawable.images);
                        X.add(img_2);
                        if(count_X >= 4){
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if(count >= 6){
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[2][1] = 1;
                    }
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(3);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_3.setImageResource(R.drawable.index);
                        O.add(img_3);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if(count >= 6){
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[3][0] = 1;
                    } else {
                        count_X++;
                        img_3.setImageResource(R.drawable.images);
                        X.add(img_3);
                        if(count_X >= 4){
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if(count >= 6){
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[3][1] = 1;
                    }
                    if ((flag[1][0] == 1 && flag[2][0] == 1 && flag[3][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1) || (flag[3][0] == 1 && flag[5][0] == 1 && flag[7][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[1][1] == 1 && flag[2][1] == 1 && flag[3][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1) || (flag[3][1] == 1 && flag[5][1] == 1 && flag[7][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(4);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_4.setImageResource(R.drawable.index);
                        O.add(img_4);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[4][0] = 1;
                    } else {
                        count_X++;
                        img_4.setImageResource(R.drawable.images);
                        X.add(img_4);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[4][1] = 1;
                    }
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(5);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_5.setImageResource(R.drawable.index);
                        O.add(img_5);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[5][0] = 1;
                    } else {
                        count_X++;
                        img_5.setImageResource(R.drawable.images);
                        X.add(img_5);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[5][1] = 1;
                    }
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(6);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_6.setImageResource(R.drawable.index);
                        O.add(img_6);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[6][0] = 1;
                    } else {
                        count_X++;
                        img_6.setImageResource(R.drawable.images);
                        X.add(img_6);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[6][1] = 1;
                    }
                    if ((flag[4][0] == 1 && flag[5][0] == 1 && flag[6][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[4][1] == 1 && flag[5][1] == 1 && flag[6][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(7);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_7.setImageResource(R.drawable.index);
                        O.add(img_7);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[7][0] = 1;
                    } else {
                        count_X++;
                        img_7.setImageResource(R.drawable.images);
                        X.add(img_7);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[7][1] = 1;
                    }
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[1][0] == 1 && flag[4][0] == 1 && flag[7][0] == 1) || (flag[7][0] == 1 && flag[5][0] == 1 && flag[3][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[1][1] == 1 && flag[4][1] == 1 && flag[7][1] == 1) || (flag[7][1] == 1 && flag[5][1] == 1 && flag[3][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(8);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_8.setImageResource(R.drawable.index);
                        O.add(img_8);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[8][0] = 1;
                    } else {
                        count_X++;
                        img_8.setImageResource(R.drawable.images);
                        X.add(img_8);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[8][1] = 1;
                    }
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[2][0] == 1 && flag[5][0] == 1 && flag[8][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[2][1] == 1 && flag[5][1] == 1 && flag[8][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
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
                    v.setEnabled(false);
                    XO.add(9);
                    count++;
                    if (count % 2 == 0) {
                        count_O++;
                        img_9.setImageResource(R.drawable.index);
                        O.add(img_9);
                        if(count_O >= 4) {
                            O.peek().setEnabled(true);
                            O.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][0] = 0;
                            }
                        }
                        flag[9][0] = 1;
                    } else {
                        count_X++;
                        img_9.setImageResource(R.drawable.images);
                        X.add(img_9);
                        if(count_X >= 4) {
                            X.peek().setEnabled(true);
                            X.remove().setImageResource(R.drawable.plain);
                            if (count >= 6) {
                                flag[XO.remove()][1] = 0;
                            }
                        }
                        flag[9][1] = 1;
                    }
                    if ((flag[7][0] == 1 && flag[8][0] == 1 && flag[9][0] == 1) || (flag[3][0] == 1 && flag[6][0] == 1 && flag[9][0] == 1) || (flag[1][0] == 1 && flag[5][0] == 1 && flag[9][0] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 2 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                    if ((flag[7][1] == 1 && flag[8][1] == 1 && flag[9][1] == 1) || (flag[3][1] == 1 && flag[6][1] == 1 && flag[9][1] == 1) || (flag[1][1] == 1 && flag[5][1] == 1 && flag[9][1] == 1)) {
                        Toast.makeText(getApplicationContext(), "Player 1 wins!", Toast.LENGTH_LONG).show();
                        flag_end = 1;
                    }
                }
            }
        });
    }
}
