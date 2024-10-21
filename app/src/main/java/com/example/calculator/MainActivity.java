package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText ghichumoi;
TextView hienthighichu;
Button btnn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ghichumoi = findViewById(R.id.themghichu);
        hienthighichu = findViewById(R.id.layghichu);
        btnn = findViewById(R.id.btn);
        init();
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ghichu ghichu = new ghichu(MainActivity.this);
                ghichu.save(ghichumoi.getText().toString());
                hienthighichu.setText(ghichu.get());
            }
        });


    }
    public  void init(){
        SharedPreferences sharedPreferences = this.getSharedPreferences("Ghichu", Context.MODE_PRIVATE);
        String ghichu =  sharedPreferences.getString("Ghichumoi", "xin chao");
        hienthighichu.setText(ghichu);
    }
}