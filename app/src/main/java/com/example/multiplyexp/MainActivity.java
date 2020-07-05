package com.example.multiplyexp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Collections;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    private Spinner oneonecredit1, oneonecredit2;
    private Spinner grade;

    ArrayAdapter<String>    arrayAdapter1;

    TextView credit_sum_view, korea_score_view, america_score_view;
    Button cal_button;

    double credit_sum;
    double oneonecredit1_double, oneonecredit2_double;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayAdapter1 = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, (String[])getResources().getStringArray(R.array.credit));


        oneonecredit1 = (Spinner)findViewById(R.id.oneonecredit1);
        oneonecredit2 = (Spinner)findViewById(R.id.oneonecredit2);


        cal_button = findViewById(R.id.cal_button);
        credit_sum_view = findViewById(R.id.credit_sum_view);

        oneonecredit1.setAdapter(arrayAdapter1);
        oneonecredit2.setAdapter(arrayAdapter1);

        cal_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                credit_sum = 0;

                oneonecredit1_double = Double.parseDouble(oneonecredit1.getSelectedItem().toString());
                oneonecredit2_double = Double.parseDouble(oneonecredit2.getSelectedItem().toString());

                credit_sum = oneonecredit1_double + oneonecredit2_double;

                credit_sum_view.setText(String.format(Locale.getDefault(),"%f", credit_sum));

            }
        });





    }
}
