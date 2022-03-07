public class Entrenador extends Mamifero{
    /**
     * Constructor para objetos de la clase Animal
     *
     * @param nombre
     */
    public Entrenador(String nombre) {
        super(nombre);
    }

    public void entrenar(IJugar animalQueSabeJugar){
        animalQueSabeJugar.saltarPorUnAro();
    }

    public void dejarEntrenar(Animal animal){
        if(animal instanceof IJugar){
            System.out.println("Pasa y te entreno");
        }else{
            System.out.println("Lo siento, pero no sabes jugar");
        }
    }
}
