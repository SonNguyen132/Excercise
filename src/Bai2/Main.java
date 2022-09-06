package Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerDocument  managerDocument = new ManagerDocument();
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Chao mung ban den voi Thu vien quan ly tai lieu");
            System.out.println("1. Them moi tai lieu");
            System.out.println("2. Xoa tai lieu");
            System.out.println("3. Hien thi thong tin tai lieu");
            System.out.println("4. Tim kiem tai lieu");
            System.out.println("5. Thoat khoi chuong trinh");

            String line = scanner.nextLine();
            switch (line){
                case "1" : {
                    System.out.println("a. Them moi Sach");
                    System.out.println("b. Them moi Bao");
                    System.out.println("c. Them moi Tap chi");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a" : {
                            System.out.println("Nhap id:");
                            String id = scanner.nextLine();
                            System.out.println("Nhap Ten nha xuat ban:");
                            String namePublisher = scanner.nextLine();
                            System.out.println("Nhap So ban phat hanh: ");
                            int numberRelease = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ten tac gia:");
                            String nameAuthor = scanner.nextLine();
                            System.out.println("Nhap so ban phat hanh: ");
                            int numberOfPage = scanner.nextInt();

                            Document book = new Book(id, namePublisher,numberRelease, nameAuthor, numberOfPage);
                            managerDocument.addDocument(book);
                            scanner.nextLine();
                            break;
                        }
                        case "b" : {
                            System.out.println("Nhap id:");
                            String id = scanner.nextLine();
                            System.out.println("Nhap Ten nha xuat ban:");
                            String namePublisher = scanner.nextLine();
                            System.out.println("Nhap So ban phat hanh: ");
                            int numberRelease = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("Nhap ngay xuat ban:");
                            int issueDay = scanner.nextInt();

                            Document newspaper = new Newspaper(id, namePublisher, numberRelease, issueDay);
                            managerDocument.addDocument(newspaper);
                            scanner.nextLine();
                            break;
                        }
                        case "c" : {
                            System.out.println("Nhap id:");
                            String id = scanner.nextLine();
                            System.out.println("Nhap Ten nha xuat ban:");
                            String namePublisher = scanner.nextLine();
                            System.out.println("Nhap So ban phat hanh: ");
                            int numberRelease = scanner.nextInt();
                            scanner.nextLine();
                            System.out.print("Nhap so luong xuat ban:");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Nhap thang xuat ban:");
                            int issueMonth = scanner.nextInt();

                            Document journal = new Journal(id, namePublisher, numberRelease, issueNumber, issueMonth);
                            managerDocument.addDocument(journal);
                            scanner.nextLine();
                            break;
                        }

                        default:
                            System.out.println("Moi ban nhap lai: ");
                            break;
                    }
                    break;
                }
                case "2" : {
                    System.out.println("Nhap id ban muon xoa:");
                    String id = scanner.nextLine();
                    managerDocument.deleteDocument(id);
                    System.out.println("Ban da xoa thanh cong");
                    break;
                }
                case "3" : {
                    System.out.println("Danh sach tai lieu la:");
                    managerDocument.showInfor();
                    break;
                }
                case "4" : {
                    System.out.println("Ban muon tim kiem: ");
                    System.out.print("a. Sach" + "\t b. Bao" + "\t c. Tap chi");
                    String type = scanner.nextLine();
                    switch (type){
                        case "a" : {
                            managerDocument.findBook();
                            break;
                        }
                        case "b": {
                            managerDocument.findNewspaper();
                            break;
                        }
                        case "c": {
                            managerDocument.findJournal();
                            break;
                        }
                        default:
                            System.out.println("Moi ban nhap lai ");
                            break;
                    }
                    break;
                }
                case "5": {
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Moi ban nhap lai: ");
                    break;

            }
        }
    }
}
