/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    protected  String MaSV;
    protected  String Hoten;
    protected  String Ngaysinh;
    protected  String gioitinh;
    protected  float DiemTB;

    public Sinhvien() {
    }

    public Sinhvien(String MaSV, String Hoten, String Ngaysinh, String gioitinh, float DiemTB) {
        this.MaSV = MaSV;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.gioitinh = gioitinh;
        this.DiemTB = DiemTB;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
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
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public float getDiemTB() {
        return DiemTB;
    }

    public void setDiemTB(float DiemTB) {
        this.DiemTB = DiemTB;
    }
    public  void Hienthi(){
        System.out.println("Ma SV:"+ this.MaSV);
        System.out.println("Ho ten:" + this.Hoten);
        System.out.println("ngay sinh:" + this.Ngaysinh);
        System.out.println("Gioi tinh:" + this.gioitinh);
        System.out.println("DiemTB:" + this.DiemTB);
    }
}
