package org.facade.model;

import org.facade.actions.AdministracionAlquiler;
import org.facade.actions.CuentasAPagar;
import org.facade.actions.MuestraPropiedad;
import org.facade.actions.VentaInmueble;

public class Inmobiliaria {

    private MuestraPropiedad muestraPropiedad;
    private VentaInmueble ventaInmueble;
    private CuentasAPagar cuentasAPagar;
    private AdministracionAlquiler administracionAlquiler;

    public Inmobiliaria() {
        muestraPropiedad = new MuestraPropiedad();
        ventaInmueble = new VentaInmueble();
        cuentasAPagar = new CuentasAPagar();
        administracionAlquiler = new AdministracionAlquiler();
    }

    public void atencionCliente(Cliente c) {
        System.out.println("Atendiendo a un cliente");
    }

    public void atencionPropietario(Propietario p) {
        System.out.println("Atendiendo a un propietario");
    }

    public void atencionInteresado(Interesado i) {
        System.out.println("Atención a un interesado en una propiedad");
    }

    public void atencion(Persona p) {
        if (p instanceof Cliente) {
            atencionCliente((Cliente) p);
        } else if(p instanceof Propietario) {
            atencionPropietario((Propietario) p);
        } else {
            atencionInteresado((Interesado) p);
        }
    }

    public void mostrarPropiedad(int numeroPropiedad) {
        muestraPropiedad.mostrarPropiedad(numeroPropiedad);
    }

    public void gestionarVenta() {
        ventaInmueble.gestionaVenta();
    }

    public void pagar(int monto) {
        cuentasAPagar.pagoPropietario(monto);
    }

    public void cobrarAlquiler(double monto) {
        administracionAlquiler.cobro(monto);
    }
}
