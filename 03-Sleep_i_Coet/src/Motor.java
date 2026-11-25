public class Motor extends Thread {
    private final int id;
    private volatile int potenciaObjectiu= 0;
    private int potenciaActual = 0;
    private volatile boolean ordres= false;

    public Motor(int id){
        this.id=id;
    }
    public void setPotencia(int p){
        potenciaObjectiu = p;
        ordres=true;
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
        while(!ordres){
            try{
                Thread.sleep(50);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        while(potenciaActual!=0 || potenciaObjectiu!=0 || ordres){
            int pObj=potenciaObjectiu;
            if(potenciaActual<pObj){
                simulacionMotorReal();
                potenciaActual++;
                System.out.println("Motor " + id + ": Incre. Objectiu: "+ pObj + " Actual: " + potenciaActual);
            }else if (potenciaActual > pObj){
                simulacionMotorReal();
                potenciaActual--;
                System.out.println("Motor " + id + ": Decre. Objectiu: " + pObj + " Actual: " + potenciaActual);
            }else if (ordres) {
                ordres = false;
                System.out.println("Motor " + id + ": FerRes Objectiu: " + pObj + " Actual: " + potenciaActual);
            }else {
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
    

    
    

