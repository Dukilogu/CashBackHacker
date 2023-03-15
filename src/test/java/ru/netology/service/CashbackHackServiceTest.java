package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemain() {

        int amount = 800;

        int expected = 200;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testRemainForFull() {

        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testRemainForOne() {

        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void testRemainForZero() {

        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }


}