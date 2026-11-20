public class Futbolista extends Thread{
    private static final int NUM_JUGADORS=11;
    private static final int NUM_TIRADES=20;
    private static final Float PROBABILITAT=0.5f;

    private int ngols;
    private int ntirades;
    
    public Futbolista(){}
    public Futbolista(String nom){
        super.getName();
        ngols=0;
        ntirades=0;
    }
    public int getNgols() {
        return ngols;
    }
    public void setNgols(int ngols) {
        this.ngols = ngols;
    }
    public int getNtirades() {
        return ntirades;
    }
    public void setNtirades(int ntirades) {
        this.ntirades = ntirades;
    }
    @Override 
    public void run(){
        for (int i = 0; i <NUM_TIRADES; i++) {
            ntirades++;
            if(Math.random()<PROBABILITAT){
                ngols++;
            }    
        }
    }    
    public static void main(String[] args) throws InterruptedException {
        String [] nomFutbolista={"Pique","Vinicius","Torres","Ramos","Ronaldo","Lewan","Belli", "Arnau", "Aspas", "Messi","MBape"};
        Futbolista[] jugadores= new Futbolista[NUM_JUGADORS];
        for (int i = 0; i < NUM_JUGADORS; i++) {
            jugadores[i]=new Futbolista(nomFutbolista[i]);
        }        
        //muestra de estadisticas
        System.out.println("Inici dels xuts --------------------");
        System.out.println("Fi dels xuts -----------------------");
        System.out.println("---Estadístiques ------");
        
        for (Futbolista jugaF:jugadores) {
            jugaF.start();
            System.out.println(jugaF);
        }
        for (Futbolista jugaF : jugadores) {
            jugaF.join();
            System.out.println(nomFutbolista + "->" + );
        }
        
    }
}
