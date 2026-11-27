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
    public Treballador(int sou_anual_brut, int edat_inici_treball, int edat_fi_treball){
        this.sou_anual_brut=sou_anual_brut;
        this.edat_inici_treball= edat_inici_treball;
        this.edat_fi_treball= edat_fi_treball;
    }

    public int getEdat_actual() {
        return edat_actual;
    }

    public float getCobrat() {
        return cobrat;
    }
    public float cobra(float cobra){
        return cobra*12;
    }
    public float pagaImpostos(float cobrat){
        float impuesto=(cobrat*24)/100;
        return impuesto;
    }


    @Override 
    public void run(){
        for (int i = edat_inici_treball; i < edat_fi_treball; i++) {
            System.out.println(i);
        }

    }
    
    
}
