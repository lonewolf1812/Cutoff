package com.example.cutoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class ArtsActivity extends AppCompatActivity {

    private EditText tcomm, teco, tacc, tcsbm, res;
    private Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts);

        tcomm = findViewById(R.id.tcomm);
        teco = findViewById(R.id.teco);
        tacc = findViewById(R.id.tacc);
        tcsbm = findViewById(R.id.tcsbm);
        cal = findViewById(R.id.cbut);
        res = findViewById(R.id.res);

        tcsbm.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if (!hasFocus) {
                    hideKeyboard(v);
                }
            }
            public void hideKeyboard(View view) {
                InputMethodManager inputMethodManager =(InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double a = Double.parseDouble(teco.getText().toString()) / 4;
                Double b = Double.parseDouble(tcomm.getText().toString()) / 4;
                Double c = Double.parseDouble(tacc.getText().toString()) / 4;
                Double d = Double.parseDouble(tcsbm.getText().toString()) / 4;
                if (a == null || b == null || c == null || d == null)
                    res.setText("0");
                Double e = a + b + c + d;
                res.setText(Double.toString(e));
            }

        });
    }
}