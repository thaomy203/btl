package com.example.baitaplonquanlysinhvienhnue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {
//    ImageButton home;
//    ImageButton edit;
//    ImageButton search;
//    ImageButton menu;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//        addView();
//        addEvents();
//    }
//    private void addView(){
//        home=findViewById(R.id.home);
//        edit=findViewById(R.id.edit);
//        search=findViewById(R.id.search);
//        menu=findViewById(R.id.menu);
//    }
//    private void addEvents(){
//        edit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentEdit=new Intent(MainActivity.this,Edit.class);
//                startActivity(intentEdit);
//                Toast.makeText(MainActivity.this, "edit", Toast.LENGTH_SHORT).show();
//
//            }
//        });
//        search.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentEdit=new Intent(MainActivity.this,Search.class);
//                startActivity(intentEdit);
//                Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
//            }
//        });
//        menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentEdit=new Intent(MainActivity.this,Menu.class);
//                startActivity(intentEdit);
//                Toast.makeText(MainActivity.this, "menu", Toast.LENGTH_SHORT).show();
//            }
//        });
//    }
//}

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ImageButton home;
    ImageButton edit;
    ImageButton search;
    ImageButton menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        addEvents();
    }

    private void addView(){
        home=findViewById(R.id.home);
        edit=findViewById(R.id.edit);
        search=findViewById(R.id.search);
        menu=findViewById(R.id.menu);
    }

    private void addEvents(){
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Edit.class));
                Toast.makeText(MainActivity.this, "edit", Toast.LENGTH_SHORT).show();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Search.class));
                Toast.makeText(MainActivity.this, "search", Toast.LENGTH_SHORT).show();
            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Menu.class));
                Toast.makeText(MainActivity.this, "menu", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
