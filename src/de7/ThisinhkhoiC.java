/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThisinhkhoiC extends Thisinh{
    private  float Van ;
    private  float  Su;
    private  float Dia;

    public ThisinhkhoiC() {
    }

    public ThisinhkhoiC(float Van, float Su, float Dia, String Hoten, String ngaysinh, String diachi) {
        super(Hoten, ngaysinh, diachi);
        this.Van = Van;
        this.Su = Su;
        this.Dia = Dia;
    }

    public float getVan() {
        return Van;
    }

    public void setVan(float Van) {
        this.Van = Van;
    }

    public float getSu() {
        return Su;
    }

    public void setSu(float Su) {
        this.Su = Su;
    }

    public float getDia() {
        return Dia;
    }

    public void setDia(float Dia) {
        this.Dia = Dia;
    }
    
   
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoten:");
        this.Hoten = sc.nextLine();
        System.out.println("Ngay sinh:");
        this.ngaysinh = sc.nextLine();
        System.out.println("Dia chi:");
        this.diachi = sc.nextLine();
         System.out.println("Diem van:");
        this.Van = Float.parseFloat(sc.nextLine());
         System.out.println("Diem su:");
        this.Su = Float.parseFloat(sc.nextLine());
         System.out.println("Diem Dia:");
        this.Dia= Float.parseFloat(sc.nextLine());
    }

    @Override
    public void Hienthi() {
         System.out.println("Hoten" + this.getHoten());
        System.out.println("Ngaysinh" + this.getNgaysinh());
        System.out.println("Dia chi:" + this.getDiachi());
        System.out.println("van" + this.getVan());
        System.out.println("su" + this.getSu());
        System.out.println("Dia" + this.getDia());
    }

    @Override
    public boolean Check() {
        if(this.Van + this.Su + this.Dia >= 20){
            return  true;
        }
       return  false;
    }
    
}
