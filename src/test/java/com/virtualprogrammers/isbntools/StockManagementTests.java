package com.virtualprogrammers.isbntools;

import org.junit.Test;
import static org.junit.Assert.*;

import com.virtualpairprogrammers.isbntools.StockManager;

public class StockManagementTests {

    @Test
    public void testCanGetACorrectLocatorCode() {
        String isbn = "0140177396";
        StockManager stockManager = new StockManager();
        String locatorCode = stockManager.getLocatorCode(isbn);
        assertEquals("7396J4", locatorCode);
    }

}