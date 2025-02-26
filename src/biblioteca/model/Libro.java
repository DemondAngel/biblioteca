/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

/**
 *
 * @author iarog
 */
public class Libro {
    
    private int paginas;
    private String editorial;
    private int codigo;
    private String titulo;
    private String ISBN;
    private Autor autor;

    public Libro(int paginas, String editorial, int codigo, String titulo, String ISBN, Autor autor) {
        this.paginas = paginas;
        this.editorial = editorial;
        this.codigo = codigo;
        this.titulo = titulo;
        this.ISBN = ISBN;
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    @Override
    public String toString() {
        return "Libro{" + "paginas=" + paginas + ", editorial=" + editorial + ", codigo=" + codigo + ", titulo=" + titulo + ", ISBN=" + ISBN + '}';
    }
    
    
}
