package ro.ase.ex_restaurant.ex_observer.observer;

public class NotificareNouMeniu implements INotificare{
    @Override
    public void notifica() {
        System.out.println("A aparut un nou meniu!");
    }

    @Override
    public String detalii() {
        return "A aparut un nou meniu!";
    }
}
