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
        this.rnd= new Random();
    }

    public int getEdat() {
        return edat_actual;
    }

    public float getCobrat() {
        return cobrat;
    }
    public void cobra(){
        cobrat+=(sou_anual_brut/12);

    }
    public void pagaImpostos(){
        float impuesto=(sou_anual_brut/12)*24/100;
        cobrat-=impuesto;
    }


    @Override 
    public void run(){
        for (int edat_actual = edat_inici_treball; edat_actual< edat_fi_treball; edat_actual++) {
            for(int mes= 0; mes<12; mes++){
                cobra();
                pagaImpostos();
            }
        }
        edat_actual =edat_fi_treball;
    }
}
