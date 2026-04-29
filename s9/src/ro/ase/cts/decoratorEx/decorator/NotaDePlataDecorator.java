package ro.ase.cts.decoratorEx.decorator;

import ro.ase.cts.decoratorEx.NotaDePlataAbstracta;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstracta {

    private NotaDePlataAbstracta nota;

    public NotaDePlataDecorator(NotaDePlataAbstracta nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
    public abstract void printeazaFelicitare();
}
