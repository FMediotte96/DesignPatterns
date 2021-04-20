package org.visitor;

import org.model.ProductoDescuento;
import org.model.ProductoNormal;

public interface Visitor {
    double visit(ProductoNormal normal);
    double visit(ProductoDescuento reducido);
}
