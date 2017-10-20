/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admPersonas;

import interfacesPersistencia.IPersistencia;
import objetosNegocio.Persona;
import persistencia.FPersistencia;

/**
 *
 * @author melis
 */
public class CAdmPersonas {

    private IPersistencia persistencia;

    public CAdmPersonas() {
        persistencia = new FPersistencia();
    }

    Persona buscarPersona(Persona p) {
        return persistencia.buscarPersona(p);
    }

}
