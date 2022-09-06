package Bai12;

public class Oto extends PTGT{
    private int soChoNgoi;
    private String dongCo;
    public Oto(String id, String hangSX, int year, double gia, String mau, int soChoNgoi, String dongCo) {
        super(id, hangSX, year, gia, mau);
        this.soChoNgoi = soChoNgoi;
        this.dongCo = dongCo;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getDongCo() {
        return dongCo;
    }

    public void setDongCo(String dongCo) {
        this.dongCo = dongCo;
    }

    @Override
    public String toString() {
        return "Oto{" +
                "soChoNgoi=" + soChoNgoi +
                ", dongCo='" + dongCo + '\'' +
                ", id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", year=" + year +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                "} " + super.toString();
    }
}
