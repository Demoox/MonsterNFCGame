package com.gallu.nfcgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.nfc.NfcManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.textView);
    }
}
