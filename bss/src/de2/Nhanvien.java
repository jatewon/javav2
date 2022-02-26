/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Nhanvien extends  Person{
    String phongban;
    int hesoluong;
    int thamnien;
    float luongcoban;
    float luongthuclinh;
    public Nhanvien(String phongban, int hesoluong, int thamnien, float luongcoban,String hoten, String ngaysinh, String diachi, String gioitinh) {
        super(hoten, ngaysinh, diachi, gioitinh);
        this.phongban = phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
        this.luongthuclinh =(float)(this.luongcoban *hesoluong*(1 + thamnien/100));
    }

    public String getPhongban() {
        return phongban;
    }

    public void setPhongban(String phongban) {
        this.phongban = phongban;
    }

    public int getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(int hesoluong) {
        this.hesoluong = hesoluong;
    }

    public int getThamnien() {
        return thamnien;
    }

    public void setThamnien(int thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    @Override
    public String toString() {
        return "Nhanvien{" + "phongban=" + phongban + ", hesoluong=" + hesoluong + ", thamnien=" + thamnien + ", luongcoban=" + luongcoban + ", luongthuclinh=" + luongthuclinh + '}';
    }
    public  void nhap(){
         Scanner sc = new Scanner(System.in);
         super.nhap();
        System.out.println("phong ban");
        this.phongban = sc.nextLine();
         System.out.println("he soluong");
        this.hesoluong = Integer.parseInt(sc.nextLine());
         System.out.println("tham nien");
        this.thamnien= Integer.parseInt(sc.nextLine());
         System.out.println("luongcb");
        this.luongcoban= Float.parseFloat(sc.nextLine());
    }
    
    
    
}
