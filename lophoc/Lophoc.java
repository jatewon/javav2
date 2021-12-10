/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lophoc;

/**
 *
 * @author Admin
 */
public class Lophoc extends  Sinhvien{
     private String Sisolop;
     private  String Tenlop;
     
    public Lophoc(String Sisolop, String Tenlop, String Hoten, String Masv, float DiemHP, float DiemQT) {
        super(Hoten, Masv, DiemHP, DiemQT);
        this.Sisolop = Sisolop;
        this.Tenlop = Tenlop;
    }

    public String getSisolop() {
        return Sisolop;
    }

    public void setSisolop(String Sisolop) {
        this.Sisolop = Sisolop;
    }

    public String getTenlop() {
        return Tenlop;
    }

    public void setTenlop(String Tenlop) {
        this.Tenlop = Tenlop;
    }
     public  void Hienthi(){
         super.Hienthi();
         System.out.println("Si so lop:" + this.getSisolop());
         System.out.println("Ten lop:" + this.getTenlop());
     }
     
}
