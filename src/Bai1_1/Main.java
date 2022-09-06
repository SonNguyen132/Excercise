package Bai1_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        QLCB qlcb = new QLCB();
        while (true){
            System.out.println("Chương trình quản lý cán bộ");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
            System.out.println("3. Hiển thị thông tin về danh sách cán bộ");
            System.out.println("4. Thoát khỏi chương trình");

            String type = sc.nextLine();
            switch (type){
                case "1" : {
                    qlcb.nhapDanhSach(sc);
                    System.out.println("ban da nhap xong, moi b chon tiep lua chon");
                    System.out.println("===========================");
                }
                break;
                case "2" : {
                    System.out.print("Nhap vao ho ten can tim kiem: ");
                    String name = sc.nextLine();
                    qlcb.timKiemCanBo(name);
                    System.out.println("===========================");
                }
                break;
                case "3" : {
                    System.out.println("Danh sach can bo la:");
                    qlcb.hienThiCanBo();
                    System.out.println("===========================");
                }
                break;
                case "4" : {
                    System.exit(0);
                }
                break;
            }
        }
    }
}
