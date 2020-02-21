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
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Book b1=new Book("Complete guide to Java","Dr. Kamruddin Nur","CS 201","Programming Language",20);
        b1.showinfo();
        b1.addBookCopy(10);
        b1.showinfo();
        
        Book b2=new Book();
        Book b3=new Book();
        
        b1.showTotalBook();
    }
    
}
