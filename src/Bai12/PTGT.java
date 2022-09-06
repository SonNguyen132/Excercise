package Bai12;

public class PTGT {
    protected String id;
    protected String hangSX;
    protected int year;
    protected double gia;
    protected String mau;

    public PTGT(String id, String hangSX, int year, double gia, String mau) {
        this.id = id;
        this.hangSX = hangSX;
        this.year = year;
        this.gia = gia;
        this.mau = mau;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    @Override
    public String toString() {
        return "PTGT{" +
                "id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", year=" + year +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                '}';
    }
}
