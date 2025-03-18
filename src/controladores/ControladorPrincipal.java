/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import daos.DAOEstudiante;
import modelo.Estudiante;

/**
 *
 * @author samue
 */
public class ControladorPrincipal {
    
    private DAOEstudiante dao;
    
    public ControladorPrincipal(){
        dao = new DAOEstudiante();
    }
    
    public boolean guardarEstudiante(Estudiante estudiante){
        return dao.guardarEstudiante(estudiante); 
    }  
    
    public Estudiante buscarEstudiante(int codigo){
        return dao.buscarEstudiante(codigo);
    }
    
    public boolean editarEstudiante(Estudiante estudiante){
        return dao.editarEstudiante(estudiante);
    }
    
    public boolean eliminarEstudiante(int codigo){
        return dao.eliminarEstudiante(codigo);
    }
    
    public Estudiante[] getEstudiantes(){
        return dao.getEstudiantes();
    }
}
