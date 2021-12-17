/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SinhvienHTTT extends  Sinhvien{
    private  float Hocphi;
    ArrayList<Sinhvien> listSV = new ArrayList<>();

    public SinhvienHTTT() {
    }

    public SinhvienHTTT(float Hocphi, String Masv, String Hoten, String Ngaysinh, String Gioitinh, float DiemTB) {
        super(Masv, Hoten, Ngaysinh, Gioitinh, DiemTB);
        this.Hocphi = Hocphi;
    }

    public float getHocphi() {
        return Hocphi;
    }

    public void setHocphi(float Hocphi) {
        this.Hocphi = Hocphi;
    }

    @Override
    public String toString() {
        return super.toString() + "Hocphi=" + Hocphi ;
    }
    
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
         System.out.println("HOcphi:");
        this.Hocphi = Float.parseFloat(sc.nextLine());
        
    }
}
