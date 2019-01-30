package com.magad.drawer2;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.magad.drawer2.Fragment.DuaFragment;
import com.magad.drawer2.Fragment.SatuFragment;

public class HomeActivity extends AppCompatActivity{

    TextView output;

    public static String Tampung = "maahahaafoafin";

    Button btnsatu,btndua;
    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        output = findViewById(R.id.txt_output);
        btnsatu = findViewById(R.id.btn_Fragment);
        btndua = findViewById(R.id.btn_Fragment2);
         fm = getSupportFragmentManager();

        btnsatu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            fm.beginTransaction()
                    .add(R.id.Container,new SatuFragment())
                    .commit();

            }
        });
        btndua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fm.beginTransaction()
                        .add(R.id.Container,new DuaFragment())
                        .commit();

            }
        });


        String tampung = getIntent().getStringExtra(Tampung);
        output.setText(tampung);



    }

    public void fragment1(View view) {
    }

    public void fragment2(View view) {
    }

}
