
package com.qualitas.mbeans;

import com.qualitas.entities.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;

@javax.faces.bean.ManagedBean
public class ManagedBeanLista {

    private List<Cliente> lista;
    
    private int numeroElementos;
    
    public ManagedBeanLista() {
        
    }
    @PostConstruct
    public void inicializar(){
        lista = new ArrayList<>();
        lista.add(new Cliente("Elena Martinez", "0263245", "Ford", 2019));
        lista.add(new Cliente("Vanessa Herrera", "2548452", "Nissan", 2015));
        lista.add(new Cliente("Miguel Fernandez", "0984752", "Renault", 2017));
        lista.add(new Cliente("Isabel Allende", "4589787", "Kia", 2013));
        lista.add(new Cliente("Anibal Aquino", "7451457", "Chevrolet", 2012));
    }
    public String navegar(){
        return "lista";
    }

    public List<Cliente> getLista() {
        return lista;
    }

    public void setLista(List<Cliente> lista) {
        this.lista = lista;
    }

    public int getNumeroElementos() {
        numeroElementos=lista.size();
        return numeroElementos;
    }

    public void setNumeroElementos(int numeroElementos) {
        this.numeroElementos = numeroElementos;
    }
    
}
