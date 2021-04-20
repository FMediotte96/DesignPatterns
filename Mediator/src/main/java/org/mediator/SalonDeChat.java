package org.mediator;

import java.util.HashMap;
import java.util.Map;

public class SalonDeChat implements IChat {
    private Map<String, Usuario> participantes = new HashMap<>();

    @Override
    public void registra(Usuario user) {
        participantes.put(user.getNombre(), user);
    }

    @Override
    public void envia(String from, String to, String message) {
        if(participantes.containsKey(from) && participantes.containsKey(to)) {
            Usuario u = participantes.get(to);
            u.recibe(from, message);
        }
    }
}
