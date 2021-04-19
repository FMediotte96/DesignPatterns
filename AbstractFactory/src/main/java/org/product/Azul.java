package org.product;

public class Azul extends Color {
    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de azul en el televisor " + tv.getDescripcion());
    }
}
