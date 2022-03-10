package com.example.interview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    String[] tfq,tfA;
    int index=0;
    int n=0;
    int nn=0;
    TextView tv,t14;
   RadioButton r5,r6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        tv=(TextView)this.findViewById(R.id.textVie);
        t14=(TextView)this.findViewById(R.id.textView14);
        tfq=getResources().getStringArray(R.array.tfques);
        tfA=getResources().getStringArray(R.array.trf);
        t14.setText(tfq[index]);
        r5=(RadioButton) this.findViewById(R.id.radioButton5);
        r6=(RadioButton) this.findViewById(R.id.radioButton6);
    }

    public void Next(View view) {
        if(index==tfq.length-1)
        {
            if(r5.isChecked())
            {
                if(r5.getText().equals(tfA[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            if(r6.isChecked())
            {
                if(r6.getText().equals(tfA[index]))
                {
                    n++;
                }
                else
                {
                    nn++;
                }
            }
            t14.setText("\t\t\t\t\t\tCorrect: "+n+"\n\t\t\t\t\t\tIncorrect: "+nn);
            r5.setVisibility(view.INVISIBLE);
            r6.setVisibility(view.INVISIBLE);
            index++;
        }
       else if(index==10)
        {
            Toast t=Toast.makeText(this,"Currently Disabled",Toast.LENGTH_LONG);
            t.show();
        }
        else {
            if (r5.isChecked()) {
                if (r5.getText().equals(tfA[index])) {
                    n++;
                } else {
                    nn++;
                }
            }
            if (r6.isChecked()) {
                if (r6.getText().equals(tfA[index])) {
                    n++;
                } else {
                    nn++;
                }
            }
            index++;
            t14.setText(tfq[index]);
            tv.setText(String.valueOf(index + 1));
        }
    }

}
