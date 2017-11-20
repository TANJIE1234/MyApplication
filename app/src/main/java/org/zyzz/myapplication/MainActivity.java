package org.zyzz.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup;
    TextView txv;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txv = findViewById(R.id.txv);
        radioGroup = findViewById(R.id.ticketType);
        button = findViewById(R.id.btn);
    }

    public void show(View view) {
        switch (radioGroup.getCheckedRadioButtonId()) {
            case R.id.adult:
                txv.setText("买全票");
                break;
            case R.id.child:
                txv.setText("买半票");
                break;
            case R.id.senior:
                txv.setText("买敬老票");
                break;
        }
    }

}
