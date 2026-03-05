package ro.ase.cts.readers;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployersReader extends AplicantiReader {
    public EmployersReader(String fisier) {
        super(fisier);
    }

    @Override
    public List<Aplicant> readAplicanti() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.numeFisier));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (input.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicanti(input, a);
            int salariu = input.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input.close();
        return angajati;
    }
}
