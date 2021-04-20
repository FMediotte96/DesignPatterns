package org.visitor;

public interface Visitable {
    double accept(Visitor visitor);
}
