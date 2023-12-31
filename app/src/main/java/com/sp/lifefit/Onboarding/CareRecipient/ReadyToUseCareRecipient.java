package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sp.lifefit.R;

public class ReadyToUseCareRecipient extends AppCompatActivity {
    private Button nextbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ready_to_use);

        nextbtn = findViewById(R.id.nextbtn_readytouse);
        nextbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReadyToUseCareRecipient.this, CompleteRegistrationCareRecipient.class);
                startActivity(intent);
            }
        });

    }
}