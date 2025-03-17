package clasecrud20251;


import daos.DAOEstudiante;
import modelo.Estudiante;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author samue
 */
public class ClaseCrud20251 {
    
    public static void main(String[] args) {
        
        DAOEstudiante dao = new DAOEstudiante();
        
        Estudiante est1 = new Estudiante("Samuel", 10, 18);
        Estudiante est2 = new Estudiante("Natalia", 9, 25);
        Estudiante est3 = new Estudiante("Anduquia", 8, 20);
        
        boolean resp1 = dao.guardarEstudiante(est1);
        boolean resp2 = dao.guardarEstudiante(est2);
        boolean resp3 = dao.guardarEstudiante(est3);
        
        if (resp1) {
            System.out.println("Se guardo el estudiante Uno");
        }else{
            System.out.println("No se pudo guardar el estudiante");
        }
        if (resp2) {
            System.out.println("Se guardo el estudiante Dos");
        }else{
            System.out.println("No se guardo el estudiante Dos");
        }
        if (resp3) {
            System.out.println("Se guardo el estudiante Tres");
        }else{
            System.out.println("No se guardo el estudiante Tres");
        }
        
    }
    
}
