package com.example.hp.ceg;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Placement extends AppCompatActivity {
    TextView t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,t21;
    ImageView i1;
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.placement);
        Button1();
        Button2();
        Button3();
        t=(TextView)findViewById(R.id.textView);
        t1=(TextView)findViewById(R.id.textView1);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);
        t8=(TextView)findViewById(R.id.textView8);
        t9=(TextView)findViewById(R.id.textView9);
        t10=(TextView)findViewById(R.id.textView10);
        t11=(TextView)findViewById(R.id.textView11);
        t12=(TextView)findViewById(R.id.textView12);
        t13=(TextView)findViewById(R.id.textView13);
        t14=(TextView)findViewById(R.id.textView14);
        t15=(TextView)findViewById(R.id.textView15);
        t16=(TextView)findViewById(R.id.textView16);
        t17=(TextView)findViewById(R.id.textView17);
        t18=(TextView)findViewById(R.id.textView18);
        t19=(TextView)findViewById(R.id.textView19);
        t20=(TextView)findViewById(R.id.textView20);
        t21=(TextView)findViewById(R.id.textView21);


        i1=(ImageView)findViewById(R.id.imageView);

    }
    public  void Button1(){
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cegplacement.yogeshdotnet.com/Registration.aspx"));
                startActivity(intent);
            }
        });
    }
    public  void Button2(){
        b2=(Button)findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cegplacement.yogeshdotnet.com/Files/Placement_CEG_Registration_Process_Hindi.pdf"));
                startActivity(intent);

            }
        });
    }
    public  void Button3(){
        b3=(Button)findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("http://cegplacement.yogeshdotnet.com/Files/CEG_Registration%20_Procedure_English.pdf"));
                startActivity(intent);
            }
        });
    }
}
