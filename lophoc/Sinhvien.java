/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophoc;

/**
 *
 * @author Admin
 */
public class Sinhvien {
    protected  String Hoten;
    protected  String Masv;
    protected  float DiemHP;
    protected  float  DiemQT;

    public Sinhvien() {
    }

    public Sinhvien(String Hoten, String Masv, float DiemHP, float DiemQT) {
        this.Hoten = Hoten;
        this.Masv = Masv;
        this.DiemHP = DiemHP;
        this.DiemQT = DiemQT;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getMasv() {
        return Masv;
    }

    public void setMasv(String Masv) {
        this.Masv = Masv;
    }

    public float getDiemHP() {
        return DiemHP;
    }

    public void setDiemHP(float DiemHP) {
        this.DiemHP = DiemHP;
    }

    public float getDiemQT() {
        return DiemQT;
    }

    public void setDiemQT(float DiemQT) {
        this.DiemQT = DiemQT;
    }
    public  void DiemTB(){
        float DiemTB = (float) (DiemHP* 0.7 + DiemQT *0.3);
        System.out.println("Diem TB:"+ DiemTB);
    }
    public  void Hienthi(){
        System.out.println("Hoten "+ this.getHoten());
        System.out.println("Ma SV:" + this.getMasv());
        System.out.println("Diem QT:" + this.getDiemQT());
        System.out.println("Diem HP"+ this.getDiemHP());
        DiemTB();
    }
}
