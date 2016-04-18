package com.example.salsa.testlogin;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Created by asma on 16/04/2016.
 */
public class register extends Activity {

    EditText ET_matricule, ET_name,ET_login_name,ET_login_pass;
    String matricule,name,login_name,login_pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inscrire);
        ET_matricule=(EditText)findViewById(R.id.matricule);
        ET_name=(EditText)findViewById(R.id.name);
        ET_login_name=(EditText)findViewById(R.id.login_name);
        ET_login_pass=(EditText)findViewById(R.id.login_pass);


    }
    public void userReg(View view){
        matricule= ET_matricule.getText().toString();
        name=ET_name.getText().toString();
        login_name=ET_login_name.getText().toString();
        login_pass=ET_login_pass.getText().toString();
        String method="register";
        BackgroundTask  backgroundTask=new BackgroundTask(this);
        backgroundTask.execute(method,matricule,name,login_name,login_pass);
         finish();


    }
}