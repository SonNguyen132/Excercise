package Bai7;

public class CBGV {
    private double luongCung;
    private double luongThuong;
    private double luongPhat;
    private double luongThucLinh;
    private Nguoi nguoi;

    public CBGV(Double luongCung, Double luongThuong, Double luongPhat, Nguoi nguoi) {
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
        this.luongThucLinh = luongThucLinh;
        this.nguoi = nguoi;
    }

    public Double getLuongCung() {
        return luongCung;
    }

    public void setLuongCung(Double luongCung) {
        this.luongCung = luongCung;
    }

    public Double getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(Double luongThuong) {
        this.luongThuong = luongThuong;
    }

    public Double getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(Double luongPhat) {
        this.luongPhat = luongPhat;
    }

    public Double getLuongThucLinh() {
        return luongThucLinh;
    }

    public void setLuongThucLinh(Double luongThucLinh) {
        this.luongThucLinh = luongThucLinh;
    }

    public Nguoi getNguoi() {
        return nguoi;
    }

    public void setNguoi(Nguoi nguoi) {
        this.nguoi = nguoi;
    }
}
