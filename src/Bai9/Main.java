package Bai9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        BienLai bienLai;
        Scanner scanner = new Scanner(System.in);
        ArrayList<BienLai> arrBienLai = new ArrayList<>();

        System.out.print("Nhập số hộ gia đình: ");
        n = scanner.nextInt();
        //Nhap thong tin bien lai
        for (int i = 0; i < n; i++) {
            bienLai = new BienLai();
            System.out.println("Nhập thông tin biên lai của hộ gia đình thứ " + (i + 1) + ": ");
            bienLai.nhapBienLai();
            arrBienLai.add(bienLai);
        }
        //Hien thi thong tin bien lai
        System.out.println("Thông tin biên lai của các hộ gia đình: ");
        for (int i = 0; i < arrBienLai.size(); i++) {
            System.out.println("Thông tin biên lai hộ gia đình thứ " + (i + 1) + ": ");
            arrBienLai.get(i).hienThiBienLai();
        }
    }
}
