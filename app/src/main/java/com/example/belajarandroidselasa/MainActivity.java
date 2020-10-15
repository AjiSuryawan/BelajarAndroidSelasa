package com.example.belajarandroidselasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // list dari objek nya
    EditText edusername;
    EditText edpassword;
    Button btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // kita sambungkan ke layoutnya.
        edusername = (EditText) findViewById(R.id.edusername);
        edpassword = (EditText) findViewById(R.id.edpassword);
        btnlogin = (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // logic here
                String username = edusername.getText().toString();
                String password = edpassword.getText().toString();
                if (username.equalsIgnoreCase("admin")
                        && password.equalsIgnoreCase("admin")){
                    //sukses login -> Toast
                    Toast.makeText(MainActivity.this, "Sukses Login", Toast.LENGTH_SHORT).show();
                    Intent move = new Intent(MainActivity.this, MenuUtama.class);
                    startActivity(move);
                }else{
                    //gagal login
                    Toast.makeText(MainActivity.this, "Gagal Login", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}