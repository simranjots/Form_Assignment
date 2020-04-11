package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button  clear,submit;
    EditText id,name,last,address,email;
    RadioGroup status;
    RadioButton btn1;
    String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();




        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"hello",Toast.LENGTH_SHORT).show();
                sub();
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearText();
            }
        });
    }



    void init(){
        clear = (Button) findViewById(R.id.btn);
        submit = (Button) findViewById(R.id.button);
        id = (EditText) findViewById(R.id.editText2);
        name = (EditText) findViewById(R.id.editText3);
        last = (EditText) findViewById(R.id.editText4);
        address = (EditText) findViewById(R.id.editText5);
        email = (EditText) findViewById(R.id.editText6);
        status = (RadioGroup) findViewById(R.id.radioGroup);


    }

    void clearText(){

        id.getText().clear();
        name.getText().clear();
        last.getText().clear();
        address.getText().clear();
        email.getText().clear();
        status.clearCheck();
    }

    void  sub(){
        int Stat= status.getCheckedRadioButtonId();
        btn1 = (RadioButton) findViewById(Stat);
        String Id =  id.getText().toString();
       String Name = name.getText().toString();
       String Last =  last.getText().toString();
        String Address = address.getText().toString();
       String Email =  email.getText().toString();
       String Status = btn1.getText().toString();
        if (email.getText().toString().trim().matches(emailPattern)) {
            Student student = new Student(Id,Name,Last,Address,Email,Status);
            Intent i = new Intent(this, DetailActivity.class);
            i.putExtra("stud", student);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(),"Invalid email address", Toast.LENGTH_SHORT).show();
        }


    }


}
