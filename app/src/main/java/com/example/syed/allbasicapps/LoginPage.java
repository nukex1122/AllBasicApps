package com.example.syed.allbasicapps;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Syed on 03-Mar-2015.
 */
public class LoginPage extends Activity {
    int count=3;
    Button login;
    EditText uname,pass;
    TextView score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loginpage);


            login=(Button) findViewById(R.id.login);
            uname=(EditText) findViewById(R.id.uname);
            pass=(EditText) findViewById(R.id.pass);
            final String cuname="Hello";
            final String cpass = "World";
            score=(TextView) findViewById(R.id.score);

            score.setText(Integer.toString(count));

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String a = uname.getText().toString();
                    String b = pass.getText().toString();
                    int messageResID = 0;
                    if (a.equals(cuname) && b.equals(cpass)) {
                        messageResID = R.string.correct;
                        Intent i = new Intent(LoginPage.this, CorrectID.class);
                        startActivity(i);

                    } else {
                        messageResID = R.string.incorrect;
                        count--;
                        score.setText(Integer.toString(count));
                        if (count == 0) {
                            login.setEnabled(false);
                        }
                    }
                    Toast.makeText(getBaseContext(), messageResID, Toast.LENGTH_SHORT).show();
                }
            });
        }
}

