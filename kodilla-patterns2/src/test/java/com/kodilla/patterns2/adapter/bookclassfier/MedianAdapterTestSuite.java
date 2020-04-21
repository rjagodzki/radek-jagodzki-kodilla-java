package com.kodilla.patterns2.adapter.bookclassfier;

import com.kodilla.patterns2.adpater.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adpater.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class   MedianAdapterTestSuite {
    @Test
    public void medianPublicationYearTest() {
        // Given
        Book book1 = new Book("author1", "title1",2000,"signature1");
        Book book2 = new Book("author2", "title2",1850,"signature2");
        Book book3 = new Book("author3", "title3",1920,"signature3");
        Book book4 = new Book("author4", "title4",2020,"signature4");
        Book book5 = new Book("author5", "title5",1850,"signature5");

        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        MedianAdapter medianAdapter = new MedianAdapter();

        // When
        int median = medianAdapter.publicationYearMedian(bookSet);
        // Then

        Assert.assertEquals(1920, median);
    }
}
