package org.zyzz.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    TextView txvB,txvG,txvR;
    Button changeButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editText);
        txvR = findViewById(R.id.txvR);
        txvG = findViewById(R.id.txvG);
        txvB = findViewById(R.id.txvB);
        changeButton = findViewById(R.id.button);
    }

    public void changeColor(View view) {
        Random random = new Random();
        int  CR = random.nextInt(255);
        int CG = random.nextInt(255);
        int CB = random.nextInt(255);
        txvR.setText("R:"+CR);
        txvR.setTextColor(Color.rgb(CR,0,0));
        txvG.setText("G:" + CG);
        txvG.setTextColor(Color.rgb(0, CG, 0));
        txvB.setText("B:" + CB);
        txvB.setTextColor(Color.rgb(0,0,CB));
        editText.setBackgroundColor(Color.rgb(CR,CG,CB));
    }
}
