package Bai11;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class SoPhuc {
    private double phanThuc, phanAo;

    public SoPhuc() {
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

//    public double getPhanThuc() {
//        return phanThuc;
//    }
//
//    public void setPhanThuc(double phanThuc) {
//        this.phanThuc = phanThuc;
//    }
//
//    public double getPhanAo() {
//        return phanAo;
//    }
//
//    public void setPhanAo(double phanAo) {
//        this.phanAo = phanAo;
//    }

    //Ham hien thi
    public void hienThi(SoPhuc soPhuc){
        System.out.println(soPhuc.phanThuc + "+" + soPhuc.phanAo + "* i");
    }

    //Nhap so phuc
    public SoPhuc nhapSP() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Phan thuc: ");
        double phanThuc = scanner.nextDouble();
        System.out.println("Phan ao: ");
        double phanAo = scanner.nextDouble();
        SoPhuc soPhuc = new SoPhuc(phanThuc, phanAo);
        return soPhuc;
    }

    //Ham Cong
    public SoPhuc cong(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc soPhuc = new SoPhuc();
        soPhuc.phanThuc = soPhuc1.phanThuc + soPhuc2.phanThuc;
        soPhuc.phanAo = soPhuc1.phanAo + soPhuc2.phanAo;
        return soPhuc;
    }
    //Ham Tinh tich

    public SoPhuc tich(SoPhuc soPhuc1, SoPhuc soPhuc2){
        SoPhuc soPhuc = new SoPhuc();
        soPhuc.phanThuc = soPhuc1.phanThuc * soPhuc2.phanThuc + soPhuc1.phanAo * soPhuc2.phanAo;
        soPhuc.phanAo = soPhuc1.phanThuc * soPhuc2.phanAo + soPhuc1.phanAo * soPhuc2.phanThuc;
        return soPhuc;
    }
}
