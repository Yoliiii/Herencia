public class Tiburon extends Pez implements IJugar{
    /**
     * Constructor para objetos de la clase Animal
     *
     * @param nombre
     */
    public Tiburon(String nombre) {
        super(nombre);
    }

    public void comunicarse(){
        System.out.println("Arqueo el cuerpo para comunicarse");
    }

    @Override
    public void saltarPorUnAro() {

    }

    @Override
    public void perseguirUnObjeto(String objeto) {

    }
}
