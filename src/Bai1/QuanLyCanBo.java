//package Bai1;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//
//public class QuanLyCanBo {
//    private List<CanBo> canbo;
//
//    public QuanLyCanBo() {
//        this.canbo = new ArrayList<>();
//    }
//
//    public void addCanBo(CanBo canbo){
//        this.canbo.add(canbo);
//    }
//
//    public List<CanBo> timKiemTheoTen(String name){
//        return this.canbo.stream().filter(s -> s.getName().contains(name)).collect(Collectors.toList());
//        List officersByNames = new ArrayList();
//                for(CanBo canBo : this.canbo) {
//                if (canBo.getName().contains(name))
//                officersByNames.add(canBo);
//                }
//                return officersByNames;
//                }
//    }
//
//    public void showCanBo(){
//        this.canbo.forEach(s -> System.out.println(s.toString()));
//    }
//}
