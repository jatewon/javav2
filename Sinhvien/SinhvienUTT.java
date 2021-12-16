/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhvienUTT extends  Sinhvien implements  Serializable{

    private  String Donvi;
    private  float Luong;

    public SinhvienUTT() {
    }

    public SinhvienUTT(String Donvi, float Luong, String Masv, String Hoten, String Ngaysinh, String Gioitinh, float Diemtb) {
        super(Masv, Hoten, Ngaysinh, Gioitinh, Diemtb);
        this.Donvi = Donvi;
        this.Luong = Luong;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String Donvi) {
        this.Donvi = Donvi;
    }

    public float getLuong() {
        return Luong;
    }

    public void setLuong(float Luong) {
        this.Luong = Luong;
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("Don vi "+ this.Donvi);
        System.out.println("Luong:" + this.Luong);
    }
    public void Nhap() {
      Scanner sc = new Scanner(System.in);
        System.out.println("Ma SV:");
        this.Masv = sc.nextLine();
        System.out.println("Ho ten:");
        this.Hoten = sc.nextLine();
        System.out.println("Ngay sinh:");
        this.Ngaysinh = sc.nextLine();
        System.out.println("Gioi tinh:");
        this.Gioitinh = sc.nextLine();
        System.out.println("Diem TB:");
        this.Diemtb = Float.parseFloat(sc.nextLine());
        System.out.println("Luong :");
        this.Luong = Float.parseFloat(sc.nextLine());
        System.out.println("Don vi:");
        this.Donvi = sc.nextLine();
        
    }

    @Override
    public String toString() {
        return super.toString() + "Donvi=" + Donvi + ", Luong=" + Luong + '}';
    }
    
}
