package com.example.samue.assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {
   public Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnPlus, btnMinus, btnDivide,
            btnMultiply, btnBack,  btnClear,  btnPlusMinus,  btnCalculate, btnDecimal;
   static public TextView tvCalculation, textView2;
   static public String operation;
   static public Boolean plusMinus, resultCalculated;
   static public int firstNum, secondNum, count;
   static public Double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        btn7 = findViewById(R.id.button7);
        btn8 = findViewById(R.id.button8);
        btn9 = findViewById(R.id.button9);
        btn0 = findViewById(R.id.button10);
        btnPlus = findViewById(R.id.button13);
        btnMinus = findViewById(R.id.button14);
        btnDivide = findViewById(R.id.button16);
        btnMultiply = findViewById(R.id.button15);
        btnPlusMinus = findViewById(R.id.button12);
        btnDecimal = findViewById(R.id.button11);
        btnBack = findViewById(R.id.button17);
        btnClear = findViewById(R.id.button18);
        btnCalculate = findViewById(R.id.button19);
        tvCalculation = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        firstNum = 0;
        secondNum = 0;
        result = 0.0;
        final Operators operators = new Operators();
        operation = "";
        plusMinus = Boolean.FALSE;
        resultCalculated = Boolean.FALSE;
        count = 1;

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("1");
            }
        });

        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("2");
            }
        });

        btn3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("3");
            }
        });

        btn4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("4");
            }
        });

        btn5.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("5");
            }
        });

        btn6.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("6");
            }
        });

        btn7.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("7");
            }
        });

        btn8.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("8");
            }
        });

        btn9.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("9");
            }
        });

        btn0.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.append("0");
            }
        });

        btnPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCalculation.getText().toString().isEmpty() || tvCalculation.getText().toString().matches("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"))
                {
                    textView2.setText(tvCalculation.getText());
                    tvCalculation.setText(null);
                    tvCalculation.append("+");
                    operation = "+";
                }
                else if(tvCalculation.getText().toString().equals("+") || tvCalculation.getText().toString().equals("-")
                        || tvCalculation.getText().toString().equals("*") || tvCalculation.getText().toString().equals("/"))
                {
                    tvCalculation.setText("+");
                    operation = "+";
                }
            }
        });

        btnMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCalculation.getText().toString().isEmpty() || tvCalculation.getText().toString().matches("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"))
                {
                    textView2.setText(tvCalculation.getText());
                    tvCalculation.setText(null);
                    tvCalculation.append("-");
                    operation = "-";
                }
                else if(tvCalculation.getText().toString().equals("+") || tvCalculation.getText().toString().equals("-")
                        || tvCalculation.getText().toString().equals("*") || tvCalculation.getText().toString().equals("/"))
                {
                    tvCalculation.setText("-");
                    operation = "-";
                }
            }
        });

        btnMultiply.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCalculation.getText().toString().isEmpty() || tvCalculation.getText().toString().matches("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"))
                {
                    textView2.setText(tvCalculation.getText());
                    tvCalculation.setText(null);
                    tvCalculation.append("*");
                    operation = "*";
                }
                else if(tvCalculation.getText().toString().equals("+") || tvCalculation.getText().toString().equals("-")
                        || tvCalculation.getText().toString().equals("*") || tvCalculation.getText().toString().equals("/"))
                {
                    tvCalculation.setText("*");
                    operation = "*";
                }
            }
        });

        btnDivide.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCalculation.getText().toString().isEmpty() || tvCalculation.getText().toString().matches("[+-]?[0-9]+(\\.[0-9]+)?([Ee][+-]?[0-9]+)?"))
                {
                    textView2.setText(tvCalculation.getText());
                    tvCalculation.setText(null);
                    tvCalculation.append("/");
                    operation = "/";
                }
                else if(tvCalculation.getText().toString().equals("+") || tvCalculation.getText().toString().equals("-")
                        || tvCalculation.getText().toString().equals("*") || tvCalculation.getText().toString().equals("/"))
                {
                    tvCalculation.setText("/");
                    operation = "/";
                }
            }
        });

        btnDecimal.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tvCalculation.getText().toString().equals("") || tvCalculation.getText().toString().equals("0."))
                {
                    tvCalculation.setText("0.");
                }
                else
                {
                    tvCalculation.append(".");
                }
            }
        });

        btnPlusMinus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(plusMinus == Boolean.FALSE)
                {
                    if(tvCalculation.getText().toString().isEmpty())
                    {
                        tvCalculation.setText("-");
                        plusMinus = Boolean.TRUE;
                    }
                    else if(!tvCalculation.getText().toString().isEmpty())
                    {
                        if(tvCalculation.getText().toString().contains("+") || tvCalculation.getText().toString().contains("-") ||
                                tvCalculation.getText().toString().contains("*") || tvCalculation.getText().toString().contains("/"))
                        {
                            tvCalculation.getEditableText().insert(1, " -");
                        }
                        else if(tvCalculation.getText().toString().matches("[0-9]+"))
                        {
                            tvCalculation.getEditableText().insert(0, " -");
                            plusMinus = Boolean.TRUE;
                        }
                    }
                }
                else if(plusMinus == Boolean.TRUE)
                {
                    tvCalculation.getEditableText().replace(0,1,"");
                    plusMinus = Boolean.FALSE;
                }
            }
        });

        btnBack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvCalculation.getText().toString().isEmpty())
                {
                    String str = tvCalculation.getText().toString();
                    str = str.substring(0, str.length() - 1);
                    tvCalculation.setText(str);
                }
                else if(tvCalculation.getText().toString().isEmpty() || !textView2.getText().toString().isEmpty())
                {
                    tvCalculation.setText(textView2.getText());
                    textView2.setText("");
                }
            }
        });

        btnClear.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                tvCalculation.setText("");
                textView2.setText("");
            }
        });

        btnCalculate.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!tvCalculation.getText().toString().isEmpty() && !textView2.getText().toString().isEmpty())
                {
                    if (operation.equals("+")) {
                        operators.add();
                    }
                    else if (operation.equals("-")) {
                        operators.subtract();
                    }
                    else if (operation.equals("*")) {
                        operators.multiply();
                    }
                    else if (operation.equals("/")) {
                        operators.divide();
                    }
                }
                else if(operation.equals(""))
                {
                    tvCalculation.setText("");
                    textView2.setText("");
                }
            }
        });
    }
}
