package com.example.mrdaxesh.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePicker picker;
    TextView textview1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        picker=(DatePicker)findViewById(R.id.datePicker1);
        textview1=(TextView)findViewById(R.id.textView1);


        picker.init(picker.getMonth(),picker.getYear(), picker.getDayOfMonth(), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                textview1.setText(picker.getDayOfMonth()+"/"+picker.getMonth()+"/"+picker.getYear());
            }
        });
    }




}
