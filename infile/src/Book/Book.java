/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Book;

import java.io.Serializable;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Book implements  Serializable{
     protected  String Id;
    protected  String Authors;
    protected  String Title;
    protected  String Category;

    public Book() {
    }

    public Book(String Id, String Authors, String Title, String Category) {
        this.Id = Id;
        this.Authors = Authors;
        this.Title = Title;
        this.Category = Category;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getAuthors() {
        return Authors;
    }

    public void setAuthors(String Authors) {
        this.Authors = Authors;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String Category) {
        this.Category = Category;
    }
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ID:");
        this.Id = sc.nextLine();
        System.out.println("Authors:");
        this.Authors = sc.nextLine();
        System.out.println("Title:");
        this.Title = sc.nextLine();
       while(true){
           System.out.println("tapchi,khxh,khtn,luanvan");
           this.Category = "tapchi";
        if( Category != null &&Category.equals("tapchi")|| Category.equals("KHTN") ||
                Category.equals("KHXH")|| Category.equals("luanvan")){
            setCategory(sc.nextLine());
            break;
        }
       }
        
    }

    @Override
    public String toString() {
        return "Book" + "Id=" + Id + ", Authors=" + Authors + ", Title=" + Title + ", Category=" + Category;
    }
    
}
