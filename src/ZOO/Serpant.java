package ZOO;

public class Serpant extends Animal {
    public Serpant(String nom, int age) {
        super (nom, age, "Le serpant");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom+"siffle");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom+" rampe");
    }
    public void manger() {
        System.out.println("Le serpant mange des rongeurs");
    }
}
