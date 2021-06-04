package com.aman.note_android_studio_3_android;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CreateNote extends AppCompatActivity {
Button recordAudio, selectImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_note);
        recordAudio = (Button) findViewById(R.id.recordAudio);
        selectImage = (Button) findViewById(R.id.selectImage);
        MediaPlayer mediaPlayer ;



    }



}
