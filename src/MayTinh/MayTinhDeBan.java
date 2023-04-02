package MayTinh;

import java.util.Scanner;

public class MayTinhDeBan extends MayTinh{
    private String maSerial;
    private int slTon;

    public MayTinhDeBan () {}

    @Override
    public void xuatThongTin() {
        System.out.println("Ma Serial: "+ maSerial);
        System.out.println("Sluong ton: " + slTon);
        super.xuatThongTin();
    }

    @Override
    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Serial: "); maSerial = sc.nextLine();
        System.out.println("Nhap Sl ton: "); slTon = sc.nextInt();
        super.nhapThongTin();
    }

    @Override
    public double capNhatGiaTien() {
        return super.capNhatGiaTien();
    }
}
