package Bai_1_Bien;

public class SinhVien {
    public static String name = "Dang Khoi";
    public  String classess = "Jumppe A2";

    public static void infoStudent(){
        int age = 7;
        System.out.println("Tuoi: " + age);
    }

    public static void main(String[] args) {
        ThongTin thongTin = new ThongTin();
        SinhVien sinhVien = new SinhVien();
        System.out.println("Ten: " + name);
        System.out.println("Lop: " + sinhVien.classess);
        infoStudent();
        System.out.println("Truong: " + thongTin.School);
    }
}
