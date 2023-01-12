package com.example.demoapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;

public class SaveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);

        Fragment f2 = new SaveFragment();
        FragmentManager fm2 = getSupportFragmentManager();
        FragmentTransaction ft2 = fm2.beginTransaction();
        ft2.replace(R.id.save_act,f2).commit();
    }

    @Override
    public void onBackPressed(){
        AlertDialog.Builder builder1 = new AlertDialog.Builder(SaveActivity.this);

        builder1.setMessage("Do you want go back? ");

        builder1.setTitle("ALERT!!");

        builder1.setCancelable(false);

        builder1.setPositiveButton("Yes", (DialogInterface.OnClickListener) (Dialog, which) -> {
            super.onBackPressed();
        });

        builder1.setNegativeButton("No", (DialogInterface.OnClickListener) (Dialog, which) -> {
            Dialog.cancel();
        });

        AlertDialog alertDialog = builder1.create();
        alertDialog.show();
    }
}