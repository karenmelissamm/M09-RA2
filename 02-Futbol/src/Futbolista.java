public class Futbolista extends Thread{
    private final int NUM_JUGADORS=11;
    private final int NUM_TIRADES=20;
    private final Float PROBABILITAT=0.5f;

    private int ngols;
    private int ntirades;

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
        
    }
}
