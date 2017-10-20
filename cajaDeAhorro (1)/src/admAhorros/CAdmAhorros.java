/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admAhorros;

import interfacesPersistencia.IPersistencia;
import java.util.List;
import objetosNegocio.Ahorro;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import persistencia.FPersistencia;

/**
 *
 * @author melis
 */
public class CAdmAhorros {
    
    private IPersistencia persistencia;
    
    public CAdmAhorros() {
        persistencia = new FPersistencia();
    }
    
    public List<Ahorro> obtenerCuentas(Persona persona) {
        return persistencia.obtenerCuentas(persona);
    }
    
    public Pago registrarPago(Pago p) {
        return persistencia.registrarPago(p);
    }
}
