package com.apps.aldialfarizi.latihansharedpreference;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.apps.aldialfarizi.latihansharedpreferences.utils.Preferences;

/*
tgl pengerjaan : 28-04-2020
deskripsi pengerjaan : import appcompat,v7 membuat shared preferences,buat class user model buat interface util static
                      membuat,tampilan register home login,
nim : 10117156
nama : Aldi Alfarizi
kelas : IF4



 */


public class HomeActivity extends AppCompatActivity {

    private TextView txtKeluar;
    private TextView txtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        declareView();
        txtKeluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Clear Set Preferences
                Preferences.setLogout(getBaseContext());

                //Pindah Halaman ke Login
                startActivity(new Intent(getBaseContext(), LoginActivity.class));
                finish();
            }
        });

    }

    private void declareView() {
        txtKeluar = findViewById(R.id.txt_logout);
        txtName = findViewById(R.id.txtName);

        txtName.setText(Preferences.getRegisteredUser(getBaseContext()));
    }
}
