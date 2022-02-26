/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7;

/**
 *
 * @author Admin
 */
public class Nhanvien {
    protected String id;
    protected  String hoten;

    public Nhanvien() {
    }

    public Nhanvien(String id, String hoten) {
        this.id = id;
        this.hoten = hoten;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }
    
}
