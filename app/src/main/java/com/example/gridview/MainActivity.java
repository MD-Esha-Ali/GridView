package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private GridView gridView;
    String[] countryNames;
    private TextView textView;
    int[] flags={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,R.drawable.m,R.drawable.n,};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countryNames=getResources().getStringArray(R.array.contry_names);
        gridView=(GridView) findViewById(R.id.gridViewId);
        textView=(TextView) findViewById(R.id.textViewId);

        CustomAdepter adepter=new CustomAdepter(this,countryNames,flags);
        gridView.setAdapter(adepter);
    }
}
