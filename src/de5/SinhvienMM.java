/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de5;

/**
 *
 * @author Admin
 */
public class SinhvienMM extends  Sinhvien{
    private  String Donvi;
    private  String Luong;

    public SinhvienMM() {
    }
    
    public SinhvienMM(String Donvi, String Luong, String MaSV, String Hoten, String Ngaysinh, String gioitinh, float DiemTB) {
        super(MaSV, Hoten, Ngaysinh, gioitinh, DiemTB);
        this.Donvi = Donvi;
        this.Luong = Luong;
    }

    public String getDonvi() {
        return Donvi;
    }

    public void setDonvi(String Donvi) {
        this.Donvi = Donvi;
    }

    public String getLuong() {
        return Luong;
    }

    public void setLuong(String Luong) {
        this.Luong = Luong;
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Don vi"+ this.Donvi);
        System.out.println("Luong:"+ this.Luong);
    }
}
