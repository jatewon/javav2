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
public class SinhvienHTTT extends Sinhvien implements  Serializable{
    private  float  Hocphi;

    public SinhvienHTTT() {
    }

    public SinhvienHTTT(float Hocphi, String Masv, String Hoten, String Ngaysinh, String Gioitinh, float Diemtb) {
        super(Masv, Hoten, Ngaysinh, Gioitinh, Diemtb);
        this.Hocphi = Hocphi;
    }

    public float getHocphi() {
        return Hocphi;
    }

    public void setHocphi(float Hocphi) {
        this.Hocphi = Hocphi;
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("Hoc phi:" + this.getHocphi());
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
        System.out.println("Hoc phi");
        this.Hocphi = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()  + "Hocphi=" + Hocphi ;
    }
    
}
