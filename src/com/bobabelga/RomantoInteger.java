package com.bobabelga;

public class RomantoInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    //    I -> 1 ... V -> 5 ... X -> 10 ... L -> 50 ... C -> 100 ... D -> 500 ... M -> 1000
//    IV -> 4 ... IX -> 9 ... XL -> 40 ... XC -> 90 ... CD -> 400 ... CM -> 900
    public static int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'I':
                    if (i + 1 < s.length()) {
                        if (s.charAt(i + 1) == 'V') {
                            result += 4;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'X') {
                            result += 9;
                            i++;
                            break;
                        } else {
                            result += 1;
                            break;
                        }
                    }
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i + 1 < s.length()) {
                        if (s.charAt(i + 1) == 'L') {
                            result += 40;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'C') {
                            result += 90;
                            i++;
                            break;
                        } else {
                            result += 10;
                            break;
                        }
                    }
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i + 1 < s.length()) {
                        if (s.charAt(i + 1) == 'D') {
                            result += 400;
                            i++;
                            break;
                        } else if (s.charAt(i + 1) == 'M') {
                            result += 900;
                            i++;
                            break;
                        }  else {
                            result += 100;
                            break;
                        }
                    }
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;

                default:
                    // code block
            }
        }
        return result;
    }
}
