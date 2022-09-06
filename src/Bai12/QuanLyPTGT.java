package Bai12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QuanLyPTGT {
    private List<PTGT> ptgts;
    public QuanLyPTGT(){
        this.ptgts = new ArrayList<>();
    }
    public void add(PTGT ptgt){
        this.ptgts.add(ptgt);
    }
    //Ham hien thi
    public void hienThi(){
        this.ptgts.forEach(s -> System.out.println(s.toString()));
    }
    public boolean deleteByID(String id){
        PTGT ptgt = this.ptgts.stream().filter(s -> s.getId().equals(id)).findFirst().orElse(null);
        if (ptgt == null){
            return false;
        }else {
            return this.ptgts.remove(ptgt);
        }
    }
    public List<PTGT> timTheoHangSX(String hangSX){
        //return this.ptgts.stream().filter(s -> s.getHangSX().contains(hangSX)).collect(Collectors.toList());
        List ptgt = new ArrayList<>();
        for (PTGT ptgt1 : this.ptgts){
            if (ptgt1.getHangSX().contains(hangSX)){
                ptgt.add(ptgt1);
            }
        }
        return ptgt;
    }
    public List<PTGT> timKiemTheoMau(String mau){
        return this.ptgts.stream().filter(s -> s.getMau().contains(mau)).collect(Collectors.toList());
    }

}
