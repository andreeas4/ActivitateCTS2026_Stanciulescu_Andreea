package ro.ase.cts.readers;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Elev;
import ro.ase.cts.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilsReader extends AplicantiReader {
    @Override
    public List<Aplicant> readAplicanti(String file) {
        Scanner input2 = null;
        try {
            input2 = new Scanner(new File(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input2.hasNext()) {
            Elev e=new Elev();
            super.citesteAplicanti(input2,e);
            int clasa = input2.nextInt();
            e.setClasa(clasa);
            String tutore = input2.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        input2.close();
        return elevi;
    }
}
