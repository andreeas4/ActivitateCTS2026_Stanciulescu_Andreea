package ro.ase.seminar1.main;

import ro.ase.seminar1.animale.Tigru;
import ro.ase.seminar1.zoo.Zoo;
import ro.ase.seminar1.zoo.ZooKeeper;
import ro.ase.seminar1.animale.Lion;
import ro.ase.seminar1.animale.Zebra;

public class Main {
    public static void main(String []args){
        Lion leoaica=new Lion("Geana",12,200);
        ZooKeeper zooK=new ZooKeeper("Vasilica");
        Zebra zebruta=new Zebra("Zebruta",6,300);
        Zoo gradinaZoo=new Zoo("CrazyZoo",zooK);

        String mancareZ="Paie";
        String mancareL="Iepuri";

        gradinaZoo.addAnimal(leoaica);
        gradinaZoo.addAnimal(zebruta);
        gradinaZoo.addAnimal(new Tigru("Tigrut",2,"Bengalez"));
        gradinaZoo.feedAllAnimal();


    }
}
