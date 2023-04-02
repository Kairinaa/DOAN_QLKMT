package MayTinh;

import java.util.Scanner;

public class MayTinh {
    private int gia;
    private int namSX;
    private String hangSX, quocGia, HangCPU;

    public MayTinh() {}

    public MayTinh(int gia, int namSX, String hangSX, String quocGia, String hangCPU) {
        this.gia = gia;
        this.namSX = namSX;
        this.hangSX = hangSX;
        this.quocGia = quocGia;
        HangCPU = hangCPU;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getNamSX() {
        return namSX;
    }

    public void setNamSX(int namSX) {
        this.namSX = namSX;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getHangCPU() {
        return HangCPU;
    }

    public void setHangCPU(String hangCPU) {
        HangCPU = hangCPU;
    }


    public void nhapThongTin() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Hang SX: "); hangSX = sc.nextLine();
        System.out.print("Nhap Quoc gia: "); quocGia = sc.nextLine();
        System.out.print("Nhap Hang CPU: "); HangCPU = sc.nextLine();
        System.out.print("Nhap Nam SX: "); namSX = sc.nextInt();
        System.out.print("Nhap Gia tien: "); gia = sc.nextInt();
        System.out.println("");
    }
    public void xuatThongTin() {
        System.out.print("Hang SX: "+ hangSX);
        System.out.print("\tQuoc gia: "+ quocGia);
        System.out.print("\tHang CPU: "+ HangCPU);
        System.out.print("\tNam SX: "+ namSX);
        System.out.print("\tGia tien: "+ gia);
        //System.out.print("\tGia tien sau thue: " + (int)capNhatGiaTien());
        System.out.println("");
    }

    public double capNhatGiaTien() {
        return gia* 0.1 + gia;
    }
}
