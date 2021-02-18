package mcm.edu.ph.intent_narca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        boolean condition;
        int x = 0;

        Intent i = getIntent();
        condition = Boolean.parseBoolean(i.getStringExtra("condition_var"));
        x = i.getIntExtra("INT_MONTHS", 0);

        TextView display = findViewById(R.id.numbersamonth);

        switch (x) {
            case 1:
                display.setText("Ang tuig na imong ge butang kay January");
                break;
            case 2:
                display.setText("Ang tuig na imong ge butang kay February");
                break;
            case 3:
                display.setText("Ang tuig na imong ge butang kay  March");
                break;
            case 4:
                display.setText("Ang tuig na imong ge butang kay April");
                break;
            case 5:
                display.setText("Ang tuig na imong ge butang kay May");
                break;
            case 6:
                display.setText("Ang tuig na imong ge butang kay June");
                break;
            case 7:
                display.setText("Ang tuig na imong ge butang kay July");
                break;
            case 8:
                display.setText("Ang tuig na imong ge butang kay August");
                break;
            case 9:
                display.setText("Ang tuig na imong ge butang kay September");
                break;
            case 10:
                display.setText("Ang tuig na imong ge butang kay October");
                break;
            case 11:
                display.setText("Ang tuig na imong ge butang kay November");
                break;
            case 12:
                display.setText("Ang tuig na imong ge butang kay December");
                break;
            default:
                display.setText("Way month na nag pakita ani sa kalendaryo, untrohi na");
                break;


        }
    }
}