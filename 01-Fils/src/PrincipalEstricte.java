package src;

public class PrincipalEstricte {
    public static void main(String[] args) {
        Fils h1= new Fils("Juan", Thread.NORM_PRIORITY, 1, 0, "Termina");
        Fils h2= new Fils("Pepe", Thread.NORM_PRIORITY, 1, 0, "Termina");

        h1.start();
        h2.start();
        System.out.println("Termina thread main");
    }
}
