public class Futbolista extends Thread{
    private final int NUM_JUGADORS=11;
    private final int NUM_TIRADES=20;
    private final Float PROBABILITAT=0.5f;

    private int ngols;
    private int ntirades;
    
    public Futbolista(){}
    public Futbolista(int ngols,int ntirades){
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
    public static void main(String[] args) {
        Futbolista pique= new Futbolista();
        Futbolista vinicius= new Futbolista();
        Futbolista torres= new Futbolista();
        Futbolista ramos= new Futbolista();
        Futbolista ronaldo= new Futbolista();
        Futbolista lewan= new Futbolista();
        Futbolista belli= new Futbolista();
        Futbolista arnau= new Futbolista();
        Futbolista aspas= new Futbolista();
        Futbolista messi= new Futbolista();
        Futbolista mbape= new Futbolista();
        pique.setName("Pique");
        vinicius.setName("Vinicius");
        torres.setName("Torres");
        ramos.setName("Ramos");
        ronaldo.setName("Ronaldo");
        lewan.setName("Lewan");
        belli.setName("Belli");
        arnau.setName("Arnau");
        aspas.setName("Aspas");
        messi.setName("Messi");
        mbape.setName("MBapé");

        pique.start();
        vinicius.start();
        torres.start();
        ramos.start();
        ronaldo.start();
        lewan.start();
        belli.start();
        arnau.start();
        aspas.start();
        messi.start();
        mbape.start();
        

        
    }
}
