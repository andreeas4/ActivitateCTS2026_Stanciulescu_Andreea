package ro.ase.ex_spital.ex_strategy.clase;

public class PlataCard implements IPlata{
    @Override
    public void plateste(double suma) {
        System.out.println("S-a platit "+ suma+" cu cardul");
    }
}
