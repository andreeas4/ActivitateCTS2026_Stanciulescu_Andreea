package ro.ase.ex_restaurant.ex_observer.clase;

import ro.ase.ex_restaurant.ex_observer.observer.INotificare;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<IObserver> clientiAbonati=new ArrayList<>();


    public void aboneazaClient(IObserver c){
        clientiAbonati.add(c);
    }

    public void dezaboneazaClient(IObserver c){
        clientiAbonati.remove(c);
    }
    public void trimiteNotificare(INotificare notificare){
        for(IObserver c :clientiAbonati)
        {
            c.seNotifica(notificare.detalii());
        }
    }
}
