package com.kodilla.patterns2.adpater.bookclasifier.librarya;

import java.util.Set;

public interface Classifier {
    int publicationYearMedian(Set<Book> bookSet);
}
