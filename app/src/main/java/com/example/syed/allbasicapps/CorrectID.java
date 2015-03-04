package com.example.syed.allbasicapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Syed on 03-Mar-2015.
 */
public class CorrectID extends Activity {
    TextView count;
    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.correct_page);

        count=(TextView)findViewById(R.id.count);

            count.setText("Logging In 3 Seconds ");
            Thread timer = new Thread() {
                public void run() {
                    try {
                        sleep(3000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                            Intent i = new Intent(CorrectID.this,Calculator.class);
                            startActivity(i);
                    }
                }
            };timer.start();
    }
}
