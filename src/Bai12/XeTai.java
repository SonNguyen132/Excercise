package Bai12;

public class XeTai extends PTGT{
    private String trongTai;

    public XeTai(String id, String hangSX, int year, double gia, String mau, String trongTai) {
        super(id, hangSX, year, gia, mau);
        this.trongTai = trongTai;
    }

    public String getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai='" + trongTai + '\'' +
                ", id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", year=" + year +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                "} " + super.toString();
    }
}
