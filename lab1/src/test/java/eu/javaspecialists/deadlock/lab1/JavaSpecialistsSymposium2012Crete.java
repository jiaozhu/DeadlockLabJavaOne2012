package eu.javaspecialists.deadlock.lab1;

public class JavaSpecialistsSymposium2012Crete {
    public static void main(String[] args)
            throws InterruptedException {
        Symposium symposium = new Symposium(5);
        symposium.run();
    }
}