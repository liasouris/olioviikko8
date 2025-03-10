package com.example.olio_viikko8;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText EuroInput;
    private Button USDButton;
    private Button GDPButton;
    private TextView ResultText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EuroInput = findViewById(R.id.EuroInput);
        USDButton = findViewById(R.id.USDButton);
        GDPButton = findViewById(R.id.GDPButton);
        ResultText = findViewById(R.id.ResultText);

    }

    public void convertToDollars(View view) {
        double euros = Double.parseDouble(EuroInput.getText().toString());
        double dollars = euros * 1.05;
        ResultText.setText(String.format("$%.2f", dollars));
    }

    public void convertToPounds(View view) {
        double euros = Double.parseDouble(EuroInput.getText().toString());
        double pounds = euros * 0.83;
        ResultText.setText(String.format("£%.2f", pounds));
    }
}
