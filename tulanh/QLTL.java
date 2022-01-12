/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tulanh;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLTL {

    Scanner sc = new Scanner(System.in);
    ArrayList<tuLanh> listsp = new ArrayList<>();

    public void add() {
        tuLanh tulanh = new tuLanh();
        tulanh.nhap();
        listsp.add(tulanh);
    }

    public void xuatTT() {
        for (matHang hang : listsp) {
            hang.hienThi();
        }
    }

    public void find(String hangSX) {
        for (tuLanh x : listsp) {
            if (x.getHangSX().equalsIgnoreCase(hangSX)) {
                x.hienThi();
                break;
            } else {
                System.out.println("ko co hang Sx nay");
                break;
            }
        }

    }

    public void Sumtulanh() {
        float sum = 0;
        for (tuLanh lanh : listsp) {
            sum += lanh.getDonGia();
        }
        System.out.println("tong so tien cac tu lanh la" + sum);
    }

    public void tulanhhon200() {
        for (tuLanh lanh : listsp) {
            if (lanh.getDungTich() > 200) {
                lanh.hienThi();
            }
        }
    }

    public void suathongtin(int mahang) {
        for (tuLanh lanh : listsp) {
            if (lanh.getMaHang() == mahang) {
                System.out.println("nhap Dung tich");
                lanh.setDungTich(Integer.parseInt(sc.nextLine()));
                System.out.println("nhap mau sac");
                lanh.setMauSac(sc.nextLine());
                System.out.println("Nhap Hang sX");
                lanh.setHangSX(sc.nextLine());
                System.out.println("Nhap so luong");
                lanh.setSoLuong(Integer.parseInt(sc.nextLine()));
                System.out.println("Nhap don gia");
                lanh.setDonGia(Float.parseFloat(sc.nextLine()));
                break;
            }
            else
            {
                System.out.println("ko co san pham nao giong ten ban nhap");
                break;
            }
        }
    }
}
