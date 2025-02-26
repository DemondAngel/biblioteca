/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.controlador;

import java.util.List;

/**
 *
 * @author iarog
 */
public abstract class Menu {
    
    protected String titulo;
    protected  List<String> opciones;

    public Menu(String titulo, List<String> opciones) {
        this.titulo = titulo;
        this.opciones = opciones;
    }
    
    public Menu(){
    
    }
    
    public void despliegaMenu(){
        
        System.out.println(titulo);
        for(int i = 0; i < opciones.size(); i++){
            System.out.println(opciones.get(i));
        }
    }
    
    public void elegirOpcion(){
        
    }

    public String getTitulo() {
        return titulo;
    }

    public List<String> getOpciones() {
        return opciones;
    }
    
    
}
