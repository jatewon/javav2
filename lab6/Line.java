/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Admin
 */
public class Line extends Shape{

    
    public void draw() {
       System.out.println("Ve duong thang@@");
    }


    public void rotate(int angle) {
        System.out.println("Duong thang quay 1 goc:"+ angle);
    }

   
    public void moveLeft(int point) {
        System.out.println("di chuyen duong thang sang diem"+ point);
    }

    
    public void setColor(int color) {
        System.out.println("Chon mau cho duong thang:" +color);
    }

   
}
