package ZOO;

import java.util.Random;

public class Visiteurs {
    private String nom;
    private String prenom;
    private int age;
    private String typeBillet;

    public Visiteurs(int age, String typeBillet) {
        this.age = age;
        this.typeBillet = typeBillet;
    }
    public void interactionAnimaux(Animal animal, Random RandomUtils){
        int expression = RandomUtils.nextInt(3);
        if (expression == 0) {
            System.out.println(nom+prenom+" est émerveillé par "+ animal.espece+animal.getNom() );
        } else if (expression == 1) {
            System.out.println(nom+prenom+ "est curieux de");
        }else {
            System.out.println(nom+prenom+" est compatissant envers"+animal.espece+animal.getNom());
        }
    }
    public int conditionPrixBillet(){
        if (age<=16) {
            return 7;
        }else {
            return 15;
        }
    }
    public void prixBillet(Animal animal){
        System.out.println(nom+prenom +"("+age+"ans) doit payer "+conditionPrixBillet()+"€ pour son billet");

    }
}
