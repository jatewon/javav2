/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tulanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class matHang {
    String tenHang;
   int maHang;
    String nuocSX;

    public matHang() {
    }

    public matHang(String tenHang, int maHang, String nuocSX) {
        this.tenHang = tenHang;
        this.maHang = maHang;
        this.nuocSX = nuocSX;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getNuocSX() {
        return nuocSX;
    }

    public void setNuocSX(String nuocSX) {
        this.nuocSX = nuocSX;
    }
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten Hang");
        this.tenHang = sc.nextLine();
        System.out.println("Nhap ma Hang");
        this.maHang = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap nuoc SX");
        this.nuocSX = sc.nextLine();
    }
    public void hienThi(){
        System.out.println("Thong tin tu lanh ");
        System.out.println("Ten hang" + this.getTenHang());
        System.out.println("ma Hang"+ this.getMaHang());
        System.out.println("nuoc SX" + this.getNuocSX());
    }
}
