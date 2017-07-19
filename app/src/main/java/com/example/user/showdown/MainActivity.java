package com.example.user.showdown;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int randint = (int) (Math.random() * 1000000);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView codeTextView = (TextView) findViewById(R.id.your_random_code);
        codeTextView.setText("" + randint);
    }
}
