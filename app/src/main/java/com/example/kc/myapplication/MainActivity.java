package com.example.kc.myapplication;


import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    Button b1, b2, b3,b4,b5,b6,b7,b8,b9,b10;

    public TextView te1;

    public int score=0,count=0,extra=0,out=0;





        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            b1 = findViewById(R.id.btn1);

            b2 = findViewById(R.id.btn2);

            b3 = findViewById(R.id.btn3);

            b4 = findViewById(R.id.btn4);

            b5 = findViewById(R.id.btn5);

            b6 = findViewById(R.id.btn6);

            b7 = findViewById(R.id.btn7);

            b8 = findViewById(R.id.btn8);

            b9 = findViewById(R.id.btn9);

            b10 = findViewById(R.id.btn10);

            te1 = findViewById(R.id.t1);





                b1.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 1;

                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b2.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 2;

                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b3.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 3;

                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b4.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 4;
                        count++;
                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b5.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 6;
                        count++;
                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b6.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 1;
                        extra++;
                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b7.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 1;
                        extra++;
                        te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b8.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {

                        out++;
                        if (out==10){
                            te1.setText("Innings Completed\nScore is "+(Integer.toString(score)+("/")+(Integer.toString(out))));
                            b1.setEnabled(false);
                            b2.setEnabled(false);
                            b3.setEnabled(false);
                            b4.setEnabled(false);
                            b5.setEnabled(false);
                            b6.setEnabled(false);
                            b7.setEnabled(false);
                            b8.setEnabled(false);
                            b9.setEnabled(false);
                            b10.setEnabled(false);
                        }
                        else
                            te1.setText(Integer.toString(score) + ("/") + Integer.toString(out));

                    }


                });


                b9.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {
                        score = score + 1;

                        te1.setText(Integer.toString(extra));

                    }


                });


                b10.setOnClickListener(new View.OnClickListener() {


                    @Override
                    public void onClick(View V) {


                        te1.setText(Integer.toString(count));

                    }


                });





        }
}


