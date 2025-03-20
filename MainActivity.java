package com.example.idpassword;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText eText1;
    private EditText eText2;
    private EditText eText3;
    private Button eButton;
    private TextView eTextView1;
    private TextView eTextView2;
    private TextView eTextView3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        eText1 = (EditText) findViewById(R.id.editTextID);
        eText2 = (EditText) findViewById(R.id.editTextPW);
        eText3 = (EditText) findViewById(R.id.editTextPH);
        eButton = (Button) findViewById(R.id.button2);
        eTextView1 = (TextView) findViewById(R.id.textViewID);
        eTextView2 = (TextView) findViewById(R.id.textViewPW);
        eTextView3 = (TextView) findViewById(R.id.textViewPH);

    }

    public void onCliked(View view) {
        String str1 = eText1.getText().toString();
        String str2 = eText2.getText().toString();
        String str3 = eText3.getText().toString();
        eTextView1.setText("아이디: "+str1);
        eTextView2.setText("패스워드: "+str2);
        eTextView3.setText("전화번호: "+str3);
    }
}