package ZOO;

public class Lion extends Animal{
    public Lion(String nom,int age){
        super(nom,age, "Le lion");
    }

    @Override
    public void faireDuBruit() {
        System.out.println(nom+" rugit!");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom+" court");
    }

    @Override
    public void manger() {
        System.out.println("Le lion mange de la viande");
    }
}
