package ro.ase.seminar1.zoo;

import ro.ase.seminar1.animale.Animal;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String name) {
        this.name = name;
    }

    public void feedAnimal(Animal animal) {
        System.out.println("Zookeeper-ul "+name+" a hranit "+animal.getName());
        animal.eat("mancare");
    }
}
