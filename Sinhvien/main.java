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
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int n = 0;
      List<Sinhvien> listsv = new ArrayList<>();
     List<Sinhvien> listsv1 = new ArrayList<>();
        System.out.println("so luong sinh vien:");
        n = new Scanner(System.in).nextInt();
        Sinhvien sv = null;
        for(int i = 0;i<n;i++){
            System.out.println("sinhvient "+ i);
            System.out.println(" utt || httt");
            String s = sc.nextLine();
            if(s.equals("utt") || s.equals("UTT")){
                sv = new SinhvienUTT();
            sv.Nhap();
            listsv.add(sv);
            }else if(s.equals("httt") || s.equals("HTTT")){
                 sv = new SinhvienHTTT();
            sv.Nhap();
            listsv.add(sv);
            }else{
                System.out.println("chon lai");
            }
            
        }
        ObjectOutputStream oss = null;
        try {
            ObjectOutputStream oos = new  ObjectOutputStream(new FileOutputStream("svutt.obj"));
            for (Sinhvien sinhvien : listsv) {
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
              listsv1.add(sv2);
            }
            } catch (Exception ex) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0;i<listsv1.size();i++){
            System.out.println(listsv1.toString());
        }
    }
}
