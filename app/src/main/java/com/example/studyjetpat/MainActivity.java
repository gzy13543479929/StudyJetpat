package com.example.studyjetpat;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.studyjetpat.ViewModel.MyStudyViewModel;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView textView1;
    Button button1,button2;
    MyStudyViewModel myStudyViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = findViewById(R.id.textView1);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
         myStudyViewModel = ViewModelProviders.of(this).get(MyStudyViewModel.class);
//         myStudyViewModel.getNumber().observe(this,);
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                Toast.makeText(this,"你点击了button1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button2:
                Toast.makeText(this,"你点击了button2",Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
