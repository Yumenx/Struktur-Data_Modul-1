package Latihan_2;

public class Konsumsi<M, I> {
    private M m;
    private I i;

    public M getM(){
        return m;
    }

    public I getI(){
        return i;
    }

    public void setKonsumsi (M Makanan, I Minuman){
        this.m = Makanan;
        this.i = Minuman;
    }
}
