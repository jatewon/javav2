/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    protected  String Masv;
    protected  String Hoten;
    protected  String Ngaysinh;
    protected  String Gioitinh;
    protected float  DiemTB;

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Hoten, String Ngaysinh, String Gioitinh, float DiemTB) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.DiemTB = DiemTB;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "Masv=" + Masv + ", Hoten=" + Hoten + ", Ngaysinh=" + Ngaysinh + ", Gioitinh=" + Gioitinh + ", DiemTB=" + DiemTB + '}';
    }
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ma sv:");
        this.Masv = sc.nextLine();
         System.out.println("Ho ten:");
        this.Hoten = sc.nextLine();
         System.out.println("Ngay sinh:");
        this.Ngaysinh = sc.nextLine();
         System.out.println("Gioi tinh:");
        this.Gioitinh = sc.nextLine();
         System.out.println("Diem TB:");
        this.DiemTB = Float.parseFloat(sc.nextLine());
    }
}
