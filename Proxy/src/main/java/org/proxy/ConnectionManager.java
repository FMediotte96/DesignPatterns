package org.proxy;

public class ConnectionManager {

    private static ConnectionManager instance;
    private static boolean hayConexion;

    private ConnectionManager(){
        hayConexion = false;
    }

    public synchronized static ConnectionManager getInstance() {
        if(instance == null) {
            instance = new ConnectionManager();
        }
        return instance;
    }

    public static void conectate() {
        hayConexion = true;
    }

    public static void desconectate() {
        hayConexion = false;
    }

    public static boolean hayConexion() {
        return hayConexion;
    }
}
