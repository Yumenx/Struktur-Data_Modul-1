package Modul_1_Demo;

public class Segitiga <T, V>{

    private T Alas;
    private V Tinggi;


    public T getAlas() {
        return Alas;
    }

    public void setAlas(T alas) {
        Alas = alas;
    }

    public V getTinggi() {
        return Tinggi;
    }

    public void setTinggi(V tinggi) {
        Tinggi = tinggi;
    }

    public int getResultAsInt(){
         return 1 * (int) getAlas() * (int) getTinggi() / 2;
    }

    public double getResultAsDouble(){
        return 0.5 * (Double) getAlas() * (Double) getTinggi() ;
    }
}
