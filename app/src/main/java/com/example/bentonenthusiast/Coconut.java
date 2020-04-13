package com.example.bentonenthusiast;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Coconut extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coconut);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Shea Butter and Coconut Hand Cream");
        }
        bottomNavigationView = (BottomNavigationView) findViewById(R.id.btm_nav);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.action_product :
                        Intent a = new Intent(Coconut.this, MainActivity.class);
                        startActivity(a);
                        Toast.makeText(Coconut.this, "Product", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_tips :
                        Intent b = new Intent(Coconut.this, Tips.class);
                        startActivity(b);
                        Toast.makeText(Coconut.this, "Tips For Your Skin", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.action_about :
                        Intent c = new Intent(Coconut.this, About.class);
                        startActivity(c);
                        Toast.makeText(Coconut.this, "About", Toast.LENGTH_SHORT).show();
                        break;
                }

                return true;
            }
        });
    }
}
