package com.example.ejercicioclaseadaptadores;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.zip.Inflater;

public class SpinnerAlumnosAdapter extends ArrayAdapter
{
    private Context context = null;
    private String[] datos = null;

    public SpinnerAlumnosAdapter(@NonNull Context context, int resource, @NonNull String[] datos)
    {
        super(context, resource, datos);
        this.context = context;
        this.datos = datos;


    }

    @Override
    public int getCount()
    {
        return datos.length + 1;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        return getCustomView(position, convertView, parent);
    }

    public View getCustomView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        LayoutInflater inflater = ((Activity) context).getLayoutInflater();
        View fila = inflater.inflate(R.layout.spinner_alumno, parent, false);
        TextView textoNombre =fila.findViewById(R.id.tvSpinnerNombre);


        if (position == 0){
            textoNombre.setText("Seleccione Nombre: ");


        }else {
            textoNombre.setText(datos[position - 1]);

        }
        return fila;
    }
}
