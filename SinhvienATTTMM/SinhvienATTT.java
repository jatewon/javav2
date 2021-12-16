/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhvienATTTMM;

/**
 *
 * @author Admin
 */
public class SinhvienATTT extends Sinhvien{
    protected  String donvi;
    protected  float  luong;

    public SinhvienATTT() {
    }

    public SinhvienATTT(String donvi, float luong, String masv, String hoten, String ngaysinh, float diemtb, String gioitinh) {
        super(masv, hoten, ngaysinh, diemtb, gioitinh);
        this.donvi = donvi;
        this.luong = luong;
    }

    public String getDonvi() {
        return donvi;
    }

    public void setDonvi(String donvi) {
        this.donvi = donvi;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }
     public  void Hienthi(){
         super.Hienthi();
         System.out.println("don vi:" + this.getDonvi());
         System.out.println("luong :" + this.getLuong());
     }
}
