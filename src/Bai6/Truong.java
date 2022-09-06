package Bai6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Truong {

    private List<HocSinh> hocSinhs;
    public static Scanner scanner = new Scanner(System.in);

    public Truong() {
        this.hocSinhs = new ArrayList<>();
    }
    //Add hoc sinh vao list
    public void add(HocSinh hocSinh){
        this.hocSinhs.add(hocSinh);
    }
    //hien thi danh sach hoc sinh 20 tuoi
    public List<HocSinh> hienThiHS20Age(){
        return this.hocSinhs.stream().filter(s -> s.getAge() == 20).collect(Collectors.toList());
    }

    //Dem so luong hoc sinh 23 tuoi va que o da nang
    public long soLuongHocSinh23AndDN(){
        return this.hocSinhs.stream().filter(s -> s.getAge() == 23 && s.getHomeTown().equals("DN")).count();
    }


    public static void addHocSinh(){
        Truong truong = new Truong();
        while (true){
            System.out.println("Chuong trinh quan ly hoc sinh");
            System.out.println("1. Them moi hoc sinh");
            System.out.println("2. Hien thi hoc sinh 20 tuoi");
            System.out.println("3. Hien thi hoc sinh 23 tuoi va que o Da Nang");
            System.out.println("4. Thoat");

            String choise = scanner.nextLine();
            switch (choise){
                case "1": {
                    System.out.println("Moi ban nhap ten hoc sinh :");
                    String name = scanner.nextLine();
                    System.out.println("Moi ban nhap tuoi: ");
                    int age = scanner.nextInt(); scanner.nextLine();
                    System.out.println("Moi ban nhap que quan: ");
                    String homwTown = scanner.nextLine();
                    System.out.println("Moi ban nhap lop: ");
                    int lop = scanner.nextInt();
                    scanner.nextLine();

                    HocSinh hocSinh = new HocSinh(name, age, homwTown, lop);
                    truong.add(hocSinh);
                    break;
                }
                case "2": {
                    System.out.println(truong.hienThiHS20Age());
                    break;
                }
                case "3": {
                    System.out.println(truong.soLuongHocSinh23AndDN());
                    break;
                }
                case "4": {
                    break;
                }
                default:
                    System.out.println("Khong hop le");
                    break;
            }
        }
    }
}
