package Bai10;

import java.io.DataInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String str;
        System.out.print("Nhap van ban: ");
        //dung datainputStream de doc xau
        DataInputStream stream = new DataInputStream(System.in);
        str = stream.readLine();//doc
        VanBan vanBan = new VanBan(str);
        System.out.println("So tu trong van ban la: " + demVB(vanBan));
        System.out.println("So ky tu A trong van ban la: " + demKTA(vanBan));
        System.out.println("Van ban chuan hoa la: " + ChuanHoa(vanBan));
    }
    //Phuong thuc dem so tu van ban
    public static int demVB(VanBan vanBan){
        int count = 0;
        String st = ChuanHoa(vanBan);
        if(st.length() != 0){
            count = 1;
        }else count = 0;
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == ' ' && st.charAt(i+1) != ' '){
                count ++;
            }
        }
        return count;
    }
    //Phuong thuc chuan hoa van ban
    private static String ChuanHoa(VanBan vanBan) {
//        StringBuffer stringBuffer = new StringBuffer(vanBan.str);
//
        String str = vanBan.str;
        str = str.trim().replaceAll("\\s+", " ");;
        String[] temp = str.split(" ");
        str = "";
        for (int i = 0; i < temp.length; i++) {
            str += String.valueOf(temp[i].charAt(0)) + temp[i].substring(1);
            if (i < temp.length - 1) // ? ^-^
                str += " ";
        }
        return str;
//        while (stringBuffer.charAt(0) == ' '){
//            stringBuffer = stringBuffer.delete(0,1);
//        }
//        //Trong khi ky tu cuoi bang ' ' thi xoa khoang trang
//        while (stringBuffer.charAt(stringBuffer.length() - 1) == ' '){
//            stringBuffer = stringBuffer.delete(stringBuffer.length() - 1, stringBuffer.length());
//        }
//        //Xoa ky tu khoang trang giua cac tu
//        for (int i = 0; i < stringBuffer.length(); i++) {
//            while (stringBuffer.charAt(i) == ' ' && stringBuffer.charAt(i + 1) != ' '){
//                stringBuffer = stringBuffer.delete(i, i + 1);
//            }
//        }
//        return (stringBuffer.toString());
    }
    //Phuong thuc dem so luong ky tu A khong phan biet in hoa, in thuong
    public static int demKTA(VanBan vanBan){
        int count = 0;
        for (int i = 0; i < vanBan.str.length(); i++) {
            if (vanBan.str.charAt(i) == 'A' || vanBan.str.charAt(i) == 'a'){
                count ++;
            }
        }
        return count;
    }
}
