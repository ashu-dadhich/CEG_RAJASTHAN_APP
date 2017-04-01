package com.example.hp.ceg;


import android.app.Notification;
import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Registration extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5,t6,t7;
    EditText e1,e2,e3,e4;
    Button b1;
    AutoCompleteTextView at1;
    String[] Course={
            "Android","Auto-CAD","LINEX","Java","Red hat",
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Bindview();

        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e1.equals("")) {
                    e1.setError("Required");
                } else if (e2.equals("")) {
                    e2.setError("Required");
                } else if (e3.equals("")) {
                    e3.setError("Required");
                }
                else if (e4.equals("")) {
                    e4.setError("Required");
                }
                else {
                    // insertValues(t1.getText().toString().trim(), t2.getText().toString().trim());
                    sendDataToServer(e1.getText().toString().trim(), e2.getText().toString().trim(), e3.getText().toString().trim(), e4.getText().toString().trim());
                }
              //  Intent email = new Intent(Intent.ACTION_SENDTO);
                //email.setType("message/rfc822");
                //email.putExtra(Intent.EXTRA_EMAIL,new String[] { to });
                //email.putExtra(Intent.EXTRA_SUBJECT,subject);
                //email.putExtra(Intent.EXTRA_TEXT,message);
                //startActivity(Intent.createChooser(email,"yogeshsharmait95@gmail.com"));

            }

        });
    }
    public void Bindview(){
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView2);
        t3=(TextView)findViewById(R.id.textView3);
        t4=(TextView)findViewById(R.id.textView4);
        t5=(TextView)findViewById(R.id.textView5);
        t6=(TextView)findViewById(R.id.textView6);
        t7=(TextView)findViewById(R.id.textView7);

        at1=(AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        ArrayAdapter adapter= new ArrayAdapter(this,android.R.layout.select_dialog_item,Course);
        at1.setThreshold(1);
        at1.setAdapter(adapter);

        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        e4=(EditText)findViewById(R.id.editText4);

    }
    public void sendDataToServer(final String name, final String email,final String phone, final String message) {

        final ProgressDialog pDialog = new ProgressDialog(this);
        pDialog.setMessage("Loading...");
        pDialog.show();
        String url = "http://pankaj.cegrajasthan.in/imgupload/loginservert.php";
        RequestQueue queue = Volley.newRequestQueue(this);
        StringRequest stringRequest = new StringRequest(Request.Method.POST, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(Registration.this, "" + response, Toast.LENGTH_SHORT).show();
                Log.e("Response Here", "" + response);
                pDialog.dismiss();
            }
        }, new Response.ErrorListener() {

            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("test", "Error: " + error.getMessage());
                pDialog.dismiss();
                Log.e("Response Here", "" + error.toString());
            }
        }) {
            @Override
            protected Map<String, String> getParams() {
                Map<String, String> params = new HashMap<String, String>();
                params.put("Name", name);
                params.put("Email", email );
                params.put("Phone", phone);

                params.put("Message", message);


                return params;
            }

        };
        queue.add(stringRequest);

    }


}
