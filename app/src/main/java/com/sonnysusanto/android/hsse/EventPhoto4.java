package com.sonnysusanto.android.hsse;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class EventPhoto4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_photo);
    }

    public void eventCategory(View view){
        Intent intent = new Intent(this, EventCategory3.class);
        //intent.putExtra("name", nameField.getText().toString());
        startActivity(intent);
    }
    public void eventDescription(View view){
        Intent intent = new Intent(this, EventDescription5.class);
        //intent.putExtra("name", nameField.getText().toString());
        startActivity(intent);
    }
}
