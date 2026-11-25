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
    private void simulacionMotorReal(){
        try{
            Thread.sleep(1000+(int) (Math.random()*1000));
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    @Override 
    public void run(){
        
    }
    

    
    
}
