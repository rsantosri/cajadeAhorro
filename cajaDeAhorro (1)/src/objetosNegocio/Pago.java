/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.sql.Date;
import java.util.Objects;

/**
 *
 * @author melis
 */
public class Pago {

    private String clavePago;
    private String claveAbonado;
    private java.sql.Date fecha;
    private char tipo;
    private float importe;
    private float multa;
    private float efectivo;
    private float intereses;
    private String ticket;

    public Pago(String clavePago) {
        this.clavePago = clavePago;
    }

    public Pago(String clavePago, String claveAbonado, Date fecha, char tipo, float importe, float multa, float efectivo, float intereses, String ticket) {
        this.clavePago = clavePago;
        this.claveAbonado = claveAbonado;
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.multa = multa;
        this.efectivo = efectivo;
        this.intereses = intereses;
        this.ticket = ticket;
    }

    public String getClavePago() {
        return clavePago;
    }

    public void setClavePago(String clavePago) {
        this.clavePago = clavePago;
    }

    public String getClaveAbonado() {
        return claveAbonado;
    }

    public void setClaveAbonado(String claveAbonado) {
        this.claveAbonado = claveAbonado;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }

    public float getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(float efectivo) {
        this.efectivo = efectivo;
    }

    public float getIntereses() {
        return intereses;
    }

    public void setIntereses(float intereses) {
        this.intereses = intereses;
    }

    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.clavePago);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pago other = (Pago) obj;
        if (!Objects.equals(this.clavePago, other.clavePago)) {
            return false;
        }
        return true;
    }
    
}
