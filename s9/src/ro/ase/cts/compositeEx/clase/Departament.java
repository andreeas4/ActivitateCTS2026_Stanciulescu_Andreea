package ro.ase.cts.compositeEx.clase;


import java.util.ArrayList;
import java.util.List;

public class Departament implements Structura {
        private String numeDepartament;
        private List<Structura> subStructuri;

        public Departament(String numeDepartament) {
            this.numeDepartament = numeDepartament;
            this.subStructuri = new ArrayList<>();
        }

        public void adaugaStructura(Structura structura) {
            subStructuri.add(structura);
        }

        public void stergeStructura(Structura structura) {
            subStructuri.remove(structura);
        }

        public Structura getStructura(int pozitie) {
            return subStructuri.get(pozitie);
        }

        @Override
        public void afiseazaDetalii() {
            System.out.println("Nume Departament: " + this.numeDepartament +"\n");
            for(Structura structura : subStructuri)
            {
                structura.afiseazaDetalii();
            }
        }
}
