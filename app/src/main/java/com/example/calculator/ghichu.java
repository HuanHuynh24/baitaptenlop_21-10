package com.example.calculator;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.List;

public class ghichu {
    Context context;
    List<String> lists;
    public ghichu(Context context){
        this.context = context;
    }
    public void save(String ghichu) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Ghichu", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        editor.putString("Ghichumoi", ghichu);
        editor.commit();
    }
    public  String get() {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Ghichu", Context.MODE_PRIVATE);
        String ghichu =  sharedPreferences.getString("Ghichumoi", null);
        return  ghichu;
    }
}
