package com.example.cnec.dialogoalerta;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setTitle("Dialogo Teste");

        builder.setMessage("Um texto de exemplo");


        
        Sim s = new Sim();

        builder.setPositiveButton("Sim", s);

        builder.setNegativeButton("Não",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView tvResposta = findViewById(R.id.tvResposta);
                tvResposta.setText("Não");

            }
        });
        builder.setNeutralButton("Talvez ",  new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                TextView tvResposta = findViewById(R.id.tvResposta);
                tvResposta.setText("Talvez");

            }
        });





        AlertDialog ad = builder.create();

        ad.show();


    }
}
