/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diemtongbangthanhphanvaquatrinh;

/**
 *
 * @author Admin
 */
public class Person {
   protected  String Hoten;
   protected  String Ngaysinh;
   protected  String Diachi;
   protected  String Gioitinh;

    public Person() {
    }

    public Person(String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        this.Hoten = Hoten;
        this.Ngaysinh = Ngaysinh;
        this.Diachi = Diachi;
        this.Gioitinh = Gioitinh;
    }

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String Hoten) {
        this.Hoten = Hoten;
    }

    public String getNgaysinh() {
        return Ngaysinh;
    }

    public void setNgaysinh(String Ngaysinh) {
        this.Ngaysinh = Ngaysinh;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String Diachi) {
        this.Diachi = Diachi;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }
   public  void Hienthi(){
       System.out.println("Ho ten:" + this.getHoten());
       System.out.println("Ngay sinh:" + this.getNgaysinh());
       System.out.println(" Dia chi:" + this.getDiachi());
       System.out.println("GIoi tinh:" + this.getGioitinh());
   }
}
