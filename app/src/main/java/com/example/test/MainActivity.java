package com.example.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView Tvprincipal;
    private Button Btnprincipal;
    private EditText EtPrincipal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tvprincipal = findViewById(R.id.textView);
        Btnprincipal = findViewById(R.id.btnprincipal);
        EtPrincipal = findViewById(R.id.e_text);
        Btnprincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text = EtPrincipal.getText().toString();
                Tvprincipal.setText(text);
                Tvprincipal.setTextColor(getResources().getColor(R.color.purple_500));
            }
        });
    }
}