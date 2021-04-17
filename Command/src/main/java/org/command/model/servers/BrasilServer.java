package org.command.model.servers;

public class BrasilServer implements IServer {

    @Override
    public void apagate() {
        System.out.println("Apagando el servidor de Brasil");
    }

    @Override
    public void prendete() {
        System.out.println("Prendiendo el servidor de Brasil");
    }

    @Override
    public void conectate() {
        System.out.println("Conectando al servidor de Brasil");
    }

    @Override
    public void verificarConexion() {
        System.out.println("Comprobando la conexión de Brasil");
    }

    @Override
    public void guardaLog() {
        System.out.println("Guardar Log de Brasil");
    }

    @Override
    public void cerraConexion() {
        System.out.println("Cerrando conexión con el servidor de Brasil");
    }
}
