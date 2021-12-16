/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import com.sun.source.tree.Scope;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        List<NhanVien> listnv = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("so luong nhan vien:");
         n = new Scanner(System.in).nextInt();
        NhanVien nv = null;
        for (int i = 0; i < n; i++) {
            System.out.println("nhan vien "+ i);
            nv = new NhanVien();
            nv.Nhap();
            listnv.add(nv);
        }
          ObjectOutputStream oss = null;
           try {
      
            ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("nhanvien.dat"));
               for (NhanVien nhanVien : listnv) {
                   oos.writeObject(nhanVien);
               }    
           oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
           ObjectInputStream ois = null;
           try {
            ois = new ObjectInputStream(new FileInputStream("nhanvien.dat"));
            Object obj = null;
               try {
                   while((obj= ois.readObject()) != null){
                       NhanVien nv2 = (NhanVien) obj;
                       listnv.add(nv2);
                   }
               } catch (Exception ex) {
               }
        } catch (Exception e) {
            e.printStackTrace();
        }
           for(int i = 0;i<listnv.size();i++){
               System.out.println(listnv.toString());
           }
           //d
           System.out.println("file copy");
           String filename = new Scanner(System.in).nextLine();
           
           File file = new File(filename);
           try {
            oss = new ObjectOutputStream(new FileOutputStream(file));
            for(int i = 0;i<listnv.size();i++){
                NhanVien nhanVien = listnv.get(i);
                oss.writeObject(nhanVien);
            }
            file.delete();
            oss.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
