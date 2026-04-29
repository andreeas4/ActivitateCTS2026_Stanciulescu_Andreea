package ro.ase.cts.decoratorEx.decorator;

import ro.ase.cts.decoratorEx.NotaDePlataAbstracta;

public class NotaDePlataNoulAn extends  NotaDePlataDecorator{
    public NotaDePlataNoulAn(NotaDePlataAbstracta nota) {
        super(nota);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani cu sanatate!!");
    }
}
