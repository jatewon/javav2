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
public class Person {
    private  String hoten;
    private  String ngaysinh;
    private  String diachi;
    private  String gioitinh;

    public Person(String hoten, String ngaysinh, String diachi, String gioitinh) {
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
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
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("hoten");
        this.hoten = sc.nextLine();
         System.out.println("ngay sinh");
        this.ngaysinh = sc.nextLine();
         System.out.println("diachi");
        this.diachi= sc.nextLine();
         System.out.println("gioitinh");
        this.gioitinh= sc.nextLine();
    }

    @Override
    public String toString() {
        return "Person{" + "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", diachi=" + diachi + ", gioitinh=" + gioitinh + '}';
    }
    
}
