package org.chain.model;

public interface IAprobador {

    void setNext(IAprobador aprobador);

    IAprobador getNext();

    public void solicitudPrestamo(int monto);
}
