package ro.ase.cts.main;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.readers.AplicantiReader;
import ro.ase.cts.readers.EmployersReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

    public static void main(String[] args) {
        List<Aplicant> listaAplicanti;
        Aplicant.setPragPunctaj(85);
        try {
            AplicantiReader ra = new EmployersReader("s2/angajati.txt");
            listaAplicanti = ra.readAplicanti();
            for (Aplicant aplicant : listaAplicanti) {
                System.out.println(aplicant.toString());
                aplicant.afisareVenit();
                aplicant.afisareStatut();
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
