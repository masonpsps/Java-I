/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author masonpsps
 */
public class Book {
    private String name;
    private int pageCount;
    private int publicationYear;
    
    public Book(String name, int pageCount, int publicationYear) {
        this.name = name;
        this.pageCount = pageCount;
        this.publicationYear = publicationYear;
    }
    
    public String getName() {
        return this.name;
    }
    public int getPageCount() {
        return this.pageCount;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }
    
    @Override
    public String toString() {
        return this.name + ", " + this.pageCount + " pages, " + this.publicationYear;
    }
}
