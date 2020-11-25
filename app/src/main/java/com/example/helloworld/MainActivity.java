package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  Button button;
  Button buttons;
  TextView textView;
  EditText editText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button2);
        buttons = findViewById(R.id.button4);
        textView = findViewById(R.id.texte);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.texte)).setTextColor(getResources().getColor(R.color.colorAccent));
            }
        });

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               findViewById(R.id.backgroud).setBackgroundColor(getResources().getColor(R.color.black));
            }
        });

            buttons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((TextView) findViewById(R.id.texte)).setText("Android is awesome");
            }
        });

            findViewById(R.id.backgroud).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    textView.setText("Hello awesom");
                    textView.setTextColor(getResources().getColor(R.color.black));
                    findViewById(R.id.backgroud).setBackgroundColor(getResources().getColor(R.color.colorAccent));
                }
            });

            findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String sortie = ((EditText) findViewById(R.id.editText)).getText().toString();

                            if(sortie.isEmpty()){
                                textView.setText("Enter your own text");

                            }else {
                                textView.setText(sortie);
                            }
                }
            });
    }
}

