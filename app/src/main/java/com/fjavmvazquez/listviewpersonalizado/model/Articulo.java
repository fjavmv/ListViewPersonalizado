package com.fjavmvazquez.listviewpersonalizado.model;

public class Articulo {
    private int idFoto;
    private String titulo;
    private String descripcion;
    private String fecha;

    public Articulo(int idFoto, String titulo, String descripcion, String fecha) {
        this.idFoto = idFoto;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public int getIdFoto() {
        return idFoto;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFecha() {
        return fecha;
    }
}
