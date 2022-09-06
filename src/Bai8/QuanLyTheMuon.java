package Bai8;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTheMuon {
    private List<TheMuon> theMuons;

    public QuanLyTheMuon(){
        this.theMuons = new ArrayList<>();
    }
    //Them the muon
    public void add(TheMuon theMuon){
        this.theMuons.add(theMuon);
    }
    //Hien thi thong tin the muon
    public void hienThiTheMuon(){
        this.theMuons.forEach(s -> System.out.println(theMuons.toString()));
    }
    //Xoa theo ma phieu muon
    public boolean xoaTheoIDThe(String idThe){
        TheMuon theMuon = this.theMuons.stream().filter(s -> s.getIdThe().equals(idThe)).findFirst().orElse(null);
        if (theMuon == null){
            return false;
        }else {
            this.theMuons.remove(theMuon);
        }
        return true;
    }
}
