/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t2u1_agudo_clavijo_fajardo;

/**
 *
 * @author esteb
 */
public class Empleado {
    
    String nombre;
    int horasTrabajadas;
    double costoHora;
    int yearIngreso;
    
    public String mostrarInfo() {
        String retorno = "El empleado se llama: " + this.nombre + " su numero de horas trabajas es: "
            + this.horasTrabajadas + " y costo por hora de su trabajo es: " + this.costoHora+"$"
            + " y el año que ingreso a trabajar es: "+this.yearIngreso;
     
        return retorno;
    }
    public double calculoIngresos(int yearActual){
        double retorno = 0;
        int añosTrabajados = 0;
        double porcentajeAños = 0;
        añosTrabajados = yearActual-this.yearIngreso;
        porcentajeAños = añosTrabajados*0.02;
        retorno = (this.costoHora*this.horasTrabajadas)+((this.costoHora*this.horasTrabajadas)*porcentajeAños);
    
        return retorno;
    }
    public double bonoHorasExtra(){
        double retorno = 0;
        int horaExtras = 0;
        if(this.horasTrabajadas>160){
            horaExtras = (this.horasTrabajadas-160);
            retorno = ((horaExtras*2)*this.costoHora);
        }
        return retorno;
    }
    public double calcularImpuestos(int limite1, int limite2,int limite3){
        double retorno = 0;
        double ingresos = this.costoHora*this.horasTrabajadas;
        if(ingresos>0&&ingresos<=limite1){
            retorno = 0;
        }
        else if(ingresos>limite1&&ingresos<=limite2){
            retorno = ingresos*0.05;
        }
        else if(ingresos>limite2&&ingresos<=limite3){
            retorno = ingresos*0.12;
        }
        else if(ingresos>limite3){
            retorno = ingresos*0.25;
        }
        return retorno;
    }
    public double calcularTotal(int limite1, int limite2,int limite3){
        int horaExtras = 0;
        double retorno = 0;
        double impuestos = 0;
        double bono = 0;
        double ingresos = this.costoHora*this.horasTrabajadas;
        if(ingresos>0&&ingresos<=limite1){
            retorno = 0;
        }
        else if(ingresos>limite1&&ingresos<=limite2){
            retorno = ingresos*0.05;
        }
        else if(ingresos>limite2&&ingresos<=limite3){
            retorno = ingresos*0.12;
        }
        else if(ingresos>limite3){
            retorno = ingresos*0.25;
        }
        retorno = ((bono+ingresos)-impuestos);
        return retorno;
    }
}
