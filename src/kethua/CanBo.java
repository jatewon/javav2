/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class CanBo extends Object{
    Scanner input = new Scanner(System.in);
    private String hoten;
    private String ngaysinh;
    private String  gioitinh;
    private String diachi;
    
    public CanBo(){
    }
    public CanBo(String hoten,String ngaysinh ,String gioitinh,String diachi)
    {
        this.hoten = hoten;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.ngaysinh = ngaysinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "hoten=" + hoten + ", ngaysinh=" + ngaysinh + ", gioitinh=" + gioitinh + ", diachi=" + diachi + '}';
    }
    public void Nhap()
    {
        System.out.print("ho ten: ");
        hoten = input.nextLine();
        System.out.print("ngay sinh: ");
        ngaysinh = input.nextLine();
        System.out.print("gioi tinh: ");
        gioitinh = input.nextLine();
        System.out.print("dia chi: ");
        diachi = input.nextLine();
    }
    public void Xuat()
    {
        System.out.println(this);
    }
    
}
