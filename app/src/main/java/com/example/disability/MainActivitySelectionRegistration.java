package com.example.disability;

import   androidx.appcompat.app.AppCompatActivity;

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
        txt_Name.getText().toString();
        String txtN = txt_Name.getText().toString();
        boolean checkN=true;
        if(txtN.length()==0) {
            txt_Name.setError("Inserire Nome");
            checkN=false;
        }

        final EditText txt_Surname = (EditText) findViewById(R.id.editTextSurname);
        txt_Surname.getText().toString();
        String txtS = txt_USN.getText().toString();
        boolean checkS=true;
        if(txtS.length()==0) {
            txt_Surname.setError("Inserire Cognome");
            checkS=false;
        }

        final EditText txt_PSW = (EditText) findViewById(R.id.editTextPSW);
        txt_PSW.getText().toString();
        String txtPSW = txt_USN.getText().toString();
        boolean checkPSW=true;
        if(txtPSW.length()==0) {
            txt_PSW.setError("Inserire Password");
            checkPSW=false;
        }

        final EditText txt_Email = (EditText) findViewById(R.id.editTextEmail);
        txt_Email.getText().toString();
        String txtE = txt_USN.getText().toString();
        boolean checkE=true;
        if(txtE.length()==0) {
            txt_Email.setError("Inserire Email");
            checkE=false;
        }

        final EditText txt_Phone = (EditText) findViewById(R.id.editTextPhone);
        txt_Phone.getText().toString();
        String txtPhone = txt_USN.getText().toString();
        boolean checkPhone=true;
        if(txtPhone.length()==0) {
            txt_Phone.setError("Inserire Telefono");
            checkPhone=false;
        }

        if(checkE && checkN && checkPhone && checkPSW && checkS && checkU) {
            Intent intent = new Intent(this, HomePageMain.class);
            startActivity(intent);
        }
    }




}
