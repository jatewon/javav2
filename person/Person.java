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
public class Person {
    protected  String Hoten;
    protected String Ngaysinh;
    protected  String Diachi;
    protected  String gioitinh;

    public Person() {
    }

    public Person(String Hoten, String Ngaysinh, String Diachi, String gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }
    public  void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Hoten:");
        this.Hoten = sc.nextLine();
        System.out.print("Nhap ngaysinh:");
        this.Ngaysinh = sc.nextLine();
        System.out.print("Nhap Gioi tinh:");
        this.gioitinh = sc.nextLine();
        System.out.print("Nhap Diachi:");
        this.Diachi = sc.nextLine();
    }
    public void Hienthi(){
        System.out.println("Hoten" + this.getHoten());
        System.out.println("Ngay sinh"+ this.getNgaysinh());
        System.out.println("Gioi tinh" + this.getGioitinh());
        System.out.println("Diachi "+ this.getDiachi());
    }

    @Override
    public String toString() {
        return  "Hoten=" + Hoten + ", Ngaysinh=" + Ngaysinh + ", Diachi=" + Diachi + ", gioitinh=" + gioitinh ;
    }
}
