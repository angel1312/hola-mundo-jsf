package com.qualitas.entities;

public class Cliente {
    
    private String nombre;
    private String contrato;
    private String marca;
    private int modelo;

    public Cliente(String nombre, String contrato, String marca, int modelo) {
        this.nombre = nombre;
        this.contrato = contrato;
        this.marca = marca;
        this.modelo = modelo;
    }
        
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    
}
