/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hanghoa;

/**
 *
 * @author Admin
 */
public class HangHoa {
    protected  String MaHang;
    protected  String Ten;
    protected  Float GiaBan;

    public HangHoa() {
    }

    public HangHoa(String MaHang, String Ten, Float GiaBan) {
        this.MaHang = MaHang;
        this.Ten = Ten;
        this.GiaBan = GiaBan;
    }

    public String getMaHang() {
        return MaHang;
    }

    public void setMaHang(String MaHang) {
        this.MaHang = MaHang;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public Float getGiaBan() {
        return GiaBan;
    }

    public void setGiaBan(Float GiaBan) {
        this.GiaBan = GiaBan;
    }
    
    public  void Hienthi(){
        System.out.println("Ma Hang:" + this.getMaHang());
        System.out.println("Ten:" + this.getTen());
        System.out.println("Gia Ban:" + this.getGiaBan());
    }
}
