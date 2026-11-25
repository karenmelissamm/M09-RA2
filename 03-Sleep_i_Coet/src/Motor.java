public class Motor extends Thread {
    private final int id;
    private static int potenciaObjectiu= 0;
    private int potenciaActual = 0;
    private static boolean ordres= false;

    public Motor(int id){
        this.id=id;
    }
    public void setPotencia(int p){
        this.potenciaObjectiu =p;
        this.ordres=true;
    }
    

    
    
}
