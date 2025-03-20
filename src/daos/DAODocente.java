/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import java.util.ArrayList;
import modelo.Docente;

/**
 *
 * @author samue
 */
public class DAODocente {
    
    private ArrayList<Docente> docentes;

    public DAODocente() {
        docentes = new ArrayList<>();
    }
    
    public Docente buscarDocente(int id){
        for (int i = 0; i < docentes.size(); i++) {
            if(docentes.get(i).getId() == id){
                return docentes.get(i);
            }
        }
        return null;
    }
    
    public boolean guardarDocente(Docente docente){
        Docente aux = buscarDocente(docente.getId());
        if(aux == null){
            docentes.add(docente);
            return true;
        }
        return false;
    }
    
    public boolean editarDocente(Docente docente){
        Docente aux = buscarDocente(docente.getId());
        if(aux != null){
            aux.setNombre(docente.getNombre());
            aux.setEdad(docente.getEdad());
            aux.setProfesion(docente.getProfesion());
            return true;
        }
        return false;
    }
    
    public boolean eliminarDocente(int id){
        Docente aux = buscarDocente(id);
        if(aux != null){
            docentes.remove(aux);
            return true;
        }
        return false;
    }
    
    
}
