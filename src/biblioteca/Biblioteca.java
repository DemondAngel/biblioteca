/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biblioteca;

import biblioteca.controlador.MenuGeneral;
import biblioteca.controlador.MenuUsuario;
import java.util.Scanner;

/**
 *
 * @author iarog
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int opc = 0;
        MenuUsuario menuUsuario = new MenuUsuario();
        MenuGeneral menuGeneral = new MenuGeneral();
        
        System.out.println("Bienvenido a la Biblioteca de la Batiz");
        System.out.println("Se muestra el menu general");
        menuGeneral.despliegaMenu();
        
        menuGeneral.elegirOpcion();
        
           
    }
    
}
