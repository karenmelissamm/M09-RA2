package src;

public class Fils extends Thread {

    private  final int delay;
    private final int count;

    public Fils(String nom, int prioritat, int delay, int count){
        super(nom);
        setPriority(prioritat);
        this.delay=delay;
        this.count=count;
    }
    @Override 
    public void run(){
        for (int i = 0; i <=9; i++) {
            System.out.println(getName()+" "+i);
            long c=0;
            for (int j = 0; j < count; c++) {

                
            }
        }
    }
    
}