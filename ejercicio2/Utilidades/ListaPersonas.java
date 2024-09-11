/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import clases.Personas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author el_ja
 */
public class ListaPersonas {

    private List<Personas> lista;

    public ListaPersonas() {
        lista = new ArrayList<>();
    }

    public void agregarPersona(Personas persona) {
        lista.add(persona);
    }

    public List<Personas> getLista() {
        return lista;
    }
}
