package com.devxschool;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class ConverterTest {
    @Test
    public void isWeightTest() {

        assertTrue(Converter.isWeight("lb"));
        assertTrue(Converter.isWeight("oz"));
        assertFalse(Converter.isWeight("ft"));
        assertFalse(Converter.isWeight("in"));
        assertFalse(Converter.isWeight("F"));
        assertFalse(Converter.isWeight("aa"));
    }
    @Test
    public void calculateWeightTest() {
        double weight = Converter.calculateWeight("lb", "kg", 1);
        assertEquals(0.45359237d, weight, 0.001);
        weight = Converter.calculateWeight("lb", "kg", 10);
        assertEquals(4.5359237d, weight,0.001);

        weight = Converter.calculateWeight("oz", "g", 1);
        assertEquals(28.34952d, weight, 0.001);
        weight = Converter.calculateWeight("oz", "g", 10);
        assertEquals(283.4952d, weight, 0.001);
    }
    @Test
    public void isLengthTest() {
        assertTrue(Converter.isLength("ft"));
        assertTrue(Converter.isLength("in"));
        assertFalse(Converter.isLength("lb"));
        assertFalse(Converter.isLength("F"));
        assertFalse(Converter.isLength("aa"));
    }
    @Test
    public void calculateLengthTest() {
        double length = Converter.calculateLength("ft", "m", 1);
        assertEquals(0.3048d, length, 0.001);
        length = Converter.calculateLength("ft", "cm", 1);
        assertEquals(30.48d, length,0.001);

        length = Converter.calculateLength("in", "cm", 1);
        assertEquals(2.54d, length, 0.001);
        length = Converter.calculateLength("in", "cm", 10);
        assertEquals(25.4d, length, 0.001);
    }
    @Test
    public void isTemperatureTest() {
        assertTrue(Converter.isTemperature("F"));
        assertFalse(Converter.isTemperature("ft"));
        assertFalse(Converter.isTemperature("lb"));
        assertFalse(Converter.isTemperature("in"));
        assertFalse(Converter.isTemperature("oz"));
        assertFalse(Converter.isTemperature("aa"));
    }
    @Test
    public void calculateTemperatureTest() {
        double temp = Converter.calculateTemperature("F", "C", 5);
        assertEquals(-0.0, temp, 0.1);
        temp = Converter.calculateTemperature("F", "C", 59);
        assertEquals(0, temp, 0.1);
    }
}
