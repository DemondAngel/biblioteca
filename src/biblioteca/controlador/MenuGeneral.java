/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author iarog
 */
public class MenuGeneral extends Menu{
    
    private MenuUsuario menuUsuario;
    
    public MenuGeneral() {
        this.menuUsuario = new MenuUsuario();
        String titulo = "Menu";
        List<String> opciones = new ArrayList<String>();
        opciones.add("1. Usuarios");
        opciones.add("2. Prestamos");
        opciones.add("3. Autores");
        opciones.add("4. Libros y Ejemplares");
        opciones.add("5. Salir");
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    @Override
    public void elegirOpcion(){
        Scanner sc = new Scanner(System.in);
        int opc = 0; 
        do{
            if(opc != 0)
                despliegaMenu();
            try{
                opc = sc.nextInt();
            
                switch(opc){
                    case 1:
                        menuUsuario.despliegaMenu();
                        menuUsuario.elegirOpcion();
                        break;
                    default:
                        System.out.println("Elige otra opcion");
                        break;
                }
            }
            catch(Exception ex){
                System.out.println("Elige una opción valida");
                sc.nextLine();
            }
            
        }
        while(opc != 5);
        
        
        sc.close();
    }
}
