/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de9;

/**
 *
 * @author Admin
 */
public class Book {
    protected  String id;
    protected  String authors;
    protected  String title;
    protected  String category;

    public Book() {
    }
    
    public Book(String id, String authors, String title, String category) {
        this.id = id;
        this.authors = authors;
        this.title = title;
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

  
    public void Hienthi() {
        System.out.println("Book{" + "id=" + id + ", authors=" + authors + ", title=" + title + ", category=" + category + '}');
    }
    
}
