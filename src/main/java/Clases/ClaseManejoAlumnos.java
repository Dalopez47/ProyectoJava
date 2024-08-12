/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ClaseManejoAlumnos {
    
    DefaultTableModel model;
    
    public void crearColumnas (JTable tablaAlumnos){
        
       DefaultTableModel modelo = new DefaultTableModel();
        
       modelo.addColumn("Codigo");
       modelo.addColumn("Nombres");
       modelo.addColumn("primerApellido");
       modelo.addColumn("segundoApellido");
       
       tablaAlumnos.setModel(modelo);
       
    }
    
    public void IngresoAlumnos(JTextField codigo, JTextField nombres, JTextField primerApellido, JTextField segundoApellido, JTable tablaAlumnos){
    
        model = (DefaultTableModel) tablaAlumnos.getModel();
        
        Clases.ClaseAlumno objetoAlumno = new Clases.ClaseAlumno();
        objetoAlumno.setCodigo(Integer.valueOf(codigo.getText()));
        objetoAlumno.setNombres(nombres.getText());
        objetoAlumno.setprimerApellido(primerApellido.getText());
        objetoAlumno.setsegundoApellido(segundoApellido.getText());
        
        Object [] filas = new Object[4];
        
        filas[0]= objetoAlumno.getCodigo();
        filas[1]= objetoAlumno.getNombres();
        filas[2]= objetoAlumno.getprimerApellido();
        filas[3]= objetoAlumno.getsegundoApellido();
        
        model.addRow(filas);
        
        tablaAlumnos.setModel(model);
        
        
    }
    
    
}
