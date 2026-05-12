package Observer.clase;

public interface ISpital {
    void trimiteMesaj(String mesaj);
    void aboneaza(IPacient p);
    void dezaboneaza(IPacient p);

}
