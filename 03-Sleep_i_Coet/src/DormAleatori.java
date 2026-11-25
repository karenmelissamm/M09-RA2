public class DormAleatori extends Thread {
    private 
    public DormAleatori(String nom){
        super(nom);
    }
    @Override 
    public void run(){
        for (int i = 0; i < 10; i++) {
            
        }
    }

public static void main(String[] args) {
    DormAleatori h1= new DormAleatori("Joan");
    DormAleatori h2= new DormAleatori("Pep");
    h1.start();
    h2.start();
}    
}
