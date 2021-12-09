/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de1;

/**
 *
 * @author Admin
 */
public class Student extends  Person{
    private  String Masv;
    private  String Email;
    private  float DiemTK;

    public Student(String Masv, String Email, float DiemTK, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Masv = Masv;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Float getDiemTK() {
        return DiemTK;
    }

    public void setDiemTK(Float DiemTK) {
        this.DiemTK = DiemTK;
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Email:" + this.Email);
        System.out.println("DiemTK:" + this.DiemTK);
        System.out.println("MaSV:" + this.Masv);
    }
}
