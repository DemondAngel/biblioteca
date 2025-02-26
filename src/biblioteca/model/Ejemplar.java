/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author iarog
 */
public class Ejemplar {
    private int codigo;
    private String localizacion;
    private Libro libro;

    public Ejemplar(int codigo, String localizacion, Libro libro) {
        this.codigo = codigo;
        this.localizacion = localizacion;
        this.libro = libro;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "codigo=" + codigo + ", localizacion=" + localizacion + '}';
    }
    
    
}
