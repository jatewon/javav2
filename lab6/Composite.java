/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class Composite extends Shape {
    List<Shape> listshape = new ArrayList<>();
    public  void add(Shape shape){
        listshape.add(shape);
    }
    public  void remove(Shape shape){
        listshape.remove(shape);
    }
    public  Shape getChild(int id){
        return  listshape.get(id);
    }
    
    public void draw() {
        System.out.println("Ve mau hon hop@");
    }

    
    public void rotate(int angle) {
        System.out.println("Quay mau 1 goc"+ angle + "do@@");
    }

    
    public void moveLeft(int point) {
        System.out.println("di chuyen mau den diem "+ point);
    }

   
    public void setColor(int color) {
        System.out.println("To mau cho mau hon hop:" + color);
    }
    
}
