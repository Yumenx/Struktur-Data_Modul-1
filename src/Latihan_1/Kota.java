package Latihan_1;

public class Kota<E> {
    private E element;

    public Kota(E Kota){
        element = Kota;
    }

    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");

        System.out.println("Jumlah Kota Di Jawa Timur Adalah : " + jumlahKota.getElement() + " Kota");
        System.out.println("Salah Satu Kota Di Jawa Timur Adalah : Kota " +namaKota.getElement());
    }
}
