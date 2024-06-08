package com.example.myapp_perfect;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t1=(TextView) findViewById(R.id.text1);
        TextView t2=(TextView) findViewById(R.id.text2);
        Button b=(Button) findViewById(R.id.btn);
        EditText et=(EditText) findViewById(R.id.num);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int i,rem,n,sum=0;
                n=Integer.parseInt(et.getText().toString().trim());
                for(i=1;i<n;i++)
                {
                    rem=n%i;
                    if(rem==0)
                    {
                        sum=sum+i;
                    }
                }
                if(sum==n)
                    t2.setText(n+" is Perfect Number..");
                else{
                    t2.setText(n+" is nor Perfect Number..");
                }
            }
        });
    }
}