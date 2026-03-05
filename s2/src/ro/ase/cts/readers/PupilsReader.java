package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilsReader extends AplicantiReader {
    public PupilsReader(String fisier) {
        super(fisier);
    }

    @Override
    public List<Aplicant> readAplicanti() {
        Scanner input = null;
        try {
            input = new Scanner(new File(super.numeFisier));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev e = new Elev();
            super.citesteAplicanti(input, e);
            int clasa = input.nextInt();
            e.setClasa(clasa);
            String tutore = input.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}
