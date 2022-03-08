import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Animal>animales = new ArrayList<>();

    public Zoo(){
    }

    public void añadirAnimal(Animal animal){
        animales.add(animal);
    }

    public void Show(){
        for (Animal animal: animales) {
            System.out.println("Animal: " + animal.getNombre());
        }
    }
}
