/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author luisa
 */
public class Depositar {
    int cantidad;
    String nombreDestinatario;
    int numeroCuenta;
    int indice;
    Cuenta [] mostrarDepositos = new Cuenta [1];
    
    public Depositar (int cantidad , String nombreDestinatario, int numeroCuenta ){
    this.cantidad = cantidad;
    this.nombreDestinatario = nombreDestinatario;
    this.numeroCuenta = numeroCuenta;
    this.indice = 0;
    }
    public void depositando (){
    System.out.println(cantidad + "Esta depositando");
}
    public void verificando (){
        System.out.println(numeroCuenta + "Esta verificando");
    }
    public void mostrarDepositos (Cuenta cuenta){
    for (int i = 0; i < indice; i++){
        System.out.println(mostrarDepositos[i]);
    }
    }
}

