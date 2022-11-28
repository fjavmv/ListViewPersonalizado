package com.fjavmvazquez.listviewpersonalizado.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.fjavmvazquez.listviewpersonalizado.R;
import com.fjavmvazquez.listviewpersonalizado.model.Articulo;

import java.util.ArrayList;

public class AdapterArticulos extends BaseAdapter {

    private Context mContext;
    private ArrayList<Articulo> mArticuloArrayList;
    private int mlayout;

    public AdapterArticulos(Context mContext, int mlayout, ArrayList<Articulo> mArticuloArrayList) {
        this.mContext = mContext;
        this.mlayout = mlayout;
        this.mArticuloArrayList = mArticuloArrayList;
    }

    @Override
    public int getCount() {
        return this.mArticuloArrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return this.mArticuloArrayList.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        //Copiamos la vista
        View v= view;
        //Inflamos la vista de nuestro layout personalizado
        LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        v = layoutInflater.inflate(mlayout, null);
        //Elemento actual de acuerdo a la posición
        Articulo articulo = mArticuloArrayList.get(position);
        //Referenciamos el elemento amodificar y se llena
        ImageView imageView = v.findViewById(R.id.imgvFondo);
        imageView.setImageResource(articulo.getIdFoto());
        TextView textViewTitulo = v.findViewById(R.id.txtTitulo);
        textViewTitulo.setText(articulo.getTitulo());
        TextView textViewDescripcion = v.findViewById(R.id.txtContenido);
        textViewDescripcion.setText(articulo.getDescripcion());
        TextView textViewFecha = v.findViewById(R.id.txtFecha);
        textViewFecha.setText(articulo.getFecha());

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(mContext,mArticuloArrayList.get(position).getIdFoto(),Toast.LENGTH_SHORT).show();
            }
        });



        return v;
    }
}
