/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import interfacesPersistencia.IPersistencia;
import java.util.List;
import objetosNegocio.Ahorro;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import objetosNegocio.Prestamo;

/**
 *
 * @author melis
 */
public class FPersistencia implements IPersistencia {

    private CPersistencia persistencia;

    public FPersistencia() {
        persistencia = new CPersistencia();
    }

    @Override
    public Persona buscarPersona(Persona p) {
        return persistencia.buscarPersona(p);
    }

    @Override
    public List<Ahorro> obtenerCuentas(Persona persona) {
        return persistencia.obtenerCuentas(persona);
    }

    @Override
    public Pago registrarPago(Pago p) {
        return persistencia.registrarPago(p);
    }

    @Override
    public List<Prestamo> obtenerPrestamos(Persona persona) {
        return persistencia.obtenerPrestamos(persona);
    }
    
    @Override
    public List<Pago> obtenerPagos(Persona persona) {
        return persistencia.obtenerPagos(persona);
    }

}
