/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admAhorros;

import interfacesNegocio.IAdmAhorros;
import java.util.List;
import objetosNegocio.Ahorro;
import objetosNegocio.Pago;
import objetosNegocio.Persona;

/**
 *
 * @author melis
 */
public class FAdmAhorros implements IAdmAhorros {

    private CAdmAhorros c;
    
    public FAdmAhorros() {
        c = new CAdmAhorros();
    }

    @Override
    public List<Ahorro> obtenerCuentas(Persona persona) {
        return c.obtenerCuentas(persona);
    }
    
    @Override
    public Pago registrarPago(Pago p) {
        return c.registrarPago(p);
    }

}
