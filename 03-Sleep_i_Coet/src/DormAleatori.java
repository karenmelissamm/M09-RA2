import java.nio.channels.Pipe.SourceChannel;

public class DormAleatori extends Thread {
    private final long creacion = System.currentTimeMillis();

    public DormAleatori(String nom){
        super(nom);
    }
    @Override 
    public void run(){
        //muestra nom, num_iteracio,interval_aletario, total de temps des de la construccion
        for (int num_iteracio = 0; num_iteracio < 10; num_iteracio++) {
            int interval_aletario = (int)(Math.random()*1000);
            long total_temps= System.currentTimeMillis()-creacion;
            System.out.println(getName() + " ("+num_iteracio+") " + interval_aletario + "ms" + " total " + total_temps + "ms");
            try {
                Thread.sleep(interval_aletario);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

public static void main(String[] args) {
    DormAleatori h1= new DormAleatori("Joan");
    DormAleatori h2= new DormAleatori("Pep");
    h1.start();
    h2.start();

    System.out.println("-- Fi de main ------------");

}    
}
