package org.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements IPersonal {
    private List<IPersonal> values = new ArrayList<>();

    public void agrega(IPersonal personal) {
        values.add(personal);
    }
    @Override
    public void getDatosPersonal() {
        values.forEach(IPersonal::getDatosPersonal);
    }
}
