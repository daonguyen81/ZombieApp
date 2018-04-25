package com.example.daong.zombieapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.Toast;

import com.example.daong.zombieapp.R;

public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openZombieList();
            }
        });

    }

    private void openZombieList() {
        Intent intent = new Intent(this, ZombieList.class);
        startActivity(intent);
    }

    public void onDisplayToast1(View v) {
        Toast toast = Toast.makeText(MainActivity.this, "This is TOAST 1!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 16);
        toast.show();
    }

    public void onDisplayToast2(View v) {
        Toast toast = Toast.makeText(MainActivity.this, "This is TOAST 2!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 16);
        toast.show();
    }

    public void onDisplayToast3(View v) {
        Toast toast = Toast.makeText(MainActivity.this, "This is TOAST 3!", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM | Gravity.CENTER_HORIZONTAL, 0, 16);
        toast.show();
    }
}
