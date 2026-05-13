package ro.ase.ex_restaurant.ex_command.command;

import ro.ase.ex_restaurant.ex_command.clase.Masa;

public class ComandaRezerva implements ICommand {
    private Masa m;

    public ComandaRezerva(Masa m) {
        this.m = m;
    }


    @Override
    public void executa() {
        m.rezerva();
    }
}
