package com.kmina.evaluation1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private int cont1, cont2, cont3, cont4, cont5, cont6, cont7, cont8, cont9, contTotal;
    private LinearLayout ll1, ll2, ll3, ll4, ll5, ll6, ll7, ll8, ll9;
    private TextView p1, p2, p3, p4, p5, p6, p7, p8, p9;
    private EditText et_user, et_email;
    private Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ll1 = findViewById(R.id.ll1);
        ll2 = findViewById(R.id.ll2);
        ll3 = findViewById(R.id.ll3);
        ll4 = findViewById(R.id.ll4);
        ll5 = findViewById(R.id.ll5);
        ll6 = findViewById(R.id.ll6);
        ll7 = findViewById(R.id.ll7);
        ll8 = findViewById(R.id.ll8);
        ll9 = findViewById(R.id.ll9);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);

        et_user = findViewById(R.id.et_user);
        et_email = findViewById(R.id.et_email);
        btn_send = findViewById(R.id.btn_send);

        ll1.setOnClickListener(this);
        ll2.setOnClickListener(this);
        ll3.setOnClickListener(this);
        ll4.setOnClickListener(this);
        ll5.setOnClickListener(this);
        ll6.setOnClickListener(this);
        ll7.setOnClickListener(this);
        ll8.setOnClickListener(this);
        ll9.setOnClickListener(this);

        btn_send.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.ll1:
                cont1++;
                contTotal++;
                p1.setText(Integer.toString(cont1));
                break;
            case R.id.ll2:
                cont2++;
                contTotal++;
                p2.setText(Integer.toString(cont2));
                break;
            case R.id.ll3:
                cont3++;
                contTotal++;
                p3.setText(Integer.toString(cont3));
                break;
            case R.id.ll4:
                cont4++;
                contTotal++;
                p4.setText(Integer.toString(cont4));
                break;
            case R.id.ll5:
                cont5++;
                contTotal++;
                p5.setText(Integer.toString(cont5));
                break;
            case R.id.ll6:
                cont6++;
                contTotal++;
                p6.setText(Integer.toString(cont6));
                break;
            case R.id.ll7:
                cont7++;
                contTotal++;
                p7.setText(Integer.toString(cont7));
                break;
            case R.id.ll8:
                cont8++;
                contTotal++;
                p8.setText(Integer.toString(cont8));
                break;
            case R.id.ll9:
                cont9++;
                contTotal++;
                p9.setText(Integer.toString(cont9));
                break;
            case R.id.btn_send:
                Intent mIntent = new Intent(MainActivity.this, Main2Activity.class);
                mIntent.putExtra("user", et_user.getText().toString());
                mIntent.putExtra("email", et_email.getText().toString());
                mIntent.putExtra("total", Integer.toString(contTotal));
                mIntent.putExtra("key1", Integer.toString(cont1));
                mIntent.putExtra("key2", Integer.toString(cont2));
                mIntent.putExtra("key3", Integer.toString(cont3));
                mIntent.putExtra("key4", Integer.toString(cont4));
                mIntent.putExtra("key5", Integer.toString(cont5));
                mIntent.putExtra("key6", Integer.toString(cont6));
                mIntent.putExtra("key7", Integer.toString(cont7));
                mIntent.putExtra("key8", Integer.toString(cont8));
                mIntent.putExtra("key9", Integer.toString(cont9));
                startActivity(mIntent);
        }
    }
}
