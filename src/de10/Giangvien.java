/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de10;

/**
 *
 * @author Admin
 */
public class Giangvien {
    protected  String hoten;
    protected  String maGV;
    protected  String diachi;
    protected  String gioitinh;
    protected String khoa;

    public Giangvien() {
    }

    public Giangvien(String hoten, String maGV, String diachi, String gioitinh, String khoa) {
        this.hoten = hoten;
        this.maGV = maGV;
        this.diachi = diachi;
        this.gioitinh = gioitinh;
        this.khoa = khoa;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

   
    public void Hienthi() {
        System.out.println( "Giangvien{" + "hoten=" + hoten + ", maGV=" + maGV + ", diachi=" + diachi + ", gioitinh=" + gioitinh + ", khoa=" + khoa );
    }
   
}
