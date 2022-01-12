/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tulanh;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void menu(){
        System.out.println("\t\tMENU");
        System.out.println("1.Nhap tu lanh");
        System.out.println("2. in Danh sach tu lanh");
        System.out.println("3. hien thi tu lanh theo ban nhap");
        System.out.println("4.tong tien tat ca tu lanh");
        System.out.println("5.Hien thi tu lanh > 200lit");
        System.out.println("6. Sua thong tin tu lanh");
        System.out.println("0.Exit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLTL qltl = new QLTL();
        int chon;
        while(true){
            menu();
            chon =sc.nextInt();
            switch(chon){
                case 1:{
                    System.out.println("ban chon nhap tu lanh");
                    qltl.add();
                    break;
                }
                case 2:{
                    System.out.println("ban chon hien thi ds");
                    qltl.xuatTT();
                    break;
                }
                case 3:{
                    System.out.println("ban chon tim kiem tu lanh theo hang");
                     System.out.println("Nhap hanfSX can tim:");
                    String hangSX = sc.nextLine();
                    String akali = sc.nextLine();
                    qltl.find(akali);
                    break;
                }
                case 4:{
                    System.out.println("ban chon tinh tien full tu lanh");
                    qltl.Sumtulanh();
                    break;
                    
                }
                case 5:{
                    System.out.println("ban chon in ds tu lanh dung tich > 200lit");
                    qltl.tulanhhon200();
                    break;
                }
                case 6:{
                    System.out.println("ban chon sua thong tin tu lanh");
                    System.out.println("nhap ma hang");
                    int mahang = sc.nextInt();
                    qltl.suathongtin(mahang);
                    break;
                }
                
                default:
                    System.out.println("nhap tu 0 - 6");
            }
        }
    }
}
