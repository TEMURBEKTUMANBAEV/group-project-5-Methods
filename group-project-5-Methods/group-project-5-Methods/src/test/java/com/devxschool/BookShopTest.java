package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookShopTest {

    @Test
    public void countFreeBooksTest() {

        int result = BookShop.countFreeBooks(true, 5);
        assertEquals("premium account with 5 books should get 1 free book", 2, result);

    }

    @Test
    public void countFreeBooksTest3() {

        int result = BookShop.countFreeBooks(true, 10);
        assertEquals("premium account with 10 books should get 2 free books", 2, result);
    }

    @Test
    public void countFreeBooksTest1() {

        int result = BookShop.countFreeBooks(true, 7);
        assertEquals("premium account with 7 books should get 1 free book", 1, result);

    }

    @Test
    public void countFreeBooksTest2() {

        int result = BookShop.countFreeBooks(true, 8);
        assertEquals("premium account with 8 books should get 2 free books", 2, result);

    }


    @Test
    public void countFreeBooksTest4() {

        int result = BookShop.countFreeBooks(true, 4);
        assertEquals("premium account with 4 books should get 0 free books", 0, result);
    }

    @Test
    public void countFreeBooksTest5() {

        int result = BookShop.countFreeBooks(false, 7);
        assertEquals("not premium account with 7 books should get 1 free books", 2, result);


    }

    @Test
    public void countFreeBooksTest6() {

        int result = BookShop.countFreeBooks(false, 11);
        assertEquals("not premium account with 11 books should get 1 free book", 1, result);

    }

    @Test
    public void countFreeBooksTest7() {

        int result = BookShop.countFreeBooks(false, 12);
        assertEquals("not premium account with 12 books should get 2 free books", 2, result);

    }

    @Test
    public void countFreeBooksTest8() {

        int result = BookShop.countFreeBooks(false, 6);
        assertEquals("not premium account with 6 books should get 0 free books", 0, result);
    }
}
