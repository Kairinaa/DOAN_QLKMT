package PhieuQuanLy;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PhieuNhapXuat {
    private int ngay, thang , nam;
    private String donViNhap, diaChiKho;

    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Don vi nhap: "); donViNhap = sc.nextLine();
        System.out.print("Nhap Dia chi kho: "); diaChiKho = sc.nextLine();
        System.out.print("Nhap ngay: "); ngay = sc.nextInt();
        System.out.print("Nhap thang: "); thang = sc.nextInt();
        System.out.print("Nhap nam: "); nam = sc.nextInt();
    }

    public void xuatThongTin() {
        System.out.println("Don vi nhap: "+ donViNhap);
        System.out.println("Dia chi kho: "+ diaChiKho);
        System.out.println("Ngay/Thang/Nam: " + ngay+"/"+thang+"/"+nam);
    }
}
