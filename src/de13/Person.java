/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de13;

/**
 *
 * @author Admin
 */
public class Person {
    protected String Hoten;
    protected  String ngaysinh;
    protected  String diachi;
    protected  String gioitinh;

    public Person() {
    }

    public Person(String Hoten, String ngaysinh, String diachi, String gioitinh) {
        this.Hoten = Hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
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

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
     public  void hienthi(){
         System.out.println("Ho ten:" + this.getHoten());
          System.out.println("ngay sinh:" + this.getNgaysinh());
          System.out.println("Diachi:" + this.getDiachi());
           System.out.println("Gioitinh:" + this.getGioitinh());
          
          
     }
}
