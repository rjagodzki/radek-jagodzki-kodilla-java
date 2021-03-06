package com.kodilla.patterns2.adpater.bookclasifier;

import com.kodilla.patterns2.adpater.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adpater.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns2.adpater.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns2.adpater.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    @Override
    public int averagePublicationYear(Map<BookSignature, Book> books) {
        return 0;
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Book> books) {
        Statistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
