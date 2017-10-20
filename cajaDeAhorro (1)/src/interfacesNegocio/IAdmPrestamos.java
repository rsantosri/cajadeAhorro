/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesNegocio;

import java.util.List;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import objetosNegocio.Prestamo;

/**
 *
 * @author melis
 */
public interface IAdmPrestamos {
 
    public List<Prestamo> obtenerPrestamos(Persona persona);
    
    public Pago registrarPago(Pago p);
}
