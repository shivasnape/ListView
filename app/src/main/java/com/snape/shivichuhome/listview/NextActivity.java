package com.snape.shivichuhome.listview;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Shivichu Home on 6/28/2016.
 */
public class NextActivity extends MainActivity {


    TextView t,t2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);


       t = (TextView)findViewById(R.id.textView);
        t2= (TextView)findViewById(R.id.textView2);
        String values=getIntent().getExtras().getString("value");
       //String w=getIntent().getExtras().getInt("new_value");
        String s=Integer.toString(getIntent().getExtras().getInt("new_value"));





       t.setText(values);
        t2.setText(s);
       // Toast.makeText(getApplicationContext(),w,Toast.LENGTH_LONG).show();








    }
}
