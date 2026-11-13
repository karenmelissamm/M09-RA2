package src;

public class PrincipalDiferents   {
    public static void main(String[] args) {
        Fils h1= new Fils("Pepe", Thread.MIN_PRIORITY,0,1000);
        Fils h2= new Fils("Juan", Thread.MAX_PRIORITY, 0, 1000);
        h1.start();
        h2.start();
        System.out.println("Acaba thread main");
    }
}
