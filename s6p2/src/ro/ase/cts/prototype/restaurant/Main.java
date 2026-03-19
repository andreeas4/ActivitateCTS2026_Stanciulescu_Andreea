package ro.ase.cts.prototype.restaurant;

import ro.ase.cts.prototype.restaurant.clase.Rezervare;

public class Main {
    static void main() {
        Rezervare rezervare=new Rezervare("Gheorghe",12,14,"8909876543235678");
        Rezervare rez2= (Rezervare) rezervare.copiaza();
        rez2.setNrPersoane(4);
        rez2.setOra(4);

        System.out.println(rez2);
        System.out.println(rezervare);

    }
}
