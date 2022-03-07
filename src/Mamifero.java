public abstract class Mamifero extends Animal {
    /**
     * Constructor para objetos de la clase Animal
     *
     * @param nombre
     */
    public Mamifero(String nombre) {
        super(nombre);
    }

    public void mamar()
    {
        System.out.println("Cuando soy pequeño mamo");
    }
    @Override
    public void respirar() {

    }

    @Override
    public void moverse() {

    }
}
