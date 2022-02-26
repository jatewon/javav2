/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de3;

/**
 *
 * @author Admin
 */
public class Nhanvien extends Person{
    private  String Phongban;
    private  float  hesoluong;
    private  float thamnien;
    private  float luongcb;

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

    public float getLuongcb() {
        return luongcb;
    }

    public void setLuongcb(float luongcb) {
        this.luongcb = luongcb;
    }

    public Nhanvien(String Phongban, float hesoluong, int thamnien, float luongcb, String Hoten, String ngaysinh, String diachi, String gioitinh) {
        super(Hoten, ngaysinh, diachi, gioitinh);
        this.Phongban = Phongban;
        this.hesoluong = hesoluong;
        this.thamnien = thamnien;
        this.luongcb = luongcb;
    }
    @Override
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Phong ban:" + this.Phongban);
        System.out.println("He so luong:" + this.hesoluong);
        System.out.println("Tham nien:"+ this.thamnien);
        System.out.println("luong cb:" + this.luongcb);
    }
    public  float luongthuctinh(){
        return  this.getLuongcb()* this.getHesoluong() * (1 + this.getThamnien()/100);
    }
}
