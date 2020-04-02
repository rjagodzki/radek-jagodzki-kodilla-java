package com.kodilla.patterns2.adpater.bookclasifier;

import com.kodilla.patterns2.adpater.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adpater.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adpater.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adpater.bookclasifier.libraryb.Statistics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {


    @Override
    public int publicationYearMedian(Set<Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns2.adpater.bookclasifier.libraryb.Book> books = new HashMap<>();
        for(Book book : bookSet) {
            books.put(new BookSignature(book.getSignature()),
                    new com.kodilla.patterns2.adpater.bookclasifier.libraryb.Book(book.getAuthor(),book.getTitle(),book.getPublicationYear()));
        }
        return medianPublicationYear(books);

    }
}
