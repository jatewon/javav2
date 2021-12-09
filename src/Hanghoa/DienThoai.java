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
public class DienThoai extends  HangHoa{
    private  String NhaSX;
    private  String DungluongBN;
    private  String Mausac;

    public DienThoai() {
    }

    public DienThoai(String NhaSX, String DungluongBN, String Mausac, String MaHang, String Ten, Float GiaBan) {
        super(MaHang, Ten, GiaBan);
        this.NhaSX = NhaSX;
        this.DungluongBN = DungluongBN;
        this.Mausac = Mausac;
    }

    public String getNhaSX() {
        return NhaSX;
    }

    public void setNhaSX(String NhaSX) {
        this.NhaSX = NhaSX;
    }

    public String getDungluongBN() {
        return DungluongBN;
    }

    public void setDungluongBN(String DungluongBN) {
        this.DungluongBN = DungluongBN;
    }

    public String getMausac() {
        return Mausac;
    }

    public void setMausac(String Mausac) {
        this.Mausac = Mausac;
    }
    public void Hienthi(){
        super.Hienthi();
        System.out.println("Nha san xuat:" + this.getNhaSX());
        System.out.println("Dung luong:" + this.getDungluongBN());
        System.out.println("Mau sac:" + this.getMausac());
    }
}
