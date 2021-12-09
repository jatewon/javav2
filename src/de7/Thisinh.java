/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

/**
 *
 * @author Admin
 */
public abstract class Thisinh {
    protected  String Hoten;
    protected  String ngaysinh;
    protected  String diachi;

    public Thisinh() {
    }

    public Thisinh(String Hoten, String ngaysinh, String diachi) {
        this.Hoten = Hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
    public abstract void Nhap();
    public  abstract  void Hienthi();
    public abstract  boolean  Check();
}
