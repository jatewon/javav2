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
public class Circular extends Shape {

    public void draw() {
        System.out.println("Ve hinh tron@@");
    }

    public void rotate(int angle) {
        System.out.println("Quay hinh tron goc:" +angle +"do@@");
    }

    public void moveLeft(int point) {
        System.out.println("Di chuyen hinh tron den diem"+ point);
    }

    public void setColor(int color) {
        System.out.println("To mau hinh tron :"+ color);
    }
    public  int getArea(){
        return  500;
    }

}
