package com.example.laboratorio_02_00195316;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button Btn_1;
    private TextView Et;
    private EditText et_username;
    private EditText et_password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn_1 = findViewById(R.id.btn_clik);
        Et = findViewById(R.id.text_view);
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        Btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Et.setText(et_username.getText());

            }
        });

        Btn_1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Et.setText(et_password.getText());
                Btn_1.setText("Long Click");
                return false;
            }
        });


    }
}
