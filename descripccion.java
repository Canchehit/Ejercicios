/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.producto;

/**
 *
 * @author luisa
 */
public class descripccion {
   private int codigo;
   private String nombre;
   private int precio;

    descripccion(int i, String jabon, int i0) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void descripccion (int codigo,String nombre,int precio){
    this.codigo = codigo;
    this.nombre = nombre;
    this.precio = precio;
   
    }
    public void nombrando (){
    System.out.println(nombre+"Esta nombrando");
    }        
   public void ingresando(){
       System.out.println(precio+"Esta modificando");

   }      
    public void setprecio (){
    if (precio > 0){
    this.precio = precio;
    }else
        System.out.println("El precio debe de ser mayor a 0");
    }  
    public void getpreco (){
       this.precio = precio;
    }
    public void mostrarInformacion() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
}
}
  