package com.example.khairulamin.tugasdua;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Output extends AppCompatActivity {
    TextView Nama;
    TextView Alamat;
    TextView Npm;
    TextView Fakultas;
    TextView Prodi;
    TextView Hp;

    Button btnkembali;
    Button btnkeluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);
        Nama = (TextView) findViewById(R.id.dataNama);
        Npm = (TextView) findViewById(R.id.dataNpm);
        Fakultas = (TextView) findViewById(R.id.dataFakultas);
        Prodi = (TextView) findViewById(R.id.dataProdi);
        Alamat = (TextView) findViewById(R.id.dataAlamat);
        Hp = (TextView) findViewById(R.id.dataHp);


        String strNama = getIntent().getStringExtra(MainActivity.KEY_Nama);
        String strNpm = getIntent().getStringExtra(MainActivity.KEY_Npm);
        String strFakultas = getIntent().getStringExtra(MainActivity.KEY_Fakultas);
        String strProdi = getIntent().getStringExtra(MainActivity.KEY_Prodi);
        String strAlamat = getIntent().getStringExtra(MainActivity.KEY_Alamat);
        String strHp = getIntent().getStringExtra(MainActivity.KEY_Hp);

        Nama.setText(strNama);
        Npm.setText(strNpm);
        Fakultas.setText(strFakultas);
        Prodi.setText(strProdi);
        Alamat.setText(strAlamat);
        Hp.setText(strHp);

        btnkembali = (Button) findViewById(R.id.btnkembali);
        btnkembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent kembali = new Intent (Output.this,MainActivity.class);
                startActivity(kembali);
                finish();

            }
        });
         btnkeluar= (Button) findViewById(R.id.btnkeluar);
        btnkeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Output.this.finish();
            }
        });

    }
}
