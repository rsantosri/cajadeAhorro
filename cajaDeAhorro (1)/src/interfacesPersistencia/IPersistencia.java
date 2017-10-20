/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesPersistencia;

import java.util.List;
import objetosNegocio.*;
/**
 *
 * @author melis
 */
public interface IPersistencia {
    
    public Persona buscarPersona(Persona p);
    
    public List<Ahorro> obtenerCuentas(Persona persona);
    
    public Pago registrarPago(Pago p);
    
    public List<Prestamo> obtenerPrestamos(Persona persona);
    
    public List<Pago> obtenerPagos(Persona persona);
}
