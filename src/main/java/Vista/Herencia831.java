/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Vista;

/**
 *
 * @author tobon
 */
import modelo.Empleado;
import modelo.Gerente;
import controlador.NominaController;
public class Herencia831 {

    public static void main(String[] args) {
        System.out.println("aprendiendo herencia");
        NominaController control = new NominaController();
        
        
        control.registrarEmpleados(new Empleado("Juan Jose",1000));
        control.registrarEmpleados(new Gerente("juan jose 2",5000,500) );
        
        
        System.out.println("==Listado de pagos==");
        for(Empleado emp :control.obtenerLista()){
            
            
        System.out.println("Nombre: "+ emp.getNombre());
        System.out.println("Pago: "+ emp.calcularPago());
        System.out.println("------------------------------------");
        System.out.println("===Prueba de sobrecarga===");
        Empleado busqueda1 = control.buscar("Juan Jose");
        Empleado busqueda2 = control.buscar(1);
               
        System.out.println("===Prueba de sobrecarga busqueda por nombre:  ==="+ (busqueda1 != null? busqueda1.getNombre():"no existe"));
        System.out.println("===Prueba de sobrecarga busqueda por indice:  ==="+ (busqueda2 != null? busqueda1.getNombre():"no existe"));
        }
    }
}
