package ro.ase.cts.decoratorEx.decorator;

import ro.ase.cts.decoratorEx.NotaDePlataAbstracta;

public class NotaDePlata1Mai extends NotaDePlataDecorator{
    public NotaDePlata1Mai(NotaDePlataAbstracta nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani de 1 mai!!");
    }

}
