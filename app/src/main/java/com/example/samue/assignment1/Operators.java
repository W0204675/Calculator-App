package com.example.samue.assignment1;

public class Operators {
    public void add() {
        double one = Double.parseDouble(MainActivity.textView2.getText().toString());
        double two = Double.parseDouble(MainActivity.tvCalculation.getText().toString().replaceAll("[^0-9.]", ""));
        if(MainActivity.plusMinus == Boolean.FALSE)
        {
            MainActivity.result = one + two;
        }
        else if(MainActivity.plusMinus == Boolean.TRUE)
        {
            MainActivity.result = one + -two;
        }

        String tv2 = MainActivity.textView2.getText() + " " + MainActivity.tvCalculation.getText().toString().substring(0,1) + " " + MainActivity.tvCalculation.getText().toString().substring(1,MainActivity.tvCalculation.length());
        MainActivity.textView2.setText(tv2);
        MainActivity.tvCalculation.setText(String.valueOf(MainActivity.result));
        MainActivity.operation = "";
    }

    public void subtract() {
        double one = Double.parseDouble(MainActivity.textView2.getText().toString());
        double two = Double.parseDouble(MainActivity.tvCalculation.getText().toString().replaceAll("[^0-9.]", ""));
        if(MainActivity.plusMinus == Boolean.FALSE)
        {
            MainActivity.result = one - two;
            String tv2 = MainActivity.textView2.getText() + " " + MainActivity.tvCalculation.getText().toString().substring(0,1) + " " + MainActivity.tvCalculation.getText().toString().substring(1,MainActivity.tvCalculation.length());
            MainActivity.textView2.setText(tv2);
            MainActivity.tvCalculation.setText(String.valueOf(MainActivity.result));
            MainActivity.operation = "";
        }
        else if(MainActivity.plusMinus == Boolean.TRUE)
        {
            MainActivity.result = one - -two;
            String tv2 = MainActivity.textView2.getText() + " " + MainActivity.tvCalculation.getText().toString().substring(0,1) + " " + MainActivity.tvCalculation.getText().toString().substring(1,MainActivity.tvCalculation.length());
            MainActivity.textView2.setText(tv2);
            MainActivity.tvCalculation.setText(String.valueOf(MainActivity.result));
            MainActivity.operation = "";
        }
    }


    public void multiply() {
        double one = Double.parseDouble(MainActivity.textView2.getText().toString());
        double two = Double.parseDouble(MainActivity.tvCalculation.getText().toString().replaceAll("[^0-9.]", ""));
        if(MainActivity.plusMinus == Boolean.FALSE)
        {
            MainActivity.result = one * two;
        }
        else if(MainActivity.plusMinus == Boolean.TRUE)
        {
            MainActivity.result = one * -two;
        }
        String tv2 = MainActivity.textView2.getText() + " " + MainActivity.tvCalculation.getText().toString().substring(0,1) + " " + MainActivity.tvCalculation.getText().toString().substring(1,MainActivity.tvCalculation.length());
        MainActivity.textView2.setText(tv2);
        MainActivity.tvCalculation.setText(String.valueOf(MainActivity.result));
        MainActivity.operation = "";
    }

    public void divide() {
        double one = Double.parseDouble(MainActivity.textView2.getText().toString());
        double two = Double.parseDouble(MainActivity.tvCalculation.getText().toString().replaceAll("[^0-9.]", ""));
        if(MainActivity.plusMinus == Boolean.FALSE)
        {
            MainActivity.result = one / two;
        }
        else if(MainActivity.plusMinus == Boolean.TRUE)
        {
            MainActivity.result = one / -two;
        }
        String tv2 = MainActivity.textView2.getText() + " " + MainActivity.tvCalculation.getText().toString().substring(0,1) + " " + MainActivity.tvCalculation.getText().toString().substring(1,MainActivity.tvCalculation.length());
        MainActivity.textView2.setText(tv2);
        MainActivity.tvCalculation.setText(String.valueOf(MainActivity.result));
        MainActivity.operation = "";
        if(MainActivity.result.isInfinite())
        {
            String msg = "Division by Zero";
            MainActivity.tvCalculation.setText(msg);
        }
    }
}
