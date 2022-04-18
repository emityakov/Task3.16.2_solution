package ru.samsung.itacademy.mdev.task3162_solution;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Fragment fragment;
    Button btn1, btn2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.button1);
        btn2 = findViewById(R.id.button2);

        View.OnClickListener listener = new View.OnClickListener() {
            public void onClick(View view) {

                if(view == findViewById(R.id.button1)){
                    fragment = new FragmentA();
                } else {
                    fragment = new FragmentB();
                }
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.output, fragment);
                transaction.commit();
            }
        };



        btn1.setOnClickListener(listener);

        btn2.setOnClickListener(listener);
    }
}