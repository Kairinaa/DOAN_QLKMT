package QuanLy;
import MayTinh.MayTinh;
import MayTinh.MayTinhXachTay;
import MayTinh.MayTinhDeBan;
import PhieuQuanLy.PhieuNhapXuat;
import java.util.Scanner;

public class QuanLy {
    public static void menu() {
        System.out.println("-----------------------------------------");
        System.out.println("----1. Nhap xuat thong tin may tinh de ban----");
        System.out.println("----2. Nhap xuat thong tin may tinh xach tay--");
        System.out.println("----3. Nhap xuat thong tin phieu nhap xuat----");
        System.out.println("----------------Vui long chon-----------------");
        Scanner s = new Scanner(System.in);
        MayTinh a;

        int chon = s.nextInt();
        switch(chon) {
            case 1:
                System.out.println("Vui long nhap thong tin May Tinh De ban");
                a = new MayTinhDeBan();
                a.nhapThongTin();
                a.xuatThongTin();
                break;
            case 2:
                System.out.println("Vui long nhap thong tin May Tinh Xach Tay");
                a = new MayTinhXachTay();
                a.nhapThongTin();
                a.xuatThongTin();
                break;
            case 3:
                System.out.println("Vui long dien thong tin phieu nhap xuat");
                PhieuNhapXuat phieu = new PhieuNhapXuat();
                phieu.nhapThongTin();
                phieu.xuatThongTin();
                break;
            case 4:
                System.out.println("Cap nhat gia tien May tinh xach tay sau thue");
                a = new MayTinhXachTay();
                a.capNhatGiaTien();
                break;
            case 5:
                System.out.println("Cap nhat gia tien May tinh de ban sau thue");
                a = new MayTinhDeBan();
                a.capNhatGiaTien();
            default:
                System.exit(0);
        }
        System.out.println("Chuong trinh exit!!!");
    }

    public static void main(String[] args) {
        System.out.println("Chuong trinh quan ly kho may tinh");
        menu();
    }
}
