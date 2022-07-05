package com.example.calculator07062022;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvKetQua;
    EditText edtSoThu1, edtSoThu2;
    Button btnCong, btnTru, btnNhan, btnChia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKetQua = findViewById(R.id.text_view_ket_qua);
        edtSoThu1 = findViewById(R.id.edit_text_number_1);
        edtSoThu2 = findViewById(R.id.edit_text_number_2);
        btnCong = findViewById(R.id.button_cong);
        btnTru = findViewById(R.id.button_tru);
        btnNhan = findViewById(R.id.button_nhan);
        btnChia = findViewById(R.id.button_chia);

        btnCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Button cộng", Toast.LENGTH_LONG).show();

            }
        });
    }
}