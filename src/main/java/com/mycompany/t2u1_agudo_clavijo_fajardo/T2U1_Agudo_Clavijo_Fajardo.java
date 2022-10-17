/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.t2u1_agudo_clavijo_fajardo;

/**
 *
 * @author esteb
 */
public class T2U1_Agudo_Clavijo_Fajardo {

    public static void main(String[] args) {
        System.out.println("G1: Agudo-Clavijo-Fajardo");
        
        Empleado Empleado1 = new Empleado();
        
        Empleado1.nombre="Nicolas Agudo";
        Empleado1.horasTrabajadas=161;
        Empleado1.costoHora=10;
        Empleado1.yearIngreso=2022;
        
        System.out.println(Empleado1.mostrarInfo()+" Y su ingreso mensual sera: "+Empleado1.calculoIngresos(2022)+"$");
        System.out.println("El bono por sus horas extras es de: "+Empleado1.bonoHorasExtra()+"$");
        System.out.println("El impuesto de ingreso por su ingreso basico es: "+Empleado1.calcularImpuestos(1000,2000,3000)+"$");
        System.out.println("Estimado: "+Empleado1.nombre+" Su ingreso total mensual fuera de impuestos es: "+Empleado1.calcularTotal(1000,2000,3000)+"$");
        
        Empleado Empleado2 = new Empleado();
        
        Empleado2.nombre="Manuel Fajardo";
        Empleado2.horasTrabajadas=90;
        Empleado2.costoHora=8.5;
        Empleado2.yearIngreso=2015;
        
        System.out.println(Empleado2.mostrarInfo()+" Y su ingreso mensual sera: "+Empleado2.calculoIngresos(2022)+"$");
        System.out.println("El bono por sus horas extras es de: "+Empleado2.bonoHorasExtra()+"$");
        System.out.println("El impuesto de ingreso por su ingreso basico es: "+Empleado2.calcularImpuestos(1000,2000,3000)+"$");
        System.out.println("Estimado: "+Empleado2.nombre+" Su ingreso total mensual fuera de impuestos es: "+Empleado2.calcularTotal(1000,2000,3000)+"$");
        
        Empleado Empleado3 = new Empleado();
        
        Empleado3.nombre="Alex Clavijo";
        Empleado3.horasTrabajadas=200;
        Empleado3.costoHora=11;
        Empleado3.yearIngreso=2010;
        
        System.out.println(Empleado3.mostrarInfo()+" Y su ingreso mensual sera: "+Empleado3.calculoIngresos(2022)+"$");
        System.out.println("El bono por sus horas extras es de: "+Empleado3.bonoHorasExtra()+"$");
        System.out.println("El impuesto de ingreso por su ingreso basico es: "+Empleado3.calcularImpuestos(1000,2000,3000)+"$");
        System.out.println("Estimado: "+Empleado3.nombre+" Su ingreso total mensual fuera de impuestos es: "+Empleado3.calcularTotal(1000,2000,3000)+"$");
    }
}
