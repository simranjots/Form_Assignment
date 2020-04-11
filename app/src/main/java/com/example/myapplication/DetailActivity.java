package com.example.myapplication;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);
        t1 = (TextView) findViewById(R.id.textView7);
        t2 = (TextView) findViewById(R.id.textView8);
        t3 = (TextView) findViewById(R.id.textView9);
        t4 = (TextView) findViewById(R.id.textView10);
        t5 = (TextView) findViewById(R.id.textView11);
        t6 = (TextView) findViewById(R.id.textView12);


        Student student = getIntent().getParcelableExtra("stud");
        if (student != null) {

            t1.setText(" First Name    "    +   "   : " + student.getName() );
            t2.setText(" Last Name     "    +   "   : " + student.getLast() );
            t3.setText(" Student Id    "    +   "   : " + student.getId() );
            t4.setText(" Email Address "    +   "   : " + student.getEmail() );
            t5.setText(" Home Address  "    +   "   : " + student.getAddress() );
            t6.setText(" Status        "    +   "   : " + student.getStatus());


        }
    }
}
