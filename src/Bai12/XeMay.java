package Bai12;

public class XeMay extends PTGT{
    private String congSuat;

    public XeMay(String id, String hangSX, int year, double gia, String mau, String congSuat) {
        super(id, hangSX, year, gia, mau);
        this.congSuat = congSuat;
    }

    public String getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(String congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat='" + congSuat + '\'' +
                ", id='" + id + '\'' +
                ", hangSX='" + hangSX + '\'' +
                ", year=" + year +
                ", gia=" + gia +
                ", mau='" + mau + '\'' +
                "} " + super.toString();
    }
}
