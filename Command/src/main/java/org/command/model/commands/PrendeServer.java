package org.command.model.commands;

import org.command.model.Command;
import org.command.model.servers.IServer;

public class PrendeServer implements Command {

    private IServer servidor;

    public PrendeServer(IServer servidor) {
        this.servidor = servidor;
    }

    @Override
    public void execute() {
        servidor.conectate();
        servidor.verificarConexion();
        servidor.prendete();
        servidor.guardaLog();
        servidor.cerraConexion();
    }
}
