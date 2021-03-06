package com.example.animales;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gallo(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gallo);
        mp.start();
    }
    public void gato(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.gato);
        mp.start();
    }
    public void leon(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.leon);
        mp.start();
    }
    public void caballo(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.caballo);
        mp.start();
    }
    public void burro(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.burro);
        mp.start();
    }
    public void elefante(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.elefante);
        mp.start();
    }
    public void Mono(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.mono);
        mp.start();
    }
    public void pajaro(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.pajaro);
        mp.start();
    }
    public void perro(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.perro);
        mp.start();
    }
    public void vaca(View view){
        MediaPlayer mp = MediaPlayer.create(this, R.raw.vaca);
        mp.start();
    }

}