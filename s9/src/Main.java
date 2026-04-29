import ro.ase.cts.compositeEx.clase.Departament;
import ro.ase.cts.compositeEx.clase.Sectia;
import ro.ase.cts.compositeEx.clase.Structura;
import ro.ase.cts.decoratorEx.NotaDePlata;
import ro.ase.cts.decoratorEx.NotaDePlataAbstracta;
import ro.ase.cts.decoratorEx.decorator.NotaDePlata1Mai;
import ro.ase.cts.decoratorEx.decorator.NotaDePlataDecorator;
import ro.ase.cts.decoratorEx.decorator.NotaDePlataNoulAn;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    NotaDePlataAbstracta n=new NotaDePlata(300.00F,"22/04/2023");
    n.printeaza();

    NotaDePlataDecorator notaDePlataDecorator=new NotaDePlataNoulAn(n);

    notaDePlataDecorator.printeaza();
    notaDePlataDecorator.printeazaFelicitare();

    NotaDePlataAbstracta n1=new NotaDePlata(300.00F,"01/05/2023");
    NotaDePlataDecorator nota1 = null;
    int a=1;
    if(a==1){
        nota1=new NotaDePlata1Mai(n1);
    }
    else if (a==2){
        nota1=new NotaDePlataNoulAn(n1);
    }

    nota1.printeazaFelicitare();

    //--------------

    Structura depSpital = new Departament("Spital");
    Structura depAdmin = new Departament("Administrativ");
    Structura sectieSecretariat = new Sectia("Secreatariat", 20);
    Structura sectieManagement = new Sectia("Management", 22);

    ((Departament) depSpital).adaugaStructura(depAdmin);
    ((Departament) depSpital).adaugaStructura(sectieSecretariat);
    ((Departament) depSpital).adaugaStructura(sectieManagement);

    depSpital.afiseazaDetalii();

    ((Departament) depSpital).stergeStructura(sectieManagement);
    ((Departament) depAdmin).adaugaStructura(sectieManagement);

    depSpital.afiseazaDetalii();

}
