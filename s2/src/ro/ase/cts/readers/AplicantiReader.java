package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantiReader {
    public abstract List<Aplicant> readAplicanti(String file ) throws FileNotFoundException;

    public void citesteAplicanti(Scanner input,Aplicant aplicant)
    {
        String nume = input.next();
        aplicant.setNume(nume);
        String prenume = input.next();
        aplicant.setPrenume(prenume);
        int varsta = input.nextInt();
        aplicant.setVarsta(varsta);
        int punctaj = input.nextInt();
        aplicant.setPunctaj(punctaj);
        int nr = input.nextInt();
        aplicant.setNr_proiecte(nr);
        String[] vect = new String[5];
        for (int i = 0; i < nr; i++)
        {
            vect[i] = input.next();
            aplicant.setDenumireProiect(vect);
        }



    }
}
