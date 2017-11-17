/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import javax.annotation.PostConstruct;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author iaquino
 */
@Named(value = "managedBean")
@Dependent
public class ManagedBean {

    private String cadena = "Hola desde el MB";
    private Cliente cliente;
    
    public ManagedBean() {
    }
    @PostConstruct
    private void inicializar(){
        setCliente(new Cliente("Jose Juan", "234528","Nissan", 2016)); //instancia de cliente
    }
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
}
