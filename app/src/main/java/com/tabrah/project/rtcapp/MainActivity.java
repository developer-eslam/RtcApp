package com.tabrah.project.rtcapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtmessage;

    Button btninsertdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btninsertdata= findViewById(R.id.btninsert);

        txtmessage=(EditText)findViewById(R.id.txtenterusername);

        btninsertdata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Toast.makeText(MainActivity.this,txtmessage.getText().toString(),Toast.LENGTH_LONG).show();
            }
        });

       // BtnInsert btnInsert = new BtnInsert();

        //btnInsert.onClick(btninsertdata);
    }

//    public void btninsert(View view) {
//    }
//
//    public class BtnInsert implements View.OnClickListener{
//
//        @Override
//        public void onClick(View v) {
//            Toast.makeText(MainActivity.this,"Weclome",Toast.LENGTH_LONG).show();
//        }
//    }
}
