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
public class Sinhvien extends  Person{
    private  String Chuyennganh;
    private  Float diemQT;
    private  Float DiemHocphan;

    public Sinhvien() {
    }

    public Sinhvien(String Chuyennganh, Float diemQT, Float DiemHocphan, String Hoten, String Ngaysinh, String Diachi, String Gioitinh) {
        super(Hoten, Ngaysinh, Diachi, Gioitinh);
        this.Chuyennganh = Chuyennganh;
        this.diemQT = diemQT;
        this.DiemHocphan = DiemHocphan;
    }

    public String getChuyennganh() {
        return Chuyennganh;
    }

    public void setChuyennganh(String Chuyennganh) {
        this.Chuyennganh = Chuyennganh;
    }

    public Float getDiemQT() {
        return diemQT;
    }

    public void setDiemQT(Float diemQT) {
        this.diemQT = diemQT;
    }

    public Float getDiemHocphan() {
        return DiemHocphan;
    }

    public void setDiemHocphan(Float DiemHocphan) {
        this.DiemHocphan = DiemHocphan;
    }
    public void Diemtongket(){
        float DiemTK = (float) (diemQT*0.3 + DiemHocphan*0.7);
        if (DiemTK <4) {
            System.out.println("F");
        }else if(DiemTK< 5 && DiemTK > 4){
            System.out.println("D");
        }else if(DiemTK< 6 && DiemTK > 5){
            System.out.println("C");
        }else if(DiemTK< 6 && DiemTK > 8.5){
            System.out.println("B");
        }else{
            System.out.println("A");
        }
       
    }
    public  void Hienthi(){
        super.Hienthi();
        System.out.println("Chuyen nganh:" + this.getChuyennganh());
        System.out.println("Diem QT:" + this.getDiemQT());
        System.out.println("Diem HP:" + this.getDiemHocphan());
        Diemtongket();
    }
}
