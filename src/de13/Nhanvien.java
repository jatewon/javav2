/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de13;

import java.security.Permission;

/**
 *
 * @author Admin
 */
public class Nhanvien extends Person {

    private String Phongban;
    private float hesoluong;
    private float thamnien;
    private float luongcoban;

    public Nhanvien(String Phongban, float hesoluong, float thamnien, float luongcoban, String Hoten, String ngaysinh, String diachi, String gioitinh) {
        super(Hoten, ngaysinh, diachi, gioitinh);
        this.Phongban = Phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcoban = luongcoban;
    }

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public float getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(float hesoluong) {
        this.hesoluong = hesoluong;
    }

    public float getThamnien() {
        return thamnien;
    }

    public void setThamnien(float thamnien) {
        this.thamnien = thamnien;
    }

    public float getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(float luongcoban) {
        this.luongcoban = luongcoban;
    }

    public void hienthi() {
        super.hienthi();
        System.out.println("Phong ban:" + this.getPhongban());
        System.out.println("He so luong:" + this.getHesoluong());
        System.out.println("Tham nien:" + this.getThamnien());
        System.out.println("Luong co ban:" + this.getLuongcoban());
    }
    public  float luongthuclinh(){
        return this.getLuongcoban()* this.getHesoluong() * (1 + this.getThamnien()/100);
    }
}
