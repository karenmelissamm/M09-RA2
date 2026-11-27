public class Administracio {
    private int num_poblacio_activa=50;
    private Treballador[] poblacio_activa;

    public Administracio(){
        poblacio_activa= new Treballador[num_poblacio_activa];
        for (int i = 0; i < num_poblacio_activa; i++) {
            poblacio_activa[i]= new Treballador("Ciutadá-" + i, 25000,20,65);
        }
    }
    public void accio(){
        for(Treballador treballador : poblacio_activa){
            treballador.start();
        }
        for (Treballador treballador : poblacio_activa) {
            try{
                treballador.join();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        for (Treballador treballador : poblacio_activa) {
            System.out.printf("%s -> edat: %d / total: %.2f%n", treballador.getName(), treballador.getEdat(),treballador.getCobrat());
        }
    }

    public static void main(String[] args) {
        new Administracio().accio();
        
    }
}
