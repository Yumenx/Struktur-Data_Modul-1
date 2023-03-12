package Modul_1_Demo;

import java.util.Scanner;

public class Drivers {
    static Scanner s = new Scanner(System.in);

    static Segitiga<Integer, Integer> HasilInt = new Segitiga<>();
    static Segitiga<Double, Double> HasilDouble = new Segitiga<>();

    public static void main(String[] args) {
        System.out.printf("Pilih: \n 1.Hasil Integer \n 2.Hasil Double \n");
        System.out.print("Input: ");
        int a = s.nextInt();
        if (a == 1){
            System.out.println("Masukkan Luas dan Tinggi: ");
            HasilInt.setAlas(s.nextInt());
            HasilInt.setTinggi(s.nextInt());
            System.out.println("Hasilnya Adalah: " +HasilInt.getResultAsInt());
        }else {
            System.out.println("Masukkan Luas dan Tinggi: ");
            HasilDouble.setAlas(s.nextDouble());
            HasilDouble.setTinggi(s.nextDouble());
            System.out.println("Hasilnya Adalah: " +HasilDouble.getResultAsDouble());
        }
    }
}
