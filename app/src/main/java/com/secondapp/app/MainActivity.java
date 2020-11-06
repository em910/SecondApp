package com.secondapp.app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Makre sure that all plain text hint boxes are properly set up
        // in strings.xml
        // <string name="[INSERT TEXT BOX ID]">[INSERT HINT TEXT THAT APPEARS IN THE BOX]</string>

        // in activity_main.xml
        // HINTS MUST BE FORMATTED LIKE THIS:
        // @string/[INSERT NAME THAT WAS SPECIFIED IN strings.xml] 

        // get reference to button
        // R = resources
        // is = go through ids
        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
                EditText secondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditText.getText().toString());
                int num2 = Integer.parseInt(secondNumEditText.getText().toString());
                int result = num1 + num2;

                resultTextView.setText(result + "");
            }
        });
    }
}