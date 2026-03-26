/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author tobon
 */
public class Empleado {
        protected String nombre;
    protected double salarioBase;

    public Empleado(String nombre, double SalarioBase) {
        this.nombre = nombre;
        this.salarioBase = SalarioBase;
    }
     public double calcularPago(){
    return salarioBase;
}

    public String getNombre() {
        return nombre;
    }
     
}
