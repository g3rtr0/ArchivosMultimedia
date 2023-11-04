package com.example.archivosmultimedia;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    private VideoView videito;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Video sin conexión a internet

        //VideoView MiVideito = findViewById(R.id.videoView);
        //Uri uri = Uri.parse(videito);
        //MiVideito.setVideoURI(uri);

        //MediaController mediaController = new MediaController(this);
        //MiVideito.setMediaController(mediaController);
        //mediaController.setAnchorView(MiVideito);

        videito = findViewById(R.id.videoView);

        String videoUrl = "https://drive.google.com/uc?export=download&id=15h-OQsLdoh9-Lv11TdWLtOSjWwYnjFfl";

        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videito);
        videito.setMediaController(mediaController);

        videito.setVideoURI(Uri.parse(videoUrl));

        videito.start();


    }
}