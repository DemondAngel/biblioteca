/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controlador;

import biblioteca.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iarog
 */
public class MenuUsuario extends Menu{
     
    private Usuario usuario;
    private List<Usuario> usuarios;
    private Scanner sc = new Scanner(System.in);
    
    public MenuUsuario() {
        String titulo = "Usuarios";
        List<String> opciones = new ArrayList<String>();
        opciones.add("1.Crear usuario");
        opciones.add("2.Actualizar usuario");
        opciones.add("3.Consultar usuarios");
        opciones.add("4.Eliminar usuario");
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    @Override
    public void elegirOpcion(){
        int opc = sc.nextInt();
        
        if(opc == 1){
        
        }
        
        
    }
    
    public Usuario crearUsuario(){
        System.out.println("Inserta un código");
        System.out.println("Inserta un nombre");
        System.out.println("Inserta una dirección");
        System.out.println("Inserta un teléfono");
        
    }
     
}
