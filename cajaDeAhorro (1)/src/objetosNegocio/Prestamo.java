/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.sql.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author melis
 */
public class Prestamo {

    private String clavePrestamo;
    private java.sql.Date fecha;
    private java.sql.Date fechaProxPago;
    private String pagare;
    private float monto;
    List<Pago> pagos;

    public Prestamo(String clavePrestamo) {
        this.clavePrestamo = clavePrestamo;
    }

    public Prestamo(String clavePrestamo, Date fecha, Date fechaProxPago, String pagare, float monto, List<Pago> pagos) {
        this.clavePrestamo = clavePrestamo;
        this.fecha = fecha;
        this.fechaProxPago = fechaProxPago;
        this.pagare = pagare;
        this.monto = monto;
        this.pagos = pagos;
    }

    public String getClavePrestamo() {
        return clavePrestamo;
    }

    public void setClavePrestamo(String clavePrestamo) {
        this.clavePrestamo = clavePrestamo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaProxPago() {
        return fechaProxPago;
    }

    public void setFechaProxPago(Date fechaProxPago) {
        this.fechaProxPago = fechaProxPago;
    }

    public String getPagare() {
        return pagare;
    }

    public void setPagare(String pagare) {
        this.pagare = pagare;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.clavePrestamo);
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
        final Prestamo other = (Prestamo) obj;
        if (!Objects.equals(this.clavePrestamo, other.clavePrestamo)) {
            return false;
        }
        return true;
    }
    
    
}
