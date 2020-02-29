package com.example.disability;

import   androidx.appcompat.app.AppCompatActivity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivitySelectionRegistration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_registration_main);
    }

    public void checkGeneralita(View view){

        final EditText txt_USN = (EditText) findViewById(R.id.editTextUSN);
        String txtU = txt_USN.getText().toString();
        boolean checkU=true;
        if(txtU.length()==0) {
            txt_USN.setError("Inserire Nome Utente");
            checkU=false;
        }

        final EditText txt_Name = (EditText) findViewById(R.id.editTextName);
        String txtN = txt_Name.getText().toString();
        boolean checkN=true;

        if (Pattern.matches("^[a-zA-Z]{1,32}$", txtN)) {
            checkN=true;
        }
        else {
            checkN = false;
            txt_Name.setError("Inserire il nome contenente solo lettere");
        }

        final EditText txt_Surname = (EditText) findViewById(R.id.editTextSurname);
        String txtS = txt_Surname.getText().toString();
        boolean checkS=true;

        if (Pattern.matches("^[a-zA-Z]{1,32}$", txtS)) {
            checkS = true;
        }
        else {
            checkS = false;
            txt_Surname.setError("Inserire il cognome contenente solo lettere");
        }

        final EditText txt_PSW = (EditText) findViewById(R.id.editTextPSW);
        String txtPSW = txt_PSW.getText().toString();
        boolean checkPSW=true;

        if (Pattern.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#$%^&*])(?=.{8,64})", txtPSW)) {
            checkPSW=true;
        }
        else {
            checkPSW = false;
            txt_PSW.setError("La password deve essere di minimo 8 caratteri, deve avere almeno una lettera minuscola, una lettera maiuscola, un numero e un carattere speciale(!,@,#,%,^,&,*)");
        }

        final EditText txt_Email = (EditText) findViewById(R.id.editTextEmail);
        String txtE = txt_Email.getText().toString();
        boolean checkE=true;

        if (Pattern.matches("^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$", txtE)) {
            checkE=true;
        }
        else {
            checkE = false;
            txt_Email.setError("EMail errata");
        }

        final EditText txt_Phone = (EditText) findViewById(R.id.editTextPhone);
        String txtPhone = txt_Phone.getText().toString();
        boolean checkPhone=true;

        if (Pattern.matches("^[0-9]{10}$", txtPhone)) {
            checkPhone=true;
        }
        else {
            checkPhone = false;
            txt_Phone.setError("Numero errato");
        }


        if(checkE && checkN && checkPhone && checkPSW && checkS && checkU) {
            Intent intent = new Intent(this, HomePageMain.class);
            startActivity(intent);
        }
    }




}
