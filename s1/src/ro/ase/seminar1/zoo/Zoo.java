package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String nume;
    ZooKeeper zooK;
    List<Animal> animale;

    public Zoo(String nume, ZooKeeper zooK) {
        this.nume = nume;
        this.zooK = zooK;
        this.animale = new ArrayList<Animal>();
    }

    public void feedAllAnimal(){
        for(Animal animal : animale)
        {
            zooK.feedAnimal(animal);
        }
    }
    public void addAnimal(Animal a){
        animale.add(a);
    }
}
