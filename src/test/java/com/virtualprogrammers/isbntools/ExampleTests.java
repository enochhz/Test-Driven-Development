package com.virtualprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;

import com.virtualpairprogrammers.isbntools.ValidateISBN;

public class ExampleTests {

    @Test
    public void checkAValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("first value", result);
        result = validator.checkISBN("0140177396");
        assertTrue("second value", result);
    }

    @Test
    public void checkAnInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }

    @Test
    public void nineDigitISBNsAreNotAllowed() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("123456789");
        assertFalse(result);
    }

}