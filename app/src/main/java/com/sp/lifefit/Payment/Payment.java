package com.sp.lifefit.Payment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sp.lifefit.R;

public class Payment extends AppCompatActivity {
    private AppCompatButton cardbtn;
    private AppCompatButton cashbtn;
    private AppCompatButton nextbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);

        cardbtn = findViewById(R.id.cardbtn);
        cashbtn = findViewById(R.id.cashbtn);
        nextbtn = findViewById(R.id.nextbtn_payment);

        cardbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                fragment = new CardPaymentFragment();
            }
        });

        cashbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                fragment = new CashPaymentFragment();
            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Payment.this, PaymentSuccessful.class);
                startActivity(intent);
                finish();
            }
        });

    }
}