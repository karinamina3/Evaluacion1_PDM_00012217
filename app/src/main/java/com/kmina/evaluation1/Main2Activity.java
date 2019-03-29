package com.kmina.evaluation1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private TextView tv_user, tv_email, tv_total;
    private TextView p1, p2, p3, p4, p5, p6, p7, p8, p9;
    private Button btn_share;
    private String user, email, total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv_user = findViewById(R.id.tv_user);
        tv_email = findViewById(R.id.tv_email);
        tv_total = findViewById(R.id.tv_product);

        p1 = findViewById(R.id.p1);
        p2 = findViewById(R.id.p2);
        p3 = findViewById(R.id.p3);
        p4 = findViewById(R.id.p4);
        p5 = findViewById(R.id.p5);
        p6 = findViewById(R.id.p6);
        p7 = findViewById(R.id.p7);
        p8 = findViewById(R.id.p8);
        p9 = findViewById(R.id.p9);

        Intent mIntent = getIntent();
        if(mIntent!= null){
            tv_user.setText(mIntent.getStringExtra("user"));
            tv_email.setText(mIntent.getStringExtra("email"));
            tv_total.setText(mIntent.getStringExtra("total"));
            p1.setText(mIntent.getStringExtra("key1"));
            p2.setText(mIntent.getStringExtra("key2"));
            p3.setText(mIntent.getStringExtra("key3"));
            p4.setText(mIntent.getStringExtra("key4"));
            p5.setText(mIntent.getStringExtra("key5"));
            p6.setText(mIntent.getStringExtra("key6"));
            p7.setText(mIntent.getStringExtra("key7"));
            p8.setText(mIntent.getStringExtra("key8"));
            p9.setText(mIntent.getStringExtra("key9"));

            user = mIntent.getStringExtra("user");
            email = mIntent.getStringExtra("email");
            total = mIntent.getStringExtra("total");
        }

        btn_share = findViewById(R.id.btn_share);

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mIntent = new Intent();
                mIntent.setAction(Intent.ACTION_SEND);
                mIntent.setType("text/plain");
                mIntent.putExtra(Intent.EXTRA_TEXT, "Nombre: " + user + " Email: " + email + " Total de productos: " + total);
                Main2Activity.this.startActivity(mIntent);
            }
        });
    }
}
