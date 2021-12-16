/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bxx {
      
    public static void main(String[] args) {
         int n = 0;
      List<Sinhvien> listutt = new ArrayList<>();
        System.out.println("so luong sinh vien:");
        n = new Scanner(System.in).nextInt();
        Sinhvien sv = null;
        for(int i = 0;i<n;i++){
            sv = new SinhvienHTTT();
            sv.Nhap();
            listutt.add(sv);
        }
        ObjectOutputStream oss = null;
        try {
            ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("svutt.obj"));
            for (Sinhvien sinhvien : listutt) {
                oos.writeObject(sinhvien);
            }
           oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("svutt.obj"));
            Object obj = null;
            try {
                  while((obj= ois.readObject()) != null){
               Sinhvien sv2 = (Sinhvien) obj;
               listutt.add(sv2);
            }
            } catch (Exception ex) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0;i<listutt.size();i++){
            System.out.println(listutt.get(i));
        }
    }
}
