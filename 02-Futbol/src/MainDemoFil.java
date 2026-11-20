
public class MainDemoFil {
    public static void main(String[] args) {
        Thread actualF= Thread.currentThread();
        System.out.println("Prioridad -> " + actualF.getPriority() + ", Nom ->" + actualF.getName());
        System.out.println("toString() -> " + actualF );
    }
}
