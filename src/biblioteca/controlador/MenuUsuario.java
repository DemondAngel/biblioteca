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
    private List<Usuario> usuarios = new ArrayList();
    private Scanner sc = new Scanner(System.in);
    
    public MenuUsuario() {
        String titulo = "Usuarios";
        List<String> opciones = new ArrayList<String>();
        opciones.add("1.Crear usuario");
        opciones.add("2.Actualizar usuario");
        opciones.add("3. Consultar usuarios");
        opciones.add("4. Consultar perfil");
        opciones.add("5. Eliminar usuario");
        opciones.add("6. Salir");
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    @Override
    public void elegirOpcion(){
        int opc = 0;
        do{
            if(opc != 0){
                despliegaMenu();
            }
            try{
                opc = sc.nextInt();
        
                if(opc == 1){
                    this.usuarios.add(crearUsuario());
                    System.out.println("Usuario creado");
                }
                else if(opc == 3){
                    for(Usuario usu: this.usuarios){
                        System.out.println(usu.toString());
                    }
                }
                else if(opc == 4){
                    System.out.println(this.usuario.toString());
                }
                else {
                    System.out.println("Saliendo");
                }
            }
            catch(Exception ex){
                System.out.println("Elige una opcion valida");
                sc.nextLine();
            }
            
        }
        while(opc != 6);
        
    }
    
    public Usuario crearUsuario(){
        
        String nombre = "", direccion = "", telefono = "";
        int codigo = 0;
        
        System.out.println("Inserta un código");
        codigo = sc.nextInt();
        sc.nextLine();
        System.out.println("Inserta un nombre");
        nombre = sc.nextLine();
        System.out.println("Inserta una dirección");
        direccion = sc.nextLine();
        System.out.println("Inserta un teléfono");
        telefono = sc.nextLine();
        
        Usuario usu = new Usuario(codigo,nombre,direccion, telefono);
        
        return usu;
        
    }
     
}
