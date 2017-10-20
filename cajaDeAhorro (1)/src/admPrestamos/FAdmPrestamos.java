/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admPrestamos;

import interfacesNegocio.IAdmPrestamos;
import java.util.List;
import objetosNegocio.Pago;
import objetosNegocio.Persona;
import objetosNegocio.Prestamo;

/**
 *
 * @author melis
 */
public class FAdmPrestamos implements IAdmPrestamos {
    
    private CAdmPrestamos c;
    
    public FAdmPrestamos() {
        c = new CAdmPrestamos();
    }

    @Override
    public List<Prestamo> obtenerPrestamos(Persona persona) {
        return c.obtenerPrestamos(persona);
    }

    @Override
    public Pago registrarPago(Pago p) {
        return c.registrarPago(p);
    }
    
}
