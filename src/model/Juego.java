/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jany-yin
 */
public class Juego {
    private NumeroSecreto numeroSecreto;
    private int limiteInferior;
    private int limiteSuperior;
    private int numeroDeIntentos;
    private int intentosRealizados;
    
    //25.- (PENDIENTE)
    private static final int LIM_INF_PREDET = 1;
 private static final int LIM_SUP_PREDET = 100;
    
    
    //26
    public void setRangoDelNumeroSecreto(int limiteInferior, int limiteSuperior){
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        numeroSecreto.setRango(this.limiteInferior, this.limiteSuperior);
    }
    //27.-
    public Juego(int limiteInferior, int limiteSuperior, int intentos) {
        this.limiteInferior = limiteInferior;
        this.limiteSuperior = limiteSuperior;
        this.numeroDeIntentos = intentos;
        this.numeroSecreto = new NumeroSecreto(this.limiteInferior, this.limiteSuperior);
        this.intentosRealizados = 0;
    }
    
    //28.-
    public void setNumeroDeIntentos(int intentos) {
        this.numeroDeIntentos = intentos;
     }
    
    //29.-
    public boolean esElNumeroSecreto(int numero) {
        this.intentosRealizados++;
        return numeroSecreto.esIgual(numero);
    }
    //30Para saber si podemos continuar jugando 
    public boolean puedeIntentarDeNuevo() {
    boolean hayMasOportunidades = this.intentosRestantes() > 0;
    return hayMasOportunidades;
    }
    //31.- método permitirá saber el número de intentos restantes
     public int intentosRestantes() {
     int numeroDeIntentosRestantes = this.numeroDeIntentos - this.intentosRealizados;
     return (numeroDeIntentosRestantes);
        }
     //32
    public String getTextoDeAyuda(int numero) {
    String texto = null;
        if (this.numeroSecreto.esMayor(numero) == true) {
            texto = "mayor";
        }
        else if (this.numeroSecreto.esMenor(numero) == true) {
            texto = "menor";
        }
        return texto;
    }

    public String getNumeroSecreto() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}   
