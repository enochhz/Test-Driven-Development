package com.virtualprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;

import com.virtualpairprogrammers.isbntools.ValidateISBN;

public class ExampleTests {

    @Test
    public void checkAValidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(140449116);
        assertTrue(result);
    }

    @Test
    public void checkAnInvalidISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN(140449116);
        assertFalse(result);
    }

}