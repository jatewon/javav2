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
public class Lab6 {

    public static void main(String[] args) {
        List<Shape> figure = new ArrayList<>();
        Shape s1 = new Line();
        Shape s2 = new Circular();
        Shape s3 = new Circular();
       Composite com = new Composite();
        Shape l1 = new Line();
        Shape l2 = new Line();
        Shape l3 = new Line();
        Shape c1 = new Circular();
        com.add(l1);
        com.add(l2);
        com.add(l3);
        com.add(c1);
        figure.add(s1);
        figure.add(s2);
        figure.add(s3);
        figure.add(com);
        figure.add(com);
        Shape chi = com.getChild(3);
        System.out.println("Danh sach composite");
        for(int i = 0;i<com.listshape.size();i++){
            Shape shape = com.listshape.get(i);
            shape.draw();
        }
        chi.draw();
        System.out.println("Doi mau dong bo hinh line circular composite");
       for(int i = 0;i<figure.size();i++)
       {
            Shape  shape = figure.get(i);
            shape.setColor(102);
       }
       
         System.out.println("Quay hinh line circular composite");
        for(int i = 0;i<figure.size();i++)
        {
            Shape  shape = figure.get(i);
            shape.rotate(120);
        }
    }
}
