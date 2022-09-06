//package Bai1;
//
//import java.util.Scanner;
//
//public class Main {
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
//
//        while (true){
//
//            System.out.println("Chương trình quản lý cán bộ");
//            System.out.println("1. Thêm mới cán bộ");
//            System.out.println("2. Tìm kiếm cán bộ theo họ tên");
//            System.out.println("3. Hiển thị thông tin về danh sách cán bộ");
//            System.out.println("4. Thoát khỏi chương trình");
//
//            String user = scanner.nextLine();
//            switch (user){
//                case "1" :{
//                    System.out.println("a. Thêm Công Nhân");
//                    System.out.println("b. Thêm Kỹ Sư");
//                    System.out.println("c. Thêm Nhân viên");
//                    String enter = scanner.nextLine();
//                    switch (enter){
//                        case "a" : {
//                            System.out.println("Nhập tên: ");
//                            String name = scanner.nextLine();
//                            System.out.println("Nhập tuổi: ");
//                            int age = scanner.nextInt();
//                            System.out.println("Nhập giới tính: ");
//                            String gender = scanner.nextLine();
//                            System.out.println("Nhập địa chỉ: ");
//                            String address = scanner.nextLine();
//                            System.out.println("Nhập bậc: ");
//                            int level = scanner.nextInt();
//
//                            CanBo congNhan = new CongNhan(name, age, gender, address, level);
//                            QuanLyCanBo.addCanBo(congNhan);
//
//                        }
//                    }
//                }
//
//            }
//        }
//    }
//}
