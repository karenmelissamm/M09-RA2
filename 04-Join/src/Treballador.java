import java.util.Random;

public class Treballador extends Thread {
    private int sou_anual_brut;
    private int edat_inici_treball;
    private int edat_fi_treball;
    private int edat_actual;
    private float cobrat;
    private Random rnd;

    public Treballador(String name, int sou_anual_brut, int edat_inici_treball, int edat_fi_treball){
        super(name);
        this.sou_anual_brut=sou_anual_brut;
        this.edat_inici_treball=edat_inici_treball;
        this.edat_fi_treball= edat_fi_treball;
        edat_actual=0;
        cobrat=0.0f;
    }

    public int getEdat_actual() {
        return edat_actual;
    }

    public float getCobrat() {
        return cobrat;
    }
    public float cobra(float cobra){
        return 0.0f;
    }
    public float pagaImpostos(float cobrat){
        return 1.1f;
    }

    
    @Override 
    public void run(){

    }
    
    
}
