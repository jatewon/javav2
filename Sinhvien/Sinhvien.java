/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public abstract class Sinhvien implements Serializable{
    protected  String Masv;
    protected  String Hoten;
    protected  String Ngaysinh;
    protected  String Gioitinh;
    protected  float Diemtb;

    public Sinhvien() {
    }

    public Sinhvien(String Masv, String Hoten, String Ngaysinh, String Gioitinh, float Diemtb) {
        this.Masv = Masv;
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Gioitinh = Gioitinh;
        this.Diemtb = Diemtb;
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

    public float getDiemtb() {
        return Diemtb;
    }

    public void setDiemtb(float Diemtb) {
        this.Diemtb = Diemtb;
    }
    public  void Hienthi(){
        System.out.println("Ma sv:"+ this.Masv);
        System.out.println("Ho ten:"+ this.Hoten);
        System.out.println("ngay sinh:"+ this.Ngaysinh);
        System.out.println("gioi tinh:"+ this.Gioitinh);
        System.out.println("diemtb:"+ this.Diemtb);
    }
    public  abstract  void Nhap();

    @Override
    public String toString() {
        return "masv" + this.getMasv() + "Ho ten" + this.getHoten();
    }
    
}
