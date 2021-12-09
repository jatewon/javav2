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
public class NhanVien extends CanBo {
     Scanner input = new Scanner(System.in);
      String congviec;
    public NhanVien(){
    }
    public NhanVien(String congviec,String hoten,String ngaysinh ,String gioitinh,String diachi) {
        super(hoten,ngaysinh,gioitinh,diachi);
        this.congviec = congviec;
    }

    public String getCongviec() {
        return congviec;
    }

    public void setCongviec(String congviec) {
        this.congviec = congviec;
    }

    @Override
    public String toString() {
        return super.toString()+"|" +congviec;
    }
 public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap congviec: ");
        congviec = input.nextLine();
        System.out.print("\n");
    }
    
  
      
}
