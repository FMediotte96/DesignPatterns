package org;

import org.adapter.ViejaToNuevaAdapter;
import org.model.IPersonaNueva;
import org.model.PersonaVieja;

import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {
        PersonaVieja pv = new PersonaVieja();
        pv.setApellido("Perez");
        pv.setNombre("Maxi");
        GregorianCalendar g = new GregorianCalendar();
        g.set(2000, 01, 01);

        //Seteamos que nacio en el año 2000
        Date d = g.getTime();
        pv.setFechaDeNacimiento(d);

        IPersonaNueva adapter = new ViejaToNuevaAdapter(pv);
        System.out.println(adapter.getEdad());
        System.out.println(adapter.getNombre());
        adapter.setEdad(10);
        adapter.setNombre("Juan Perez");

        System.out.println(adapter.getEdad());
        System.out.println(adapter.getNombre());
    }
}
