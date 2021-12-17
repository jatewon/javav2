/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author Admin
 */
public class Nhanvien extends  Person{
    private  String Phongban;
    private  float Hesoluong;
    private  float  Thamnien;
    private  float Luongcoban;

    public Nhanvien() {
    }

    public Nhanvien(String Phongban, float Hesoluong, float Thamnien, float Luongcoban, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Phongban = Phongban;
        this.Hesoluong = Hesoluong;
        this.Thamnien = Thamnien;
        this.Luongcoban = Luongcoban;
    }

    public String getPhongban() {
        return Phongban;
    }

    public void setPhongban(String Phongban) {
        this.Phongban = Phongban;
    }

    public float getHesoluong() {
        return Hesoluong;
    }

    public void setHesoluong(float Hesoluong) {
        this.Hesoluong = Hesoluong;
    }

    public float getThamnien() {
        return Thamnien;
    }

    public void setThamnien(float Thamnien) {
        this.Thamnien = Thamnien;
    }

    public float getLuongcoban() {
        return Luongcoban;
    }

    public void setLuongcoban(float Luongcoban) {
        this.Luongcoban = Luongcoban;
    }

    @Override
    public String toString() {
        return super.toString() + "Phongban=" + Phongban + ", Hesoluong=" + Hesoluong + ", Thamnien=" + Thamnien + ", Luongcoban=" + Luongcoban + '}';
    }
    
}
