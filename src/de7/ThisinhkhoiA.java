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
public class ThisinhkhoiA  extends  Thisinh{
    private  float Toan;
    private  float Ly;
    private  float Hoa;

    public ThisinhkhoiA() {
    }

    public ThisinhkhoiA(float Toan, float Ly, float Hoa, String Hoten, String ngaysinh, String diachi) {
        super(Hoten, ngaysinh, diachi);
        this.Toan = Toan;
        this.Ly = Ly;
        this.Hoa = Hoa;
    }

    public float getToan() {
        return Toan;
    }

    public void setToan(float Toan) {
        this.Toan = Toan;
    }

    public float getLy() {
        return Ly;
    }

    public void setLy(float Ly) {
        this.Ly = Ly;
    }

    public float getHoa() {
        return Hoa;
    }

    public void setHoa(float Hoa) {
        this.Hoa = Hoa;
    }
    
    
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hoten:");
        this.Hoten = sc.nextLine();
        System.out.println("Ngay sinh:");
        this.ngaysinh = sc.nextLine();
        System.out.println("Dia chi:");
        this.diachi = sc.nextLine();
        System.out.println("Diem toan:");
        this.Toan = Float.parseFloat(sc.nextLine());
        System.out.println("Diem Ly:");
        this.Ly = Float.parseFloat(sc.nextLine());
        System.out.println("Diem Hoa:");
        this.Hoa = Float.parseFloat(sc.nextLine());
    }

   
    public void Hienthi() {
        System.out.println("Hoten" + this.getHoten());
        System.out.println("Ngaysinh" + this.getNgaysinh());
        System.out.println("Dia chi:" + this.getDiachi());
        System.out.println("Toan" + this.getToan());
        System.out.println("Ly" + this.getLy());
        System.out.println("HOa" + this.getHoa());
    }

    @Override
    public boolean Check() {
       if(this.Toan + this.Hoa + this.Ly >= 20){
           return  true;
       }
       return  false;
    }
    
}
