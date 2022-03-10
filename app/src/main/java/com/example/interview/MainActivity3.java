package com.example.interview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {
    String[] question,answer;
    ImageButton bleft,bright,ans;
    TextView t4,t5,t6,t7;
    int n=1;
    int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        question=getResources().getStringArray(R.array.ques);
        answer=getResources().getStringArray(R.array.ans);
        t4=(TextView)this.findViewById(R.id.textView4);
        t5=(TextView)this.findViewById(R.id.textView5);
        t6=(TextView)this.findViewById(R.id.textView6);
        t7=(TextView)this.findViewById(R.id.textView7);
        t6.setText(question[index]);
    }

    public void b1(View v)
    {
        if(index<=0)
        {
            Toast t=Toast.makeText(this,"Currently disabled",Toast.LENGTH_LONG);
            t.show();
        }
        else {
            index--;
            t4.setText(index+1);
            t6.setText(question[index]);
            t7.setText("Click the A Button Below");
        }
    }
    public void onClick(View v) {
        t7.setText(answer[index]);
    }
    public void onClick2(View v)
    {
        if(index==question.length-1)
        {
            Toast p=Toast.makeText(this,"No more Questions",Toast.LENGTH_LONG);
            p.show();
        }
        else {
            index++;
            t6.setText(question[index]);
            t4.setText(String.valueOf(index+1));
            t7.setText("Click the A Button Below");
        }
    }


}