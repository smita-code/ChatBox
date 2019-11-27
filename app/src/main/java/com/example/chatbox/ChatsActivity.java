package com.example.chatbox;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class ChatsActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "com.example.chatbox.EXTRA_USER_NAME";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chats);

        if (getSupportActionBar() != null && getIntent() != null) {
            getSupportActionBar().setTitle(getIntent().getStringExtra(EXTRA_USERNAME));
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            super.onBackPressed();
            return true;
        } else
            return super.onOptionsItemSelected(item);
    }
}
