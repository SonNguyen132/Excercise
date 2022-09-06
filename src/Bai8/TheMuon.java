package Bai8;

public class TheMuon {
    private SinhVien sinhVien;
    private String idThe;
    private int ngayMuon;
    private int ngayTra;
    private String idSach;

    public TheMuon(SinhVien sinhVien, String idThe, int ngayMuon, int ngayTra, String idSach) {
        this.sinhVien = sinhVien;
        this.idThe = idThe;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.idSach = idSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public String getIdThe() {
        return idThe;
    }

    public void setIdThe(String idThe) {
        this.idThe = idThe;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getIdSach() {
        return idSach;
    }

    public void setIdSach(String idSach) {
        this.idSach = idSach;
    }

    @Override
    public String toString() {
        return "TheMuon{" +
                "sinhVien=" + sinhVien +
                ", idThe='" + idThe + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                ", idSach='" + idSach + '\'' +
                '}';
    }
}
