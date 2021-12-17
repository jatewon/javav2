/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Nhanvien> listNV = new ArrayList<>();
        try {
            File file = new File(("E:/nhanvien.dat"));
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                String[] arr = line.split("\\$");
                String Hoten = arr[0];
                String Ngaysinh = arr[1];
                String Diachi = arr[2];
                String Gioitinh = arr[3];
                String Phongban = arr[4] ;
                float Hesoluong = Float.parseFloat(arr[5]);
                float Thamnien =Float.parseFloat(arr[6]);
                float Luongcoban =Float.parseFloat(arr[7]);
                Nhanvien nhanvien = new Nhanvien();
                listNV.add(nhanvien);
                nhanvien.toString();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("file copy");
        String filename =new Scanner(System.in).nextLine();
        File file = new File(filename);
        
        try {
           
        } catch (Exception e) {
        }
        
    }
}
