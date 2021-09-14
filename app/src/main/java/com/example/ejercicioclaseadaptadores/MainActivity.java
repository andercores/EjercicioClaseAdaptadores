package com.example.ejercicioclaseadaptadores;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
{
    private Spinner sp = null;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = findViewById(R.id.spAlumnos);
        String[] datos = getResources().getStringArray(R.array.alumnos);

        SpinnerAlumnosAdapter adapter = new SpinnerAlumnosAdapter(this, R.layout.spinner_alumno, datos);
        sp.setAdapter(adapter);
    }
}