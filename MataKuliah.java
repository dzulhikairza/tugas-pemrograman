package tugas3;

public class MataKuliah {
    private String kodeMk;
    private double nilaiAngka;
    private String namaMk;

    public String getKodeMk() {
        return kodeMk;
    }

    public void setKodeMk(String kodeMk) {
        this.kodeMk = kodeMk;
    }

    public double getNilaiAngka() {
        return nilaiAngka;
    }

    public void setNilaiAngka(double nilaiAngka) {
        this.nilaiAngka = nilaiAngka;
    }

    public String getNamaMk() {
        return namaMk;
    }

    public void setNamaMk(String namaMk) {
        this.namaMk = namaMk;
    }

    public String setKHS() {
        if(this.nilaiAngka>=80){
            return "A";
        } else if(this.nilaiAngka>=60 && this.nilaiAngka<=79){
            return "B";
        } else if(this.nilaiAngka>=50 && this.nilaiAngka<=59){
            return "C";
        }else if(this.nilaiAngka>=40 && this.nilaiAngka<=49){
            return "B";
        } else {
            return "D";
        }
    }
}
