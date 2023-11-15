package com.appsuperior.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends
        AppCompatActivity {
private TextView
  ResultadoTextView,operationEditText,debug,debug2;
private EditText Operaciones;
private Button btnReiniciar,btnParentesis,btnPorcentaje,btnBarra,btn7,btn8,btn9,btnMas,btn4,btn5,btn6,btnMenos,btn1,btn2,btn3,btnMultiplicar,
        btn0,btnPunto,btnBorrar,btnIgual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ResultadoTextView = findViewById(R.id.Resultado);
        Operaciones = findViewById(R.id.Operaciones);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);
        btnReiniciar = findViewById(R.id.btnReiniciar);
        btnParentesis = findViewById(R.id.btnParentesis);
        btnPorcentaje = findViewById(R.id.btnPorcentaje);
        btnBarra = findViewById(R.id.btnBarra);
        btnMas = findViewById(R.id.btnMas);
        btnMenos = findViewById(R.id.btnMenos);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnIgual = findViewById(R.id.btnIgual);
        btnBorrar = findViewById(R.id.btnBorrar);
        btnPunto = findViewById(R.id.btnPunto);







        btnReiniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                operationEditText.setText("");
                currentNumber="";
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                borrarUltimoCaracter();
            }
        });



        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("9");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("8");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("7");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("6");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("5");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("4");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("3");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("2");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("1");
            }
        });
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                appendNumber("0");
            }
        });










    }
}