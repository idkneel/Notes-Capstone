package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity
{
    public static final int REQUEST_CODE_ADD_NOTE = 1;

    @Override
    protected void OnCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView imageAddNoteMain = findViewById(R.id.imageAddNoteMain);
        imageAddNoteMain.setOnClickListener(new View.OnClickListener())
        {
            @Override
            public void onClick(View v)
            {
                startActivityForResult(new Intent(getApplicationContext(), CreateNoteActivity.class)), REQUEST_CODE_ADD_NOTE
            }
        }
    }
}
