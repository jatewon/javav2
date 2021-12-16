/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien extends  Person implements  Serializable{
    private  String Phongban;
    private  float Hesoluong;
    private  float Thamnien;
    private  float Luongcoban;
    public NhanVien() {
    }

    public NhanVien(String Phongban, float Hesoluong, float Thamnien, float Luongcoban, String Hoten, String Ngaysinh, String Diachi, String gioitinh) {
        super(Hoten, Ngaysinh, Diachi, gioitinh);
        this.Phongban = Phongban;
        this.Hesoluong = Hesoluong;
        this.Thamnien = Thamnien;
        this.Luongcoban = Luongcoban;
    }

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public float getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(float  Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public float getThamnien() {
        return Thamnien;
    }

    public void setThamnien(float Thamnien) {
        this.Thamnien = Thamnien;
    }

    public float getLuongcoban() {
        return Luongcoban;
    }

    public void setLuongcoban(float Luongcoban) {
        this.Luongcoban = Luongcoban;
    }
    
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.println("Phong ban:");
        this.setPhongban(sc.nextLine());
         System.out.println("he so luong:");
        this.Hesoluong =  Float.parseFloat(sc.nextLine());
        System.out.println("Tham nien:");
        this.Thamnien =  Float.parseFloat(sc.nextLine());
        System.out.println("Luong co ban:");
        this.Luongcoban =  Float.parseFloat(sc.nextLine());
    }
    public void Hienthi(){
       super.Hienthi();
        System.out.println("Phong ban:"+ this.getPhongban());
        System.out.println("He so lhuong:" + this.getHesoluong());
        System.out.println("Tham nien:" + this.getThamnien());
        System.out.println("Luong co ban:" + this.getLuongcoban());
    }
    public  float luongthuclinh(){
       return this.getLuongcoban()*this.getHesoluong() *(1 + this.getThamnien()/100);
    }

    
    public String toString() {
        return  "Nhan vien"+super.toString() + "Phongban=" + Phongban + ", Hesoluong=" + Hesoluong + ", Thamnien=" + Thamnien + ", Luongcoban=" + Luongcoban +(float)luongthuclinh();
    }
    
}
