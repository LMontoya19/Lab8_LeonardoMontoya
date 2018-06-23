/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio.pkg8;

import java.util.ArrayList;

/**
 *
 * @author Inspiron
 */
public class empleado {
    String nombre;
    int id;
    String contraseña;
    empleado jefe;
    String salario;
    String puesto;
    ArrayList<empleado> empleados = new ArrayList();
    public empleado(String nombre, int id, String contraseña, empleado jefe, String salario, String puesto) {
        this.nombre = nombre;
        this.id = id;
        this.contraseña = contraseña;
        this.jefe = jefe;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public empleado getJefe() {
        return jefe;
    }

    public void setJefe(empleado jefe) {
        this.jefe = jefe;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public ArrayList<empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<empleado> empleados) {
        this.empleados = empleados;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return   nombre+"   "+puesto ;
    }
    
    
}
