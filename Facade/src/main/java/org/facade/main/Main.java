package org.facade.main;

import org.facade.actions.AdministracionAlquiler;
import org.facade.actions.CuentasAPagar;
import org.facade.actions.MuestraPropiedad;
import org.facade.actions.VentaInmueble;
import org.facade.model.Cliente;
import org.facade.model.Inmobiliaria;
import org.facade.model.Interesado;
import org.facade.model.Propietario;

public class Main {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        Interesado i = new Interesado();
        Propietario p = new Propietario();

        //Antes del Facade
        Inmobiliaria inmo = new Inmobiliaria();
        inmo.atencionCliente(c);
        inmo.atencionInteresado(i);
        inmo.atencionPropietario(p);

        MuestraPropiedad muestraPropiedad = new MuestraPropiedad();
        muestraPropiedad.mostrarPropiedad(123);

        VentaInmueble venta = new VentaInmueble();
        venta.gestionaVenta();

        AdministracionAlquiler alquiler = new AdministracionAlquiler();
        alquiler.cobro(20000);

        CuentasAPagar cuentasAPagar = new CuentasAPagar();
        cuentasAPagar.pagoPropietario(11000);

        System.out.println();
        //Lo mismo pero después del Facade
        Inmobiliaria inmo2 = new Inmobiliaria();
        inmo2.atencion(c);
        inmo2.atencion(i);
        inmo2.atencion(p);
        inmo2.mostrarPropiedad(123);
        inmo2.gestionarVenta();
        inmo2.cobrarAlquiler(20000);
        inmo2.pagar(11000);
    }
}
