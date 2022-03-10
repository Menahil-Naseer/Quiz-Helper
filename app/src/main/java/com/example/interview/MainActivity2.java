package com.example.interview;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    Button b,b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);
        b= (Button)this.findViewById(R.id.button2);

    }

    public void bf(View view)
    {
                String url=("https://developer.android.com/");
                Intent in=new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse(url));
                startActivity(in);
        }

    public void but1(View view) {
        Intent i = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(i);
    }
    public void but2(View view) {
        Intent i = new Intent(MainActivity2.this,MainActivity4.class);
        startActivity(i);
    }

    public void but3(View view) {
        Intent i = new Intent(MainActivity2.this,MainActivity5.class);
        startActivity(i);
    }
}