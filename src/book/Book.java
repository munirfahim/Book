/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package book;

/**
 *
 * @author student
 */
public class Book {
    private String bookName=" ";
    private String bookAuthor= " ";
    private String bookId=" ";
    private String bookType= " ";
    private int bookCopy=0;
    private static int bookCounter=0;
    
    public Book(){bookCounter++;}
    public Book(String bn,String ba,String bid,String bt,int bc){
        this.bookName=bn;
        this.bookAuthor=ba;
        this.bookId=bid;
        this.bookType=bt;
        this.bookCopy=bc;
        bookCounter++;
    }
    
    public void showinfo(){
        System.out.println("Book Name: "+bookName);
        System.out.println("Book Author: "+bookAuthor);
        System.out.println("Book ID: "+bookId);
        System.out.println("Book Type: "+bookType);
        System.out.println("Book Copy: "+bookCopy+"\n\n");
    }
    
    public void addBookCopy(int x){
        this.bookCopy+=x; 
    }
    
    public void showTotalBook(){
        System.out.println(" Total Book Count: "+bookCounter);
    }
}

