package com.fjavmvazquez.listviewpersonalizado;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.fjavmvazquez.listviewpersonalizado.adapter.AdapterArticulos;
import com.fjavmvazquez.listviewpersonalizado.model.Articulo;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private ArrayList<Articulo> mArticuloArrayList;
    private ListView mListView;
    AdapterArticulos mAdapterArticulos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mArticuloArrayList = new ArrayList<>();

        mArticuloArrayList.add(new Articulo(R.drawable.fondo,"Programación","Una vez que se ha creado el objeto DataOutputStream, puede usarlo para escribir datos binarios en el archivo.","11/12/2020"));
        mArticuloArrayList.add(new Articulo(R.drawable.anime,"Naruto","Naruto, romanizada como NARUTO, es una serie animada de origen japonés basada en el manga del mismo nombre, escrito e ilustrado por Masashi Kishimoto.",
                "10/10/2022"));
        mArticuloArrayList.add(new Articulo(R.drawable.data,"Bases de datos","Una base de datos es una herramienta para recopilar y organizar información. Las bases de datos pueden almacenar información sobre personas, productos, pedidos u otras cosas. Muchas bases de datos " +
                "comienzan como una lista en una hoja de cálculo o en un programa de procesamiento de texto.","10/12/2011"));
        mArticuloArrayList.add(new Articulo(R.drawable.linux,"Linux", "Linux es un sistema operativo semejante a Unix, de código abierto y desarrollado por una comunidad, para computadoras, servidores, " +
                "mainframes, dispositivos móviles y dispositivos embebidos.","27/11/2022"));
        mListView = findViewById(R.id.listpersonalizada);
        mAdapterArticulos = new AdapterArticulos(this,R.layout.activity_list_custom,mArticuloArrayList);
        mListView.setAdapter(mAdapterArticulos);

    }
}