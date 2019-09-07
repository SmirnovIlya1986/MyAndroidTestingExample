package ru.ilyasmirnov.android.myandroidtestingexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.ilyasmirnov.android.myandroidtestingexample.idlingResourceSample.IdlingActivity;

public class MainActivity extends AppCompatActivity {

    private Calculator calculator;
    private Button settingsButton;
    private Button idlingButton;
    private Button addButton;
    private Button subtractButton;
    private Button multiplyButton;
    private Button divideButton;
    private EditText firstDigit;
    private EditText secondDigit;
    private TextView result;
    private AsyncTask<Void, Void, Void> sleepTask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // sleepTask = new SleepAsyncTask();
        // sleepTask.execute();
        calculator = Calculator.getInstance();
        addButton = findViewById(R.id.add);
        firstDigit = findViewById(R.id.editText1);
        secondDigit = findViewById(R.id.editText2);

        result = findViewById(R.id.result);

        idlingButton = findViewById(R.id.idling);
        idlingButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, IdlingActivity.class);
            startActivity(intent);
        });
    }
}
