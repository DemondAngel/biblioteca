/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca.model;

import java.util.Date;
import java.util.List;

/**
 *
 * @author iarog
 */
public class Prestamo {
    private Date fechaP;
    private Date fechaD;
    private boolean devuelto;
    List<Ejemplar> ejemplares;

    public Prestamo(Date fechaP, Date fechaD, boolean devuelto, List<Ejemplar> ejemplares) {
        this.fechaP = fechaP;
        this.fechaD = fechaD;
        this.devuelto = devuelto;
        this.ejemplares = ejemplares;
    }

    public Date getFechaP() {
        return fechaP;
    }

    public void setFechaP(Date fechaP) {
        this.fechaP = fechaP;
    }

    public Date getFechaD() {
        return fechaD;
    }

    public void setFechaD(Date fechaD) {
        this.fechaD = fechaD;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    public List<Ejemplar> getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(List<Ejemplar> ejemplares) {
        this.ejemplares = ejemplares;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaP=" + fechaP + ", fechaD=" + fechaD + ", devuelto=" + devuelto + ", ejemplares=" + ejemplares + '}';
    }
    
    
}
