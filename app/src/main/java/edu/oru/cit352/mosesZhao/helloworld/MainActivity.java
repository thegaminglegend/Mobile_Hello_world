package edu.oru.cit352.mosesZhao.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDisplayButton();
    }

    private void initDisplayButton() {
        Button displayButton = findViewById(R.id.buttonDisplay);
        displayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textDisplay = findViewById(R.id.textViewDisplay);
                EditText editName = findViewById(R.id.editTextUserName);

                String nameToDisplay = editName.getText().toString();
                textDisplay.setText("Good day, " + firstname + " " + lastname "!");
            }
        });s

    }

}