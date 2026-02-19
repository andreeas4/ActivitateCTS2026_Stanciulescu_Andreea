package ro.ase.seminar1.animale;

public class Tigru extends Animal{

    private String rasa;

    public Tigru(String name, int age, String rasa) {
        super(name, age);
        this.rasa = rasa;
    }

    @Override
    public void eat(String s) {
        System.out.println(getName()+" a mancat "+s);
    }
    public String toString() {
        StringBuilder buffer=new StringBuilder();
        buffer.append(" Zebra: ");
        buffer.append(super.toString());
        buffer.append("Rasa = ");
        buffer.append(this.rasa);
        return buffer.toString();
    }

}
