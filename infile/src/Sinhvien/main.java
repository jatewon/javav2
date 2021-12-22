/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sinhvien;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Sinhvien> listsv = new ArrayList<>();
        System.out.println("1:svtt");
        System.out.println("2: svhttt");
        System.out.println("lua chon:");
        int chon = sc.nextInt();
        switch(chon){
            case 1:{
                try {
            File file = new File("svutt.dat");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("nhap so luong sinh vien");
            int n  = sc.nextInt();
            for(int i = 1;i<=n;i++){
                Sinhvien sv = new SinhvienUTT();
                sv.Nhap();
                bw.write(sv.getHoten());
                bw.newLine();
            }
             bw.close();
        } catch (Exception e) {
        }
                break;
            }
            case 2:{
                 try {
            File file = new File("svhttt.dat");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            System.out.println("nhap so luong sinh vien");
            int n  = sc.nextInt();
            for(int i = 1;i<=n;i++){
                Sinhvien sv = new SinhvienHTTT();
                sv.Nhap();
                listsv.add(sv);
                bw.write(sv.getHoten());
                bw.newLine();
            }
             bw.close();
        } catch (Exception e) {
        }
                 break;
            }
        }
    }
}
