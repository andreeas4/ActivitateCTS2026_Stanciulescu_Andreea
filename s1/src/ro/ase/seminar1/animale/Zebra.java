package ro.ase.seminar1.animale;

public class Zebra extends Animal {
    private int nrDungi;

    public Zebra(String name, int age, int nrDungi) {
        super(name, age);
        this.nrDungi = nrDungi;
    }


    @Override
    public void eat(String s) {
        System.out.println( getName()+" a mancat "+s);
    }

    @Override

    public String toString() {
            StringBuilder buffer=new StringBuilder();
            buffer.append(" Zebra: ");
            buffer.append(super.toString());
            buffer.append("nrDungi= ");
            buffer.append(this.nrDungi);
            return buffer.toString();
        }

}
