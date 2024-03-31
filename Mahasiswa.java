package tugas3;

import java.util.ArrayList;

public class Mahasiswa {
    private String nama;
    private String nim;
    private ArrayList<MataKuliah> matkuls = new ArrayList();

    public ArrayList<MataKuliah> getMatkuls(){
        return matkuls;
    }

    public void setMatkuls(ArrayList<MataKuliah> matkuls) {
        this.matkuls = matkuls;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

}
