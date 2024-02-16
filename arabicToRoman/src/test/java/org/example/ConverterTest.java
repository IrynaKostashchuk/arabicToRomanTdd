package org.example;

import org.junit.*;

import static org.junit.Assert.*;

/*
  @author   kosta
  @project   arabicToRoman
  @class  ConverterTest
  @version  1.0.0 
  @since 15.02.2024 - 23.44
*/public class ConverterTest {

    @Test
    public void whenNumberGreater4000ThenNull() {
        assertNull(Converter.convertArabicToRoman(4002));
    }

    @Test
    public void whenNumberLess0ThenNull() {
        assertNull(Converter.convertArabicToRoman(-5));
    }

    @Test
    public void whenNumberLess4000ThenNotNull() {
        assertNotNull(Converter.convertArabicToRoman(150));
    }

    @Test
    public void whenNumberIs1ThenI() {
        assertEquals("I", Converter.convertArabicToRoman(1));
    }

    @Test
    public void whenNumberIs4ThenIV() {
        assertEquals("IV", Converter.convertArabicToRoman(4));
    }

    @Test
    public void whenNumberIs5ThenV() {
        assertEquals("V", Converter.convertArabicToRoman(5));
    }

    @Test
    public void whenNumberIs6ThenVI() {
        assertEquals("VI", Converter.convertArabicToRoman(6));
    }
    @Test
    public void whenNumberIs9ThenIX() {
        assertEquals("IX", Converter.convertArabicToRoman(9));
    }

    @Test
    public void whenNumberIs10ThenX() {
        assertEquals("X", Converter.convertArabicToRoman(10));
    }
    @Test
    public void whenNumberIs11ThenXI() {
        assertEquals("XI", Converter.convertArabicToRoman(11));
    }

    @Test
    public void whenNumberIs14ThenXIV() {
        assertEquals("XIV", Converter.convertArabicToRoman(14));
    }

    @Test
    public void whenNumberIs15ThenXV() {
        assertEquals("XV", Converter.convertArabicToRoman(15));
    }
    @Test
    public void whenNumberIs19ThenXIX() {
        assertEquals("XIX", Converter.convertArabicToRoman(19));
    }

    @Test
    public void whenNumberIs20ThenXX() {
        assertEquals("XX", Converter.convertArabicToRoman(20));
    }

    @Test
    public void whenNumberIs40ThenXL() {
        assertEquals("XL", Converter.convertArabicToRoman(40));
    }

    @Test
    public void whenNumberIs49ThenXLIX() {
        assertEquals("XLIX", Converter.convertArabicToRoman(49));
    }

    @Test
    public void whenNumberIs50ThenL() {
        assertEquals("L", Converter.convertArabicToRoman(50));
    }

    @Test
    public void whenNumberIs59ThenLIX() {
        assertEquals("LIX", Converter.convertArabicToRoman(59));
    }

    @Test
    public void whenNumberIs90ThenXC() {
        assertEquals("XC", Converter.convertArabicToRoman(90));
    }

    @Test
    public void whenNumberIs99ThenXCIX() {
        assertEquals("XCIX", Converter.convertArabicToRoman(99));
    }

    @Test
    public void whenNumberIs100ThenC() {
        assertEquals("C", Converter.convertArabicToRoman(100));
    }

    @Test
    public void whenNumberIs149ThenCXLIX() {
        assertEquals("CXLIX", Converter.convertArabicToRoman(149));
    }
    //16
    @Test
    public void whenNumberIs400ThenCD() {
        assertEquals("CD", Converter.convertArabicToRoman(400));
    }

    @Test
    public void whenNumberIs499ThenCDXCIX() {
        assertEquals("CDXCIX", Converter.convertArabicToRoman(499));
    }

    @Test
    public void whenNumberIs500ThenD() {
        assertEquals("D", Converter.convertArabicToRoman(500));
    }

    @Test
    public void whenNumberIs949ThenCMXLIX() {
        assertEquals("CMXLIX", Converter.convertArabicToRoman(949));
    }

    @Test
    public void whenNumberIs999ThenCMXCIX() {
        assertEquals("CMXCIX", Converter.convertArabicToRoman(999));
    }

    @Test
    public void whenNumberIs1000ThenM() {
        assertEquals("M", Converter.convertArabicToRoman(1000));
    }

    @Test
    public void whenNumberIs3449ThenMMMCDXLIX() {
        assertEquals("MMMCDXLIX", Converter.convertArabicToRoman(3449));
    }

    @Test
    public void whenNumberIs3499ThenMMMCDXCIX() {
        assertEquals("MMMCDXCIX", Converter.convertArabicToRoman(3499));
    }

    @Test
    public void whenNumberIs3949ThenMMMCMXLIX() {
        assertEquals("MMMCMXLIX", Converter.convertArabicToRoman(3949));
    }

    @Test
    public void whenNumberIs3999ThenMMMCMXCIX() {
        assertEquals("MMMCMXCIX", Converter.convertArabicToRoman(3999));
    }


    @Test
    public void whenNumberIs27ThenXXVII() {
        assertEquals("XXVII", Converter.convertArabicToRoman(27));
    }

    @Test
    public void whenNumberIs144ThenCXLIV() {
        assertEquals("CXLIV", Converter.convertArabicToRoman(144));
    }

    @Test
    public void whenNumberIs333ThenCCCXXXIII() {
        assertEquals("CCCXXXIII", Converter.convertArabicToRoman(333));
    }

    @Test
    public void whenNumberIs666ThenDCLXVI() {
        assertEquals("DCLXVI", Converter.convertArabicToRoman(666));
    }

    @Test
    public void whenNumberIs888ThenDCCCLXXXVIII() {
        assertEquals("DCCCLXXXVIII", Converter.convertArabicToRoman(888));
    }

    @Test
    public void whenNumberIs1111ThenMCXI() {
        assertEquals("MCXI", Converter.convertArabicToRoman(1111));
    }

    @Test
    public void whenNumberIs2019ThenMMXIX() {
        assertEquals("MMXIX", Converter.convertArabicToRoman(2019));
    }

    @Test
    public void whenNumberIs2022ThenMMXXII() {
        assertEquals("MMXXII", Converter.convertArabicToRoman(2022));
    }

    @Test
    public void whenNumberIs2222ThenMMCCXXII() {
        assertEquals("MMCCXXII", Converter.convertArabicToRoman(2222));
    }

    @Test
    public void whenNumberIs3333ThenMMMCCCXXXIII() {
        assertEquals("MMMCCCXXXIII", Converter.convertArabicToRoman(3333));
    }

    @Test
    public void whenNumberIs1234ThenMCCXXXIV() {
        assertEquals("MCCXXXIV", Converter.convertArabicToRoman(1234));
    }

}