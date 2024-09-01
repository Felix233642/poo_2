/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author felix
 */
public class empleados extends persona {
       public empleados() {
        super();
    }
    public empleados(String puesto,String nombre, String apellidos, String direccion, String telefono, String fecha_Nacimiento,  String codigo) {
    super(nombre,puesto, apellidos, direccion, telefono, fecha_Nacimiento, codigo);
    }


    
}
