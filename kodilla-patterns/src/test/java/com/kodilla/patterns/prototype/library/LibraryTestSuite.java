package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks(){
        //Given
        Book book1 = new Book("Harry Potter and the Philosopher’s Stone", "J.K. Rowling",LocalDate.of(1997,04,10));
        Book book2 = new Book("Harry Potter and the Chamber of Secrets", "J.K. Rowling",LocalDate.of(1998,07,2));
        Book book3 = new Book("Harry Potter and the Prisoner of Azkaban", "J.K. Rowling",LocalDate.of(1999,07,8));
        Book book4 = new Book("Harry Potter and the Goblet of Fire", "J.K. Rowling",LocalDate.of(2000,07,8));
        Book book5 = new Book("Harry Potter and the Order of the Phoenix", "J.K. Rowling",LocalDate.of(2003,06,21));
        Book book6 = new Book("Harry Potter and the Half-Blood Prince", "J.K. Rowling",LocalDate.of(2005,07,16));
        Book book7 = new Book("Harry Potter and the Deathly Hallows", "J.K. Rowling",LocalDate.of(2007,07,21));
        Library library = new Library("J.K. Rowling Library");
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);
        library.getBooks().add(book6);
        library.getBooks().add(book7);

        Library libraryShallowCopy = null;
        try {
            libraryShallowCopy = library.shallowCopy();
            libraryShallowCopy.setName("Shallow Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library libraryDeepCopy = null;
        try {
            libraryDeepCopy = library.deepCopy();
            libraryDeepCopy.setName("Deep Copy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        if(libraryDeepCopy != null) {
            libraryDeepCopy.getBooks().remove(book1);
            libraryDeepCopy.getBooks().remove(book2);
        }

        //Then
        System.out.println(library);
        System.out.println(libraryShallowCopy);
        System.out.println(libraryDeepCopy);

        //tu pewnie tez powinienem dodac !=null
        Assert.assertEquals(7, library.getBooks().size());
        Assert.assertEquals(7, libraryShallowCopy.getBooks().size());
        Assert.assertEquals(5, libraryDeepCopy.getBooks().size());
        Assert.assertEquals(library.getBooks(), libraryShallowCopy.getBooks());
        Assert.assertNotEquals(library.getBooks(), libraryDeepCopy.getBooks());
    }
}
