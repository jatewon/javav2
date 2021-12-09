/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de7;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Thisinh> listts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("so luong thi sinh");
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++){
            System.out.println("thi sinh " +i);
            System.out.println(" A or C");
            String s = sc.nextLine();
            if(s.equals("A" )|| s.equals("a")){
                Thisinh tsa = new ThisinhkhoiA();
                tsa.Nhap();
                listts.add(tsa);
            }else if(s.equals("c") || s.equals("C")){
                Thisinh tsc = new ThisinhkhoiC();
                tsc.Nhap();
                listts.add(tsc);
            }else
            {
                System.out.println("Nhap lai");
            }
        }
        System.out.println("ds thisinh");
        for (Thisinh listt : listts) {
            if(listt.Check()){
                listt.Hienthi();
            }
        }
             
    }
}