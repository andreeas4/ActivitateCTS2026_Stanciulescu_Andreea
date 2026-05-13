package ro.ase.ex_restaurant.ex_command.command;

import ro.ase.ex_restaurant.ex_command.clase.Masa;

public class ComandaOcupa implements ICommand{
    private Masa m;

    public ComandaOcupa(Masa m) {
        this.m = m;
    }

    @Override
    public void executa() {
        m.ocupa();
    }
}
