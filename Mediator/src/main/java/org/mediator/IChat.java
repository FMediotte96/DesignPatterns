package org.mediator;

public interface IChat {
    void registra(Usuario participante);
    void envia(String from, String to, String message);
}
