package mcm.edu.ph.intent_narca;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = findViewById(R.id.button);

        next.setOnClickListener(this);

    }
    @Override
    public void onClick(View v){

        TextView display = findViewById(R.id.textView2);
        EditText input = findViewById(R.id.numbersamonth);

        Intent i = new Intent(MainActivity.this, MainActivity2.class);
    }
}