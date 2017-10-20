/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocio;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author melis
 */
public class Ahorro {
    
    private String noCuenta;
    private String propietario;
    private String titular;
    private float ahorroFijo;
    private List<Pago> pagos;

    public Ahorro(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public Ahorro(String noCuenta, String propietario, String titular, float ahorroFijo, List<Pago> pagos) {
        this.noCuenta = noCuenta;
        this.propietario = propietario;
        this.titular = titular;
        this.ahorroFijo = ahorroFijo;
        this.pagos = pagos;
    }
    
    public String getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(String noCuenta) {
        this.noCuenta = noCuenta;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public float getAhorroFijo() {
        return ahorroFijo;
    }

    public void setAhorroFijo(float ahorroFijo) {
        this.ahorroFijo = ahorroFijo;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 17 * hash + Objects.hashCode(this.noCuenta);
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
        final Ahorro other = (Ahorro) obj;
        if (!Objects.equals(this.noCuenta, other.noCuenta)) {
            return false;
        }
        return true;
    }
    
}
