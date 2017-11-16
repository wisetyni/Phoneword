package com.android.sample.phoneword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.android.sample.phoneword.PhoneTranslator.toNumber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String translatedNumber = PhoneTranslator.toNumber("1-855-XAMARIN");

        final TextView translatedPhoneWord = (TextView) findViewById(R.id.TranslatedPhoneWord);
        Button translateButton = (Button) findViewById (R.id.TranslateButton);
        final EditText phoneNumberText = (EditText)findViewById(R.id.PhoneNumberText);

        translateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String translatedNumber = PhoneTranslator.toNumber(phoneNumberText.getText().toString());

                if (TextUtils.isEmpty(translatedNumber)) {

                    translatedPhoneWord.setText("");
                }
                else{
                    translatedPhoneWord.setText(translatedNumber);
                }



            }
        });



    }
}
