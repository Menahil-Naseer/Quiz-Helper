package com.example.interview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4 extends AppCompatActivity {
    String[] mq,a,an,an1,an2,durus;
    int index=0;
    TextView t11,t9;
    RadioButton r1,r2,r3,r4;
    RadioGroup r;
    int n=0;
    int nn=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        mq=getResources().getStringArray(R.array.mcq1);
        a=getResources().getStringArray(R.array.a1);
        an=getResources().getStringArray(R.array.a2);
        an1=getResources().getStringArray(R.array.a3);
        an2=getResources().getStringArray(R.array.a4);
        durus=getResources().getStringArray(R.array.dur);
        t11=(TextView)this.findViewById(R.id.textView11);
        t9=(TextView)this.findViewById(R.id.textView9);
        r1=(RadioButton) this.findViewById(R.id.radioButton);
        r2=(RadioButton) this.findViewById(R.id.radioButton2);
        r3=(RadioButton) this.findViewById(R.id.radioButton3);
        r4=(RadioButton) this.findViewById(R.id.radioButton4);
        r=(RadioGroup)this.findViewById(R.id.rg);
        t11.setText(mq[index]);
        r1.setText(a[index]);
        r2.setText(an[index]);
        r3.setText(an1[index]);
        r4.setText(an2[index]);

    }



    public void next(View view) {
        if(index==mq.length-1)
        {
            if(r1.isChecked())
            {
                if(r1.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r2.isChecked())
            {
                if(r2.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r3.isChecked())
            {
                if(r3.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r4.isChecked())
            {
                if(r4.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
           t11.setText("\t\t\t\t\t\tCorrect: "+n+"\n\t\t\t\t\t\tIncorrect: "+nn);
           r1.setVisibility(view.INVISIBLE);
            r2.setVisibility(view.INVISIBLE);
            r3.setVisibility(view.INVISIBLE);
            r4.setVisibility(view.INVISIBLE);
            index++;
        }
        else if(index==10)
        {
            Toast t=Toast.makeText(this,"Currently Disabled",Toast.LENGTH_LONG);
            t.show();
        }
            else {
            if(r1.isChecked())
            {
                if(r1.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r2.isChecked())
            {
                if(r2.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r3.isChecked())
            {
                if(r3.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r4.isChecked())
            {
                if(r4.getText().equals(durus[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            index++;
            t11.setText(mq[index]);
            r1.setText(a[index]);
            r2.setText(an[index]);
            r3.setText(an1[index]);
            r4.setText(an2[index]);
            t9.setText(String.valueOf(index + 1));
        }
        }



}