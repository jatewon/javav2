/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de4;

/**
 *
 * @author Admin
 */
public class Student extends  Person{
    private String MaSV;
    private  String Email;
    private  float  DiemTK;

    public Student() {
    }
    
    public Student(String MaSV, String Email, float DiemTK, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.MaSV = MaSV;
        this.Email = Email;
        this.DiemTK = DiemTK;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String MaSV) {
        this.MaSV = MaSV;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public float getDiemTK() {
        return DiemTK;
    }

    public void setDiemTK(float DiemTK) {
        this.DiemTK = DiemTK;
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Ma SV:" + this.getMaSV());
        System.out.println("Email:" + this.getEmail());
        System.out.println("DiemTK:" + this.getDiemTK());
    }
}
