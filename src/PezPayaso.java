public class PezPayaso extends Pez{
    /**
     * Constructor para objetos de la clase Animal
     *
     * @param nombre
     */
    public PezPayaso(String nombre) {
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("Me comunico mediante burbujas");
    }
}
