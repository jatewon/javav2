/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de6;

/**
 *
 * @author Admin
 */
public class Word {
    protected  String id;
    protected  String en;
    protected  String vn;

    public Word(String id, String en, String vn) {
        this.id = id;
        this.en = en;
        this.vn = vn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }
    
    public  void hienthi(){
       System.out.println("Id:"+this.getId());
        System.out.println("En:"+this.getEn());
        System.out.println("Vn:" +this.getVn()); 
    }
}
