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
public class tuLanh extends matHang{
    int dungTich;
    String mauSac;
    String hangSX;
    int soLuong;
    float donGia;

    public tuLanh() {
    }

    public tuLanh(int dungTich, String mauSac, String hangSX, int soLuong, float donGia, String tenHang, int maHang, String nuocSX) {
        super(tenHang, maHang, nuocSX);
        this.dungTich = dungTich;
        this.mauSac = mauSac;
        this.hangSX = hangSX;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }
    public  void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("nhap Dung tich");
        this.dungTich = Integer.parseInt(sc.nextLine());
        System.out.println("nhap mau sac");
        this.mauSac = sc.nextLine();
        System.out.println("Nhap Hang sX");
        this.hangSX = sc.nextLine();
        System.out.println("Nhap so luong");
        this.soLuong = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap don gia");
        this.donGia = Float.parseFloat(sc.nextLine());
    }
    public  void hienThi(){
        super.hienThi();
        System.out.println("dung tich"+ this.getDungTich());
        System.out.println("mau sac" + this.getMauSac());
        System.out.println("hang SX" + this.getHangSX());
        System.out.println("so luong" + this.getSoLuong());
        System.out.println("don Gia" + this.getDonGia());
        
    }
    
}
