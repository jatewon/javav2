/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de2;

/**
 *
 * @author Admin
 */
public class NhanVien extends Person{
    private  String Phongban;
    private  float  Hesoluong;
    private  int Thamnien;
    private  float Luongcb;

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public float getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(float Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public int getThamnien() {
        return Thamnien;
    }

    public void setThamnien(int Thamnien) {
        this.Thamnien = Thamnien;
    }

    public float getLuongcb() {
        return Luongcb;
    }

    public void setLuongcb(float Luongcb) {
        this.Luongcb = Luongcb;
    }

    public NhanVien(String Phongban, float Hesoluong, int Thamnien, float Luongcb, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Phongban = Phongban;
        this.Hesoluong = Hesoluong;
        this.Thamnien = Thamnien;
        this.Luongcb = Luongcb;
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("Phong ban:" + this.getPhongban());
        System.out.println("He so luong:" + this.getHesoluong());
        System.out.println("Tham nien:" + this.getThamnien());
        System.out.println("Luong cb:" + this.getLuongcb());
    }
    public  float luongthuclinh(){
        return this.getLuongcb() *this.getHesoluong()*(1+ this.getThamnien()/100);
    }
}
