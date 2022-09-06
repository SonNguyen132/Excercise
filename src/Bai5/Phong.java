package Bai5;

public class Phong {
    protected String loaiPhong;
    protected int gia;

    public Phong(String loaiPhong, int gia) {
        this.loaiPhong = loaiPhong;
        this.gia = gia;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
