/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.ArrayList;
import modelo.Estudiante;

/**
 *
 * @author samue
 */
public class DAOEstudiante {

    private Estudiante[] estudiantes;
    private ArrayList<Estudiante> listaEstudiantes;

    public DAOEstudiante() {
        this.estudiantes = new Estudiante[2]; // [null, null]
        this.listaEstudiantes = new ArrayList<>();
    }
    
    public boolean guardar(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
        return true;
    }
    
    public boolean guardarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) { //recorremos el arreglo buscando la casilla vacio
            if (estudiantes[i] == null) { // si la casilla en la que esta el iterador es igual a null
                estudiantes[i] = estudiante; // asigna la casilla vacia a el estudiante
                return true; // Notifica que todo el proceso se completo, y se guardo el estudiante
            }
        }
        return false;//Si nada de eso se cumple, notifica que no se cumplio el proceso, y que no se guardo el estudiante
    }
    
    public Estudiante buscar(int codigo){
        for (Estudiante estudiante : listaEstudiantes) {
            if(estudiante.getCodigo() == codigo){
                return estudiante;
            }
        }
        return null;
    }

    public Estudiante buscarEstudiante(int codigo) {
        for (int i = 0; i < estudiantes.length; i++) { //Recorremos el arreglo buscando un estudiante
            if (estudiantes[i] != null && estudiantes[i].getCodigo() == codigo) { // si el estudiante que esta en la casilla del iterador tiene el mismo codigo que el que se ingresa por parametro
                return estudiantes[i]; // Notifica que ya hay un estudiante con ese codigo, ya esta creado y en el arreglo
            }
        }
        return null; // Notifica que no hay un estudiante con ese codigo dentro del arreglo
    }

    public boolean editarEstudiante(Estudiante estudiante) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i] != null) {
                estudiantes[i].setNombre(estudiante.getNombre());
                estudiantes[i].setEdad(estudiante.getEdad());
                return true;
            }
        }
        return false;
    }

    public boolean eliminarEstudiante(int codigo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCodigo() == codigo) {
                estudiantes[i] = null;
                return true;
            }
        }
        return false;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }
    
    
    
}
