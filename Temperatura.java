/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ternometro;

/**
 *
 * @author luisa
 */
public class Temperatura {
    private int rangoDeMedicion ;
    private char escalaDeMedicion;
    private String tipoDeTernometro;
    private int temperatura;
    
    public Temperatura(int rangoDeMedicion,char escalaDeMedicion,String tipoDeTernometro,int temperatura ){
    this.temperatura = temperatura;
    this.escalaDeMedicion = escalaDeMedicion;
    this.rangoDeMedicion = rangoDeMedicion;
    this.tipoDeTernometro = tipoDeTernometro;
    }
    public int temperatura (){
    return temperatura;
    }
    public int setobterner (){
         return (temperatura * 9 / 5) + 32;
    }
    public int setestablecerTemperatura(){
        return (int) (temperatura + 273.15);
    }
}
