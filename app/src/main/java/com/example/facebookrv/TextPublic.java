package com.example.facebookrv;

public class TextPublic implements  IViewModel{
    private int id;
    private int ic_user;
    private String nombre;
    private String user;
    private float hora;
    private String publicacion;

    TextPublic(int id,int ic_user,String nombre,String user,float hora,String publicacion){
        this.id=id;
        this.ic_user= ic_user;
        this.nombre = nombre;
        this.user = user;
        this.hora = hora;
        this.publicacion = publicacion;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getIc_user() {
        return this.ic_user;
    }

    @Override
    public void setIc_user(int ic_user) {
        this.ic_user = ic_user;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre=nombre;
    }

    @Override
    public String getUser() {
        return this.user;
    }

    @Override
    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public float getHora() {
        return this.hora;
    }

    @Override
    public void setHora(float hora){
        this.hora=hora;
    }

    @Override
    public Object getPublicacion() {
        return this.publicacion;
    }

    @Override
    public void setPublicacion(Object publicacion){
        this.publicacion=(String) publicacion;
    }
}

