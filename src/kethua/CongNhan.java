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
public class CongNhan extends CanBo {
   Scanner input = new Scanner(System.in);
    private String bac;
    public CongNhan(){
    }
    public CongNhan(String bac,String hoten,String ngaysinh ,String gioitinh,String diachi){
        super(hoten, ngaysinh, gioitinh, diachi);
        this.bac = bac;}

    public String getBac() {
        return bac;
    }

    public void setBac(String bac) {
        this.bac = bac;
    }

    public CongNhan(String bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return "CongNhan{" + "bac=" + bac + '}';
    }
     public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap bac: ");
        bac = input.nextLine();
        System.out.print("\n");
    }
    
}
