/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admPrestamos;

import interfacesPersistencia.IPersistencia;
import java.util.List;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import objetosNegocio.Prestamo;
import persistencia.FPersistencia;

/**
 *
 * @author melis
 */
public class CAdmPrestamos {
 
    private IPersistencia persistencia;
    
    public CAdmPrestamos() {
        persistencia = new FPersistencia();
    }
    
    public List<Prestamo> obtenerPrestamos(Persona persona) {
        return persistencia.obtenerPrestamos(persona);
    }
    
    public Pago registrarPago(Pago p) {
        return persistencia.registrarPago(p);
    }
}
