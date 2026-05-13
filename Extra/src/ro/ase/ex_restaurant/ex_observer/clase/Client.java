package ro.ase.ex_restaurant.ex_observer.clase;

public class Client implements IObserver {
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void seNotifica(String mesaj)  {
            System.out.println("Domnule/Doamna " + nume + ", ati primit un mesaj: " + mesaj);
        }
    }
