package org.example;/*
  @author   kosta
  @project   arabicToRoman
  @class  Converter
  @version  1.0.0 
  @since 15.02.2024 - 23.40
*/

public class Converter {
     public static String convertArabicToRoman(int number){
//         String result = "";
//         return result;
         if (number <= 0 || number>=4000){
             return null;
         }
         final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
         final String[] symbols = {"M",  "CM", "D",  "CD", "C",  "XC", "L",
                 "XL", "X",  "IX", "V",  "IV", "I"};
         StringBuilder sb = new StringBuilder();

         for (int i = 0; i < values.length; ++i) {
             if (number == 0)
                 break;
             while (number >= values[i]) {
                 number -= values[i];
                 sb.append(symbols[i]);
             }
         }

         return sb.toString();
     }
}
