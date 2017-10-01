package com.example.khairulamin.tugasdua;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static String KEY_Nama = "Nama";
    public static String KEY_Npm = "Npm";
    public static String KEY_Fakultas = "Fakultas";
    public static String KEY_Prodi = "Prodi";
    public static String KEY_Alamat = "Alamat";
    public static String KEY_Hp = "Hp";



    EditText Nama;
    EditText Npm;
    EditText Fakultas;
    EditText Prodi;
    EditText Alamat;
    EditText Hp;


    Button kirimData;
    Button keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nama    = (EditText)findViewById(R.id.txtNama);
        Npm     = (EditText) findViewById(R.id.txtNpm);
        Fakultas= (EditText) findViewById(R.id.txtFakultas);
        Prodi   = (EditText) findViewById(R.id.txtProdi);
        Alamat  = (EditText) findViewById(R.id.txtAlamat);
        Hp      = (EditText) findViewById(R.id.txtHp);


        kirimData   = (Button) findViewById(R.id.btnkirim);

        kirimData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String strNama  = Nama.getText().toString();
                String strNpm   = Npm.getText().toString();
                String strFakultas   = Fakultas.getText().toString();
                String strProdi  = Prodi.getText().toString();
                String strAlamat  = Alamat.getText().toString();
                String strHp   = Hp.getText().toString();

                if (strNama.isEmpty() || strNpm.isEmpty() || strProdi.isEmpty() || strFakultas.isEmpty() || strAlamat.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Data Masih Ada yang Kosong, Cobalah Di Periksa Kembali", Toast.LENGTH_SHORT).show();
                } else {


                    Intent activityPenerima = new Intent(MainActivity.this, Output.class);
                    activityPenerima.putExtra(KEY_Nama, strNama);
                    activityPenerima.putExtra(KEY_Npm, strNpm);
                    activityPenerima.putExtra(KEY_Fakultas, strProdi);
                    activityPenerima.putExtra(KEY_Prodi, strFakultas);
                    activityPenerima.putExtra(KEY_Alamat, strAlamat);
                    activityPenerima.putExtra(KEY_Hp, strHp);
                    startActivity(activityPenerima);
                    MainActivity.this.finish();
                }


            }
        });
        keluar = (Button) findViewById(R.id.exit);

        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.this.finish();
            }
        });

    }
}