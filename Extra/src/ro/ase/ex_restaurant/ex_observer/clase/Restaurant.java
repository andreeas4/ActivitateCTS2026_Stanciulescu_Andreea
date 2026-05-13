package ro.ase.ex_restaurant.ex_observer.clase;

import ro.ase.ex_restaurant.ex_observer.observer.INotificare;
import ro.ase.ex_restaurant.ex_observer.observer.NotificareNouMeniu;
import ro.ase.ex_restaurant.ex_observer.observer.NotificareOferta;

public class Restaurant extends Subiect{

    @Override
    public void trimiteNotificare(INotificare notificare) {
        super.trimiteNotificare(notificare);
    }
}
