package com.example.cnec.dialogoalerta;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by CNEC on 21/08/2018.
 */

public class Sim implements DialogInterface.OnClickListener {

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        Log.d("Resposta:", "Sim");
    }
}
