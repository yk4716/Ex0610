package com.example.ex0610;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.ToggleButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    Button btn;
    ToggleButton tb;
    Switch swDN;
    LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tb = (ToggleButton) findViewById(R.id.tb);
        swDN = (Switch) findViewById(R.id.swDN);
        btn = (Button) findViewById(R.id.btn);

    }

    public void go(View view) {
        boolean switchState = swDN.isChecked();
        boolean toggleState = tb.isChecked();

        if (switchState && toggleState) {
            mainLayout.setBackgroundColor(Color.RED);
        } else if (switchState && !toggleState) {
            mainLayout.setBackgroundColor(Color.BLUE);
        } else if (!switchState && toggleState) {
            mainLayout.setBackgroundColor(Color.GREEN);
        } else {
            mainLayout.setBackgroundColor(Color.YELLOW);
        }
    }
}