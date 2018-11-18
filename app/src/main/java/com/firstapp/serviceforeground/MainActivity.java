package com.firstapp.serviceforeground;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputData;
    private Button startService,stopService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inputData = findViewById(R.id.enterValue);
    }

    public void startService(View view) {

        String input = inputData.getText().toString();
        Intent intent = new Intent(this,ExampleService.class);
        intent.putExtra("input",input);
        startService(intent);
    }
    public void stopService(View view) {
        Intent intent = new Intent(this,ExampleService.class);
        stopService(intent);
    }
}
