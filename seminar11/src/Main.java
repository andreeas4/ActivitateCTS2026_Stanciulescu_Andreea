import Observer.clase.IPacient;
import Observer.clase.ISpital;
import Observer.clase.PacientAbonat;
import Observer.clase.Spital;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        IPacient p=new PacientAbonat("Marian Pop",34);
        IPacient p1=new PacientAbonat("Margareta Vasile",67);
        IPacient p2=new PacientAbonat("Rica Vasile",69);

        ISpital spital=new Spital("Pantelimon");
        spital.aboneaza(p);
        spital.aboneaza(p1);
        spital.aboneaza(p2);
        ((Spital) spital).notificaVirus();
        ((Spital) spital).notificaEpidemie();


    }
}