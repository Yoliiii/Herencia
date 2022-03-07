public class Main {
    public static void main(String[] args) {

        //Create first Objects

        Gato gato1 = new Gato("Lua");
        Perro perro1 = new Perro("Thor");
        Tiburon tiburon1 = new Tiburon("White");

        perro1.respirar();
        tiburon1.respirar();
        gato1.respirar();
        tiburon1.comunicarse();
        gato1.comunicarse();
        perro1.comunicarse();
        perro1.traerZapatillas();
        gato1.jugarConOvillos();

        //Create second Objects

        Gato gato2 = new Gato("Leila");
        Perro perro2 = new Perro("MiniThor");
        Tiburon tiburon2 = new Tiburon("Black");
        PezPayaso pezPayaso = new PezPayaso("Dori");

        gato2.comunicarse();
        perro2.comunicarse();
        tiburon2.comunicarse();
        pezPayaso.comunicarse();
        gato2.mamar();
        perro2.respirar();
        tiburon2.respirar();
        pezPayaso.respirar();
    }
}
