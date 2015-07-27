package com.gkmohit.unknown.gameofchoice;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText mNameField;
    private Button mStartButton;
    private static final String NO_NAME_ENTERED = "Please enter a name!";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNameField = (EditText) findViewById(R.id.nameEditText);

        mStartButton = (Button) findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mNameField.getText().toString();
                if(name.matches("")){
                    Toast.makeText(MainActivity.this, MainActivity.NO_NAME_ENTERED, Toast.LENGTH_LONG).show();
                }
                else {
                    String toastMessage = "HELLO " + name.toUpperCase() + "!!";
                    Toast.makeText(MainActivity.this, toastMessage, Toast.LENGTH_LONG).show();
                    startStory();
                }
            }
        });
    }

    private void startStory(){
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);
        startActivity(intent);
    }

}
