package org.command.main;

import org.command.model.Command;
import org.command.model.Invoker;
import org.command.model.commands.PrendeServer;
import org.command.model.servers.ArgentinaServer;
import org.command.model.servers.IServer;

public class Main {

    public static void main(String[] args) {
        IServer server = new ArgentinaServer();
        Command command = new PrendeServer(server);

        Invoker serverAdmin = new Invoker(command);
        serverAdmin.run();
    }
}
