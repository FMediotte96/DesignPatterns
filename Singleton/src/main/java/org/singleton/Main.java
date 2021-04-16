package org.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        System.out.println(s1.getClass());

        //Singleton s2 = new Singleton();
        //lanza un error ya que el constructor es privado
    }
}
