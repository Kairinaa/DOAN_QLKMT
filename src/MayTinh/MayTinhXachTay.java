package MayTinh;

import java.util.Scanner;

public class MayTinhXachTay extends MayTinh {
    private String maSerial;
    private int slTon;
    private double trongLuong;

    public  MayTinhXachTay() {}
    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Serial: "); maSerial = sc.nextLine();
        System.out.print("Nhap Sl ton: "); slTon = sc.nextInt();
        System.out.println("Nhap Trong luong: "); trongLuong = sc.nextDouble();
        super.nhapThongTin();
    }

    @Override
    public void xuatThongTin() {
        super.xuatThongTin();
        System.out.print("\tMa Serial: "+ maSerial);
        System.out.print("\tSluong ton: " + slTon);
        System.out.println("\tTrong luong: "+ trongLuong + "kg");
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}