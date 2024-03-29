package com.example.dpmestacionamientos.data.model;

public class ModelEstacionamiento {
    private String id;
    private String idpersona;
    private String nombre;
    private String direccion;
    private String distrito;
    private String direcciongooglemaps;
    private String telefono;
    private Double preciohora;
    private Double largo;
    private Double ancho;
    private Double altura;
    private String tipo;
    private String ubicacion;

    public ModelEstacionamiento(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(String idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDirecciongooglemaps() {
        return direcciongooglemaps;
    }

    public void setDirecciongooglemaps(String direcciongooglemaps) {
        this.direcciongooglemaps = direcciongooglemaps;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getPreciohora() {
        return preciohora;
    }

    public void setPreciohora(Double preciohora) {
        this.preciohora = preciohora;
    }

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
