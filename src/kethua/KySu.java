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
public class KySu extends CanBo{
   Scanner input = new Scanner(System.in);
    String nganhDaoTao;
    KySu(){
    }

    public KySu(String nganhDaoTao, String hoten, String ngaysinh, String gioitinh, String diachi) {
        super(hoten, ngaysinh, gioitinh, diachi);
        this.nganhDaoTao = nganhDaoTao;
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() +"|" +nganhDaoTao;
    }
    
    public void Nhap()
    {
        super.Nhap();
        System.out.print("Nhap nganhDaoTao: ");
        nganhDaoTao = input.nextLine();
        System.out.print("\n");
    }
    
}
