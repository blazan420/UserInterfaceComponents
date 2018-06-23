package com.example.kevin.userinterfacecomponents;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.MultiAutoCompleteTextView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtValue;
    EditText edtValue;
    AutoCompleteTextView autoCompleteTextView;
    MultiAutoCompleteTextView multiAutoCompleteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtValue = (TextView) findViewById(R.id.txtValue);
        edtValue = (EditText) findViewById(R.id.edtValue);
        autoCompleteTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        //multiAutoCompleteTextView = (multiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);


        txtValue.setText("Awesome!");
        txtValue.setBackgroundColor(Color.BLUE);

        txtValue.setOnClickListener(MainActivity.this);




    }

    @Override
    public void onClick(View view) {
        txtValue.setTextColor(Color.RED);
    }
}
