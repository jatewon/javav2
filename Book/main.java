/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import  java.util.List;
import  java.io.File;
/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        List<Book> listbook = new ArrayList<>();
        System.out.println("so luong sach:");
        n = new Scanner(System.in).nextInt();
        Book book = null;
        for(int i =0;i<n;i++){
            System.out.println("book "+i);    
                book = new Book();
                book.Nhap();
                listbook.add(book);
        }
        ObjectOutputStream oss = null;
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("book.dat"));
            for (Book book1 : listbook) {
                oss.writeObject(book1);
            }
            oos.close();
        } catch (Exception e) {
        }
        
        ObjectInputStream ois = null;
        try {
             ois = new ObjectInputStream(new FileInputStream("book.dat"));
            Object obj = null;
            try {
                 while((obj= ois.readObject()) != null){
              Book bo = (Book) obj;
              listbook.add(bo);
            }
            } catch (Exception ex) {
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for(int i = 0;i<listbook.size();i++){
            System.out.println(listbook.toString());
        }
        try {
            File file = new File("book.dat");
            System.out.println("ban muon xoa file khong chon 1 de xoa 2 de bo qua ");
            System.out.println("chon:");
            int so = new Scanner(System.in).nextInt();
            switch(so){
                case 1:{
                    System.out.println(" nhap duong dan thu muc:");
                    String dirPath =new Scanner(System.in).nextLine();
                    dirPath += "/copy-"+file.getName();
                    System.out.println(dirPath);
                    backup(dirPath);
                    file.delete();
                    break;
                }  
                case 2:
                {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }

    private static void backup(String dirPath) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("book.dat"));
            oos = new ObjectOutputStream(new FileOutputStream(new File(dirPath)));
            Book b = null;
            try {
                while((b = (Book)ois.readObject()) != null){
                    oos.writeObject(b);
                }
            } catch (Exception e) {
            }
        } catch (Exception e) {
        }finally{
            try {
                ois.close();
                oos.close();
            } catch (Exception e) {
            }
        }
    }
}
