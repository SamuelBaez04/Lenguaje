/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import daos.DAOEstudiante;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Estudiante;

/**
 *
 * @author samue
 */
public class ControladorEstudiante {
    
    private DAOEstudiante dao;
    
    public ControladorEstudiante(){
        dao = new DAOEstudiante();
    }
    
    public boolean guardarEstudiante(Estudiante estudiante){
        Estudiante aux = buscarEstudiante(estudiante.getCodigo());
        if(aux == null){
            return dao.guardar(estudiante);
        }
         return false;
    }  
    
    public Estudiante buscarEstudiante(int codigo){
        return dao.buscar(codigo);
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
    
    public ArrayList<Estudiante> getLista(){
        return dao.getListaEstudiantes();
    }
    
    public DefaultTableModel listar(){
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new String[]{ "Nombre", "Codigo", "Edad"});
        ArrayList<Estudiante> estudiantes = dao.getListaEstudiantes();
        for (Estudiante estudiante : estudiantes) {
            modelo.addRow(new Object[]{
                estudiante.getNombre(),
                estudiante.getCodigo(),
                estudiante.getEdad()
            });
        }
        return modelo;
    }
    
}
