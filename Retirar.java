/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cuentabancaria;

/**
 *
 * @author luisa
 */
public class Retirar {
    String contraseña;
    int monto;
    int numeroCuenta;
    
    public Retirar (String contraseña,int monto,int numeroCuenta){
    this.contraseña = contraseña;
    this.monto = monto;
    this.numeroCuenta = numeroCuenta;
    
    }
    public void verificando (){
        System.out.println(contraseña + "Esta verificando");
    }
    public void retirando (){
        System.out.println(monto + "Esta retirando");

    }
}
