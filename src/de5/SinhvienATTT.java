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
public class SinhvienATTT extends  Sinhvien{
    private  Float Hocphi;

    public SinhvienATTT() {
    }

    public SinhvienATTT(Float Hocphi, String MaSV, String Hoten, String Ngaysinh, String gioitinh, float DiemTB) {
        super(MaSV, Hoten, Ngaysinh, gioitinh, DiemTB);
        this.Hocphi = Hocphi;
    }

    public Float getHocphi() {
        return Hocphi;
    }

    public void setHocphi(Float Hocphi) {
        this.Hocphi = Hocphi;
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("hoc phi"+ this.Hocphi);
    }
}
