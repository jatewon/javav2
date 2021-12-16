/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhvienATTTMM;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    protected  String masv;
    protected  String hoten;
    protected  String ngaysinh;
    protected  float diemtb;
    protected  String gioitinh;

    public Sinhvien() {
    }

    public Sinhvien(String masv, String hoten, String ngaysinh, float diemtb, String gioitinh) {
        this.masv = masv;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diemtb = diemtb;
        this.gioitinh = gioitinh;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public float getDiemtb() {
        return diemtb;
    }

    public void setDiemtb(float diemtb) {
        this.diemtb = diemtb;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    

    public  void Hienthi(){
        System.out.println("Ma sinh vien:" + this.getMasv());
        System.out.println("ho ten :" + this.getHoten());
        System.out.println("ngay sinh:" + this.getNgaysinh());
        System.out.println("gioi tinh:" + this.getGioitinh());
        System.out.println("Diem TB:" + this.getDiemtb());
    }
}
