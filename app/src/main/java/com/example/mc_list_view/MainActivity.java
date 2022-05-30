package com.example.mc_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    Button btn;
    ArrayList<String> studentlist= new ArrayList<String>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=findViewById(R.id.listview);
        btn=findViewById(R.id.btn);

        studentlist.add("Usama");
        studentlist.add("Maaz");
        studentlist.add("Wahab");
        studentlist.add("Mateeh");
        studentlist.add("Danyal");
        studentlist.add("Umer");
        studentlist.add("Qasim");
        studentlist.add("Faizan");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,studentlist);
        lv.setAdapter(arrayAdapter);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(intent);
    }
});
    }
}