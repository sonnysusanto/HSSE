package com.sonnysusanto.android.hsse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EventDescription5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_description);
    }

    public void eventPhoto(View view){
        Intent intent = new Intent(this, EventPhoto4.class);
        //intent.putExtra("name", nameField.getText().toString());
        startActivity(intent);
    }

    public void eventSubmit(View view){
        Intent intent = new Intent(this, EventSubmit6.class);
        //intent.putExtra("name", nameField.getText().toString());
        startActivity(intent);
    }
}
