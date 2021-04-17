package org.command.model.commands;

import org.command.model.Command;
import org.command.model.servers.IServer;

public class ApagarServer implements Command {

    private IServer servidor;

    public ApagarServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificarConexion();
        servidor.guardaLog();
        servidor.apagate();
        servidor.cerraConexion();
    }
}
