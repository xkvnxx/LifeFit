package com.sp.lifefit.Onboarding.CareRecipient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.sp.lifefit.R;

public class SignUpCareRecipient extends AppCompatActivity {

    private AppCompatButton createaccbtn;
    private EditText signupusername,signupemail,signuppassword;
    DatabaseReference reference;
    FirebaseDatabase database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_page);

        createaccbtn = findViewById(R.id.createaccountbtn);

        signupusername = findViewById(R.id.signupusername);
        signupemail = findViewById(R.id.signupemail);
        signuppassword = findViewById(R.id.signuppassword);

        createaccbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                database = FirebaseDatabase.getInstance("https://lifefit-c080f-default-rtdb.asia-southeast1.firebasedatabase.app");
                reference = database.getReference("Carerecipients");

                String username = signupusername.getText().toString();
                String email = signupemail.getText().toString();
                String password = signuppassword.getText().toString();

                HelperClassCareRecipient helperClassCareRecipient = new HelperClassCareRecipient(username,email,password);
                reference.child(password).setValue(helperClassCareRecipient);


                Toast.makeText(SignUpCareRecipient.this, "You have signed up succesfully!", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(SignUpCareRecipient.this, UploadPhotoCareRecipient.class);
                startActivity(intent);
            }
        });


    }
}