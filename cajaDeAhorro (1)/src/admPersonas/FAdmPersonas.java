/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admPersonas;

import interfacesNegocio.IAdmPersonas;
import objetosNegocio.Persona;

/**
 *
 * @author melis
 */
public class FAdmPersonas implements IAdmPersonas{

    private CAdmPersonas c;

    public FAdmPersonas() {
        c = new CAdmPersonas();
    }    
    
    @Override
    public Persona buscarPersona(Persona p) {
        return c.buscarPersona(p);
    }
    
}
