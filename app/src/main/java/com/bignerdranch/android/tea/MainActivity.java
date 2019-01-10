package com.bignerdranch.android.tea;

import android.support.constraint.ConstraintLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button buttonView;
    ConstraintLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainLayout = findViewById(R.id.mainLayout);
        textView = findViewById(R.id.textId);
        textView.setText("Drijan car");
        buttonView = findViewById(R.id.buttonId);
        buttonView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("KLIKNUO ME");
                Snackbar.make(mainLayout, "sadasd", Snackbar.LENGTH_SHORT).show();
                //Toast.makeText(MainActivity.this, "kliknuo",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
