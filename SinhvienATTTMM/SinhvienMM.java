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
public class SinhvienMM extends  Sinhvien{
    protected  String hocphi;

    public SinhvienMM() {
    }

    public SinhvienMM(String hocphi, String masv, String hoten, String ngaysinh, float diemtb, String gioitinh) {
        super(masv, hoten, ngaysinh, diemtb, gioitinh);
        this.hocphi = hocphi;
    }

    public String getHocphi() {
        return hocphi;
    }

    public void setHocphi(String hocphi) {
        this.hocphi = hocphi;
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("Hoc phi:" + this.getHocphi());
    }
}
