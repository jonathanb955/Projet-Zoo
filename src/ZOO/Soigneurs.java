package ZOO;

import java.util.Random;

public class Soigneurs {
    private String nom;
    private String specialite;


    public Soigneurs(String nom, String specialite) {
        this.nom = nom;
        this.specialite = specialite;

    }


    public void diagnostiquer(Animal animal, Random RandomUtils){
        int maladeOuPasMalade = RandomUtils.nextInt(2);
        if (maladeOuPasMalade == 0) {
            System.out.println(animal.espece+animal.getNom()+"est malade");
        } else {
            System.out.println(animal.espece+animal.getNom()+"n'est pas malade");
        }
    }
    public void soigner(Animal animal) {
        System.out.println(nom+"soigne"+animal.getNom());


    }
}
