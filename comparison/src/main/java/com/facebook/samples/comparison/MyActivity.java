package com.facebook.samples.comparison;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

public class MyActivity extends ActionBarActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_acticity);


        findViewById(R.id.test_btn).setOnClickListener(this);
        findViewById(R.id.test_memory_not_leak_btn).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.test_btn:
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                break;
            case R.id.test_memory_not_leak_btn:
                Intent intent2 = new Intent(this, Main2Activity.class);
                startActivity(intent2);
                break;
        }
    }

}
