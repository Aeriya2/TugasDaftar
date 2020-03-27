package com.example.tugasdaftar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    Button kembali, daftar;
    EditText Namadpn, namablkg, tempatlhr, tanggallhr,alamat, telepon, email, pass, repass;
    RadioButton sexL, SexP, islam, kristen, katolik, hindu, budha, konghucu, Alirankprcyn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kembali = findViewById(R.id.btnKembali);
        daftar = findViewById(R.id.btnDaftar);
        Namadpn = findViewById(R.id.namadpn);
        namablkg = findViewById(R.id.namablkg);
        tempatlhr = findViewById(R.id.tempatlhr);
        tanggallhr = findViewById(R.id.tanggallhr);
        alamat = findViewById(R.id.alamat);
        telepon = findViewById(R.id.telepon);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
        repass = findViewById(R.id.repass);
        sexL = findViewById(R.id.genderL);
        SexP = findViewById(R.id.GenderP);
        islam = findViewById(R.id.islam);
        kristen = findViewById(R.id.kristen);
        katolik = findViewById(R.id.Katolik);
        konghucu = findViewById(R.id.konghucu);
        hindu = findViewById(R.id.hindu);
        budha = findViewById(R.id.budha);
        Alirankprcyn = findViewById(R.id.Kepercayaan);


        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}