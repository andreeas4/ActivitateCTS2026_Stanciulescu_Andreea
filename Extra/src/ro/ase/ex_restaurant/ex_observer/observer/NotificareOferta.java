package ro.ase.ex_restaurant.ex_observer.observer;

public class NotificareOferta implements INotificare{
    @Override
    public void notifica() {
        System.out.println("A aparut oferta de pret!!");
    }

    @Override
    public String detalii() {
        return "A aparut oferta de pret!!";
    }
}
