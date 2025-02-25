/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cuentabancaria;

/**
 *
 * @author luisa
 */
public class CuentaBancaria {

    public static void main(String[] args) {
        
        Cuenta cuenta1 = new Cuenta("Luis","Ahorro",100,785);
        
        Depositar deposito1 = new Depositar(100,"Juan",847);
        
        Retirar retiro1 = new Retirar("7590",50,255);
        
        ConsultarSaldo consulta1 = new ConsultarSaldo("7590",487,"Ahorro");
        
        cuenta1.mostrarDepositos(deposito1);
        
        
        
        
        
    }
}
