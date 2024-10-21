package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

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
//init();
        ghichumoi = findViewById(R.id.themghichu);
        hienthighichu = findViewById(R.id.layghichu);
        btnn = findViewById(R.id.btn);
        ghichu ghichu = new ghichu(this);
        ghichu.save(ghichumoi.getText().toString());
        btnn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ghichu ghichu = new ghichu(MainActivity.this);
                hienthighichu.setText(ghichu.get());
            }
        });


    }
//    public  void init(){
//        ghichu ghichu = new ghichu(this);
//        if (ghichu.get()!="")
//        hienthighichu.setText(ghichu.get().toString());
//        else hienthighichu.setText("Hãy nhập ghi chú");
//    }
}