package cis3334.calltextapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCallMom, btnCallDad, btnCallSis, btnTextMom, btnTextDad, btnTextSis;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupButtonClickEvents();
    }

    private void setupButtonClickEvents(){
        btnCallMom = (Button) findViewById(R.id.buttonCallMom);
        btnTextMom = (Button) findViewById(R.id.buttonTextMom);

        btnCallDad = (Button) findViewById(R.id.buttonCallDad);
        btnTextDad = (Button) findViewById(R.id.buttonTextDad);

        btnCallSis = (Button) findViewById(R.id.buttonCallSis);
        btnTextSis = (Button) findViewById(R.id.buttonTextSis);

        //Call Mom
        btnCallMom.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "777-777-7777"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });

        //Text Mom

        btnTextMom.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: 777-777-7777"));
                sendIntent.putExtra("sms_body", "Hi Mom! How are you?");
                startActivity(sendIntent);
            }
        });


        //Call Dad
        btnCallDad.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "888-888-8888"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });

        //Text Dad

        btnTextDad.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: 888-888-8888"));
                sendIntent.putExtra("sms_body", "Hi Dad! How are you?");
                startActivity(sendIntent);
            }
        });

        //Call Sis
        btnCallSis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent phoneIntent = new Intent(Intent.ACTION_DIAL);
                phoneIntent.setData(Uri.parse("tel:" + "999-999-9999"));
                if (phoneIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(phoneIntent);
                }
            }
        });

        //Text Sis

        btnTextSis.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent sendIntent = new Intent(Intent.ACTION_VIEW);
                sendIntent.setData(Uri.parse("sms: 999-999-9999"));
                sendIntent.putExtra("sms_body", "Hi Sis! How are you?");
                startActivity(sendIntent);
            }
        });

    }
}
