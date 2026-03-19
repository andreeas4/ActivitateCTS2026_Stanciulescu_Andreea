package ro.ase;

import ro.ase.ex_spital.factory.SingletonFactory;
import ro.ase.ex_spital.factory.TipAngajat;
import ro.ase.ex_spital.personal.Angajat;
import ro.ase.ex_spital.personal.Brancardier;

public class Main {
    public static void main(String[] args) {
        SingletonFactory factory=SingletonFactory.getInstanta();
        Angajat asistent= factory.getAngajat(TipAngajat.ASISTENT,"Marian Popescu",3700,9);
        System.out.println(asistent.returneazaAngajat());

        Brancardier b= (Brancardier) factory.getAngajat(TipAngajat.BRANCARDIER,"Mihai Pop",4000,4);
        b.setLocatie("Ambulanta");
        System.out.println(b.returneazaAngajat());
    }
}
