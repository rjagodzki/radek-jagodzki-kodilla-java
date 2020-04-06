package com.kodilla.hibernate.manytomany.facade;

public class SearchException extends Exception {
    public static String ERR_NO_COMPANY = "No company has been found";
    public static String ERR_NO_EMPLOYEE = "No employee has been found";

    public SearchException(String message) {
        super(message);
    }
}
