/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Random;

/**
 *
 * @author ALUMNOS
 */
public final class NumeroSecreto {
    private int numero;
    private int limiteInferior;
    private int limiteSuperior;
    private Random generador;
    
    //5.- Declarar contastantes con nombre (constantes simblolicas)
    private static final int LIM_INF_PREDET = 1;
    private static final int LIM_SUP_PREDET = 100;
    
    //6.- mETODO SetRango
    public void setRango(int limiteInferior, int limiteSuperior){
        
       if (limiteInferior > limiteSuperior){
           this.limiteInferior = LIM_INF_PREDET;
           this.limiteSuperior = LIM_SUP_PREDET;
       }
       else{
           this.limiteSuperior = limiteSuperior;
           this.limiteInferior = limiteInferior;
       }
    }
    //Declarar el metodo generar
    public final void generar(){
        this.numero = generador.nextInt(limiteSuperior)+1;
     
    }
    //7.- Declarar un constructor con dos parametros para la clase
    public NumeroSecreto(int limiteInferior, int limiteSuperior){
        this.setRango(limiteInferior, limiteSuperior);
        this.generador = new Random();
        this.generar();
        
    }
    //8.- Declarar un segundo constructor
    public NumeroSecreto(){
        this (LIM_INF_PREDET, LIM_SUP_PREDET);
    }
    //9.- DECLARE UN getters para las variables de instancia numero
    public int getNumeroSecreto(){
        return this.numero;
    }
    
    public int getLimiteInferior(){
        return this.limiteInferior;
    }
    
    public int getLimiteSuperior(){
        return this.limiteSuperior;
    }
    
    //10.-Declare que clase es mayor
    public boolean esMayor(int numero) {
        boolean elNumeroSecretoEsMayor;
        if (this.numero > numero) {
            elNumeroSecretoEsMayor = true;
        }else {
            elNumeroSecretoEsMayor = false;
        }
         return elNumeroSecretoEsMayor;
 }
  
    //11.-Declare la case es Menor
    public boolean esMenor(int numero) {
        boolean elNumeroSecretoEsMenor = false;
        if (this.numero < numero) {
            elNumeroSecretoEsMenor = true;
            }
            return elNumeroSecretoEsMenor;
    }
    //12 Declare la clase es igual
    public boolean esIgual(int numero){
        return(this.numero == numero);
    }
    
    //13.- 
     
         
}

        
            
        
