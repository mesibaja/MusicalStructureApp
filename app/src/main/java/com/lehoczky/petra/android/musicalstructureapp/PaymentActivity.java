package com.lehoczky.petra.android.musicalstructureapp;

//I would create a public class for Constants, as seen below in the example from the tutorial: https://developers.google.com/android-pay/tutorial
//public class Constants {
// public static final int WALLET_ENVIRONMENT = WalletConstants.ENVIRONMENT_TEST;
// public static final String MERCHANT_NAME = "Awesome Bike Store";
// public static final String CURRENCY_CODE_USD = "USD";
// }
//public class PaymentActivity {
//}

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.lehoczky.petra.android.musicalstructureapp.PaymentActivity;

public class PaymentActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment_activity);

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView list = (ImageView) findViewById(R.id.list);
        list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent listIntent = new Intent(PaymentActivity.this, com.lehoczky.petra.android.musicalstructureapp.LibraryActivity.class);
                startActivity(listIntent);
            }
        });

        //find the view, set the onclicklistener, and with new intent start new activity
        ImageView now = (ImageView) findViewById(R.id.now_buying);
        now.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nowIntent = new Intent(PaymentActivity.this, PaymentActivity.class);
                startActivity(nowIntent);
            }
        });
    }
}