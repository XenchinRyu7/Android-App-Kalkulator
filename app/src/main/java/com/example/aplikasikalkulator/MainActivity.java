package com.example.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel
    EditText angkaPertama, angkaKedua;
    Button tambah, kurang, kali, bagi, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.biru_muda)));

        angkaPertama = findViewById(R.id.editAngkaPertama);
        angkaKedua = findViewById(R.id.editAngkaKedua);
        tambah = findViewById(R.id.btnTambah);
        kurang = findViewById(R.id.btnKurang);
        kali = findViewById(R.id.btnKali);
        bagi = findViewById(R.id.btnBagi);
        bersihkan = findViewById(R.id.btnBersihkan);
        hasil = findViewById(R.id.txtViewHasil);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((angkaPertama.getText().length() > 0) && (angkaKedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 + angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((angkaPertama.getText().length() > 0) && (angkaKedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 - angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((angkaPertama.getText().length() > 0) && (angkaKedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if ((angkaPertama.getText().length() > 0) && (angkaKedua.getText().length() > 0)) {
                    double angka1 = Double.parseDouble(angkaPertama.getText().toString());
                    double angka2 = Double.parseDouble(angkaKedua.getText().toString());
                    double result = angka1 / angka2;
                    hasil.setText(Double.toString(result));
                } else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukan angka pertama & kedua", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                angkaPertama.setText("");
                angkaKedua.setText("");
                hasil.setText("0");
                angkaPertama.requestFocus();
            }
        });
    }
}