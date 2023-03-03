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
    private int count = 0;
    private Button suma;
    private Button resta;
    private Button divi;
    private Button multi;
    private Button delete;
    private TextView numero1;
    private TextView numero2;
    private Button n0;
    private Button n1;
    private Button n2;
    private Button n3;
    private Button n4;
    private Button n5;
    private Button n6;
    private Button n7;
    private Button n8;
    private Button n9;
    private Button equals1;
    double num1 = 0.0;
    double num2 = 0.0;
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tvprincipal = findViewById(R.id.textView);
        numero1 = findViewById(R.id.number);
        numero2 = findViewById(R.id.number2);
        delete = findViewById(R.id.bpoint);
        suma = findViewById(R.id.bplus);
        resta = findViewById(R.id.bminus);
        multi = findViewById(R.id.bmultiply);
        divi = findViewById(R.id.bdivide);
        n0 = findViewById(R.id.b0);
        n1 = findViewById(R.id.b1);
        n2 = findViewById(R.id.b2);
        n3 = findViewById(R.id.b3);
        n4 = findViewById(R.id.b4);
        n5 = findViewById(R.id.b5);
        n6 = findViewById(R.id.b6);
        n7 = findViewById(R.id.b7);
        n8 = findViewById(R.id.b8);
        n9 = findViewById(R.id.b9);
        equals1 = findViewById(R.id.bequal);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String empty = "";
                Tvprincipal.setText(empty);
                numero1.setText(empty);
                numero2.setText(empty);
                op = "";
            }
        });
        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "+";
                guardarNum(view);
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "-";
                guardarNum(view);
            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "*";
                guardarNum(view);
            }
        });

        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                op = "/";
                guardarNum(view);
            }
        });

        n0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("0");
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("1");
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("2");
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("3");
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("4");
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("5");
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("6");
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("7");
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("8");
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Tvprincipal.append("9");
            }
        });
        equals1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultado(view);
            }
        });
    }

    public void guardarNum(View view) {
        num1 = Double.parseDouble(Tvprincipal.getText().toString());
        Tvprincipal.setText("");
        numero1.setText(num1 + "");

    }

    public void resultado(View view) {
        double result = 0.0;
        num2 = Double.parseDouble(Tvprincipal.getText().toString());
        numero2.setText(num2 + "");
        if (op == "+") {
            result = num1 + num2;
            Tvprincipal.setText(result + "");
        } else if (op == "-") {
            result = num1 - num2;
            Tvprincipal.setText(result + "");
        } else if (op == "*") {
            result = num1 * num2;
            Tvprincipal.setText(result + "");

        } else if (op == "/") {
            if (num2 != 0) {
                result = num1 / num2;
                Tvprincipal.setText(result + "");
            } else {
                String rest = "Ingresa un valor diferente a cero";
                Tvprincipal.setText(rest + "");
            }
        }
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    String rest = "Ingresa un valor diferente a cero";
                    Tvprincipal.setText(rest);
                    return;
                }
                result = num1 / num2;
                break;
        }
        String resultStr = Double.toString(result);
        Tvprincipal.setText(resultStr);
        op = "";

    }
}
