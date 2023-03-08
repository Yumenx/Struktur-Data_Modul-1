package Latihan_2;

import javax.lang.model.element.Name;

public class Hidangan {
    protected String namaHidangan;

    public String getNamaHidangan(){
        return namaHidangan;
    }

    public void setNamaHidangan(String namaHidangan){
        this.namaHidangan = namaHidangan;
    }

    public String diSantap(){
        return "Makanan DiHidangkan";
    }
}
