package com.example.cutoff;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;

public class MSActivity extends AppCompatActivity {

    private EditText tbio,tphy,tchem,res;
    private Button cal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ms);

        tbio=findViewById(R.id.tbio);
        tphy=findViewById(R.id.tphy);
        tchem=findViewById(R.id.tchem);
        cal=findViewById(R.id.cbut);
        res=findViewById(R.id.res);

        tchem.setOnFocusChangeListener(new View.OnFocusChangeListener() {
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
                Double a= Double.parseDouble(tbio.getText().toString())/2;
                Double b= Double.parseDouble(tphy.getText().toString())/4;
                Double c= Double.parseDouble(tchem.getText().toString())/4;
                if(a==null || b==null || c==null)
                    res.setText(0);
                Double d=a+b+c;
                res.setText(Double.toString(d));
            }
        });
    }
}
