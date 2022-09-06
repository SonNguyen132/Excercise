package Bai7;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCBGV {
    private List<CBGV> cbgvs;

    public QuanLyCBGV() {
        this.cbgvs = new ArrayList<>();
    }
    //Them giao vien
    public void add(CBGV cbgv){
        this.cbgvs.add(cbgv);
    }
    //Xoa giao vien theo id
    public boolean xoaID(String id){
        CBGV cbgv = this.cbgvs.stream().filter(s -> s.getNguoi().getId().equals(id)).findFirst().orElse(null);
        if(cbgv == null){
            return false;
        }else {
            this.cbgvs.remove(cbgv);
            return true;
        }
    }
    //Ham tinh luong cho giao vien
    public double tinhLuong(String id){
        CBGV cbgv = this.cbgvs.stream().filter(s -> s.getNguoi().getId().equals(id)).findFirst().orElse(null);
        if(cbgv == null){
            return 0;
        }else {
            return cbgv.getLuongCung() + cbgv.getLuongThuong() - cbgv.getLuongPhat();
        }
    }

}
