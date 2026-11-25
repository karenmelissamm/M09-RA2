import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coet {
    private final Motor[] motors= new Motor[4];
    public Coet(){
        for (int i = 0; i < motors.length; i++) {
            motors[i]= new Motor(i);
        }
    }
    public void sePasaPotencia(int p){
        if( p<0 || p>10){
            throw new IllegalArgumentException("Potència errònia: ha d'estar entre 0 i 10");
        }
        for (Motor motor : motors) {
            motor.setPotencia(p);
        }
    }
    public void arranca(){
        for (Motor motor : motors) {
            motor.start();
        }
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        int p=1;
        while(p !=0){
            try {
                String text= entrada.readLine();
                if(text.trim().isEmpty()){
                    continue;
                }
                p= Integer.parseInt(text.trim());
                System.out.println("Passant a potencia " + p);
                sePasaPotencia(p);
            } catch (IOException e) {
                e.printStackTrace();
            }catch (NumberFormatException e){
                System.out.println("Cal escriure un número");
            } catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        for (Motor motor : motors) {
            try {
                motor.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        new Coet().arranca();
    }
}
