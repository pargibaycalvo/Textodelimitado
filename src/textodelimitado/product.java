/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textodelimitado;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author oracle
 */
public class product {
    
    String codigo;
    String descripcion;
    double prezo;
    
    
    public product() {
        codigo = null;
        descripcion = null;
        prezo = 0;
    }

    public product(String codigo, String descripcion, double prezo) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.prezo = prezo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrezo() {
        return prezo;
    }

    public void setPrezo(double prezo) {
        this.prezo = prezo;
    }

    @Override
    public String toString() {
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMANY); 
        return "product{" + "codigo=" + codigo + ", descripcion=" + descripcion + ", prezo=" + nf.format(prezo) + '}';
    }
    
}

