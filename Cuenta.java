/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author luisa
 */
class Cuenta {
     String nombrePropietario;
     int numeroCuenta;
    String tipoCuenta;
    int monto;
    int indice;
    Depositar []Depositos = new Depositar [1];
    
    public Cuenta (String nombrePropietario, String tipoCuenta,int monto,int numeroCuenta){
    this.nombrePropietario = nombrePropietario;
    this.tipoCuenta = tipoCuenta;
    this.monto = monto;
    this.numeroCuenta = numeroCuenta;
    this.indice = 0;
    }
    public void creando (){
    System.out.println(tipoCuenta + "Tipo de Cuenta");
    }
    public void registrando (){
    System.out.println(nombrePropietario + "Nombrando");
    }
    public void depositar (Depositar deposito){
   deposito.mostrarDepositos(this);
   Depositos[indice]=deposito;
   indice++;
   
    }

    void mostrarDepositos(Depositar deposito1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void mostrarDepositos(){
         int i;
    for(i = 0;i < indice; i++){
    System.out.println(Depositos[i]);
    }
    }
    
}
