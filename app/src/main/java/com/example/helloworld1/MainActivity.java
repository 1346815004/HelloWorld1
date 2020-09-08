package com.example.helloworld1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        final EditText e1 = findViewById(R.id.editTextTextPersonName1);
//        final String s1 = e1.getText().toString();
////        e1.setText(s1+"芜湖起飞");
//
//        Button b1 = (Button)findViewById(R.id.button1);
//        b1.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view) {
//               e1.setText("别点了");
//            }
//
//        });
    }

    public void testtest(View view) {
        EditText e1 = findViewById(R.id.editTextTextPersonName1);
        e1.setText("别点了");
    }
}