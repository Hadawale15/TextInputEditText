package com.example.textinputedittext;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
    TextInputLayout textInputLayout;
    TextInputEditText textInputEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       textInputLayout=findViewById(R.id.text_input_layout_id);
       textInputEditText=findViewById(R.id.text_input_editText_id);


          textInputLayout.getEditText().addTextChangedListener(new TextWatcher() {
              @Override
              public void beforeTextChanged(CharSequence s, int start, int count, int after) {

              }

              @Override
              public void onTextChanged(CharSequence s, int start, int before, int count) {
                  String text=textInputEditText.getText().toString();
                  if (text.length() >5)
                  {
                      textInputLayout.setError("Low ");
                  }
                  else if(text.length()<5)
                  {
                      textInputLayout.setError(null);
                      textInputLayout.setErrorEnabled(false);
                  }
              }

              @Override
              public void afterTextChanged(Editable s) {

              }
          });

    }
}