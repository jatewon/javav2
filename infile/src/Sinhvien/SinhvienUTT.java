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
public class SinhvienUTT extends Sinhvien{
    private  String Donvi;
    private  float Luong;

    public SinhvienUTT() {
    }

    public SinhvienUTT(String Donvi, float Luong, String Masv, String Hoten, String Ngaysinh, String Gioitinh, float DiemTB) {
        super(Masv, Hoten, Ngaysinh, Gioitinh, DiemTB);
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

    @Override
    public String toString() {
        return super.toString()+
         this.getDonvi()+this.getLuong();
    }
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
         System.out.println("Don Vi:");
        this.Donvi = sc.nextLine();
         System.out.println("Luong:");
        this.Luong = Float.parseFloat(sc.nextLine());
    }
    
}
