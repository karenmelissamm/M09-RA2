public class Futbolista extends Thread{
    private static final int NUM_JUGADORS=11;
    private static final int NUM_TIRADES=20;
    private static final Float PROBABILITAT=0.5f;

    private int ngols;
    private int ntirades;
    
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
        for (int i = 0; i <=9; i++) {
            System.out.println(getName()+" "+i);
            long c=0;
            for (int j = 0; j < ; c++) {
            }
        }
    public static void main(String[] args) {
        String [] nomFutbolista={"Pique","Vinicius","Torres","Ramos","Ronaldo","Lewan","Belli", "Arnau", "Aspas", "Messi","MBape"};
        Futbolista[] jugadores= new Futbolista[NUM_JUGADORS];
        for (int i = 0; i < NUM_JUGADORS; i++) {
            jugadores[i]=new Futbolista(nomFutbolista[i]);
            jugadores[i].start();
        }



    
        

        
    }
}
