public class Gato extends Mamifero implements IJugar{
    /**
     * Constructor para objetos de la clase Animal
     *
     * @param nombre
     */
    public Gato(String nombre) {
        super(nombre);
    }

    public void comunicarse(){

        System.out.println("Miau");
        super.comunicarse();
    }

    @Override
    public void respirar() {

    }

    @Override
    public void moverse() {

    }

    public void traerZapatillas(){
        System.out.println("Traeme mis zapatillas");
    }

    public void jugarConOvillos(){
        System.out.println("Me gusta jugar con ovillos");
    }

    @Override
    public void saltarPorUnAro() {

    }

    @Override
    public void perseguirUnObjeto(String objeto) {

    }
}
