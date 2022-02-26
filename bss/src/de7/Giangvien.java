/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Giangvien extends  Nhanvien{
  protected int magv;
    protected String diachi;
   protected  String gioitinh;
    protected String khoa;

    public Giangvien() {
    }

    public Giangvien(int magv, String diachi, String gioitinh, String khoa, String id, String hoten) {
        super(id, hoten);
        this.magv = magv;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public int getMagv() {
        return magv;
    }

    public void setMagv(int magv) {
        this.magv = magv;
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

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }
    public  void nhap(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap hoten");
        this.hoten = sc.nextLine();
        System.out.println("nhap id");
        this.id = sc.nextLine();
        System.out.println("nhap magv");
        this.magv = Integer.parseInt(sc.nextLine());
        System.out.println("nhap diachi");
        this.diachi = sc.nextLine();
        System.out.println("nhap gioitinh");
        this.gioitinh = sc.nextLine();
        System.out.println("nhap khoa");
        this.khoa = sc.nextLine();
    }
    public  void hienthi(){
        System.out.println("id" + id);
        System.out.println("hoten" + hoten);
        System.out.println("nagv" + magv);
        System.out.println("diachi" + getDiachi());
        System.out.println("gioitinh" + getGioitinh());
        System.out.println("khoa" + getKhoa());
    }
}
