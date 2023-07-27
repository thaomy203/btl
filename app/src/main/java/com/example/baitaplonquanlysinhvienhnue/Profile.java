package com.example.baitaplonquanlysinhvienhnue;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Profile extends AppCompatActivity {
    ImageButton home;
    ImageButton edit;
    ImageButton search;
    ImageButton menu;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        addView();
        addEvents();
    }

    private void addView(){
        home = findViewById(R.id.home);
        edit = findViewById(R.id.edit);
        search = findViewById(R.id.search);
        menu = findViewById(R.id.menu);
    }
    private void addEvents(){
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Menu.class));
            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Edit.class));
                Toast.makeText(Profile.this, "edit", Toast.LENGTH_SHORT).show();
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, Search.class));
                Toast.makeText(Profile.this, "search", Toast.LENGTH_SHORT).show();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Profile.this, MainActivity.class));
                Toast.makeText(Profile.this, "home", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
