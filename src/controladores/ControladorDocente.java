/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import daos.DAODocente;
import modelo.Docente;

/**
 *
 * @author samue
 */
public class ControladorDocente {
    
    private DAODocente dao;

    public ControladorDocente() {
        dao = new DAODocente();
    }
    
    public Docente buscarDocente(int id){
        return dao.buscarDocente(id);
    }
    
    public boolean guardarDocente(Docente docente){
        return dao.guardarDocente(docente);
    }
    
    public boolean editarDocente(Docente docente){
        return dao.editarDocente(docente);
    }
    
    public boolean eliminarDocente(int id){
        return dao.eliminarDocente(id);
    }
}
