/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;
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
        System.out.println("nhap so luong sach:");
        int n = new Scanner(System.in).nextInt();
        ArrayList<Book> listbook = new ArrayList<>();
        try {
            File file = new File("books.dat");
            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 1; i <= n; i++) {
                Book book = new Book();
                book.Nhap();
                listbook.add(book);
                bw.write(book.getId() + "|" + book.getAuthors() + "|"
                        + book.getTitle() + "|" + book.getCategory());
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
        }
        for(int i = 0;i<listbook.size();i++){
            System.out.println(listbook.toString());
        }
        try {
            File file = new File("books.dat");
            System.out.println("ban muon xoa file ko:");
            System.out.println("1: de xoa 2: de bo qua");
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
                case 2:{
                    break;
                         
                }
            }
        } catch (Exception e) {
        }
    }

    private static void backup(String dirPath) {
         BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
             Reader reader = new FileReader("E:/books.dat");
            Writer writer = new FileWriter( new File(dirPath));
              bufferedReader = new BufferedReader(reader);
            bufferedWriter = new BufferedWriter(writer);
            int b;
               while((b = bufferedReader.read()) != -1){
                   bufferedWriter.write(b);
               }
              bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
        }
    }

    
}
