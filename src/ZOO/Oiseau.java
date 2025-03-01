package ZOO;

public class Oiseau extends Animal{
    public Oiseau(String nom, int age){
        super(nom, age, "L'oiseau");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom+" chante!");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom+" vole");
    }
    public void manger() {
        System.out.println("L'oiseau mange des graines");
    }
}
