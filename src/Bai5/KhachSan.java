package Bai5;

import java.util.ArrayList;
import java.util.List;

public class KhachSan {
    private List<Nguoi> nguois;

    public KhachSan(){
        nguois = new ArrayList<>();
    }
    //Them nguoi vao danh sach
    public void add(Nguoi nguoi){
        nguois.add(nguoi);
    }
    //Xoa theo cmnd
    public void delete(String cmnd){
        Nguoi nguoi = this.nguois.stream().filter(s -> s.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if(nguoi == null){
            System.out.println("Khong co so cmnd nao thoa man");
        }else {
            System.out.println(nguois.remove(nguoi));
        }
    }
    public int tinhTien(String cmnd) {
        Nguoi nguoi = this.nguois.stream().filter(s -> s.getCmnd().equals(cmnd)).findFirst().orElse(null);
        if (nguoi == null) {
            System.out.println("Khong có cmnd nào thoả mãn");
        }
        return nguoi.getPhong().getGia()* nguoi.getSoNguoi();
    }
    //Hien thi thong tin
    public void hienThi(){
        nguois.forEach(s -> System.out.println(s.toString()));
    }

}
