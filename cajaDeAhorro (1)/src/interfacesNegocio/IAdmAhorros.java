/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesNegocio;

import java.util.List;
import objetosNegocio.Ahorro;
import objetosNegocio.Pago;
import objetosNegocio.Persona;

/**
 *
 * @author melis
 */
public interface IAdmAhorros {
    
    public List<Ahorro> obtenerCuentas(Persona persona);
    
    public Pago registrarPago(Pago p);
    
}
