package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    // Declaração das variáveis;
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSubs, buttonDivide,
            buttonMulti, buttonPoint, buttonC, buttonResult;
    EditText inputNumbers;
    float firstValue, secondValue;
    boolean add, subs, multi, divide;

    // Método principal que faz a criação das elementos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Referência do layout;
        setContentView(R.layout.activity_main);

        // Referência dos elementos do layout;
        // Botões numéricos;
        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        // Botões não núméricos;
        buttonPoint = (Button) findViewById(R.id.buttonPoint);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonResult = (Button) findViewById(R.id.buttonResult);
        // Botões com as operações;
        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonSubs = (Button) findViewById(R.id.buttonSubs);
        buttonMulti = (Button) findViewById(R.id.buttonMulti);
        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        // Campo que imprime os valores;
        inputNumbers = (EditText) findViewById(R.id.textInputNumbers);

        // Funções que imprime os números dos botões;
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "9");
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + "0");
            }
        });

        // Funções que ativa as operações para o cálculo;
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputNumbers == null) {
                    inputNumbers.setText("");
                } else {
                    firstValue = Float.parseFloat(inputNumbers.getText() + "");
                    add = true;
                    inputNumbers.setText(null);
                }
            }
        });

        buttonSubs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputNumbers == null) {
                    inputNumbers.setText("");
                } else {
                    firstValue = Float.parseFloat(inputNumbers.getText() + "");
                    subs = true;
                    inputNumbers.setText(null);
                }
            }
        });

        buttonMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputNumbers == null) {
                    inputNumbers.setText("");
                } else {
                    firstValue = Float.parseFloat(inputNumbers.getText() + "");
                    multi = true;
                    inputNumbers.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (inputNumbers == null) {
                    inputNumbers.setText("");
                } else {
                    firstValue = Float.parseFloat(inputNumbers.getText() + "");
                    divide = true;
                    inputNumbers.setText(null);
                }
            }
        });

        // Função que faz o cálculos e imprime o valor final;
        buttonResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondValue = Float.parseFloat(inputNumbers.getText() + "");

                if (add) {
                    inputNumbers.setText(firstValue + secondValue + "");
                    add = false;
                }

                if (subs) {
                    inputNumbers.setText(firstValue - secondValue + "");
                    subs = false;
                }

                if (multi) {
                    inputNumbers.setText(firstValue * secondValue + "");
                    multi = false;
                }

                if (divide) {
                    inputNumbers.setText(firstValue / secondValue + "");
                    divide = false;
                }
            }


        });

        // Função que limpa o campo de números;
        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText("");
            }
        });

        // Função que adiciona um ponto;
        buttonPoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputNumbers.setText(inputNumbers.getText() + ".");
            }
        });
    }
}