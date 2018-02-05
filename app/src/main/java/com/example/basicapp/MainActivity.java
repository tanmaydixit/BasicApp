package com.example.basicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1; // declaration of the obj of the class TextView , Android(Google wrote the TextView Class)
    TextView tv2;
    EditText et1; // declaration of the obj of the class EditText
    Button b1;// declaration of the obj of the class Button
    String stuff; // a String variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connecting XML names(TY,ET ) to their respective java objects
        tv1=findViewById(R.id.a15); // initialize the tv1 object
        //et1=findViewById(R.id.ET);
        b1=findViewById(R.id.BT);
        // Button b1=new Button(); // the way usually objs are made in java.

        b1.setText("Next act");// button too has a setText function is used to rename it.
        // the fancy way of using the
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                tv1.setText("tanmay"); //this will execute after the button has been clicked.

                String nameOfMe="Tanmay";

                Intent intent =new Intent(MainActivity.this,
                        SecondActivity.class);
                intent.putExtra("name",nameOfMe);
                startActivity(intent);


            }
        });


        //et1.setText(""); // button too has a setText function is used to put text into it.


//        et1.getText(); // this function is used to get user data

        //stuff=

        //Home work to find out how to get user input into the string'stuff' HINT:use google


        tv1.setText("tyufuygyugkigku"); // classic use of textView used for setting text


        /*View.OnClickListener listener=new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        };

        b1.setOnClickListener(listener);
*/

    }
}