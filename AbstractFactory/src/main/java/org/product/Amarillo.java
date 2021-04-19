package org.product;

public class Amarillo extends Color {
    @Override
    public void colorea(TV tv) {
        System.out.println("Pintando de amarillo en el televisor " + tv.getDescripcion());
    }
}
