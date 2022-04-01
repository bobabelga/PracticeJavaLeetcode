package com.bobabelga;

public class ValidParentheses {
    public static void main(String[] args) {
//        System.out.println(isValid("({})"));
//        System.out.println(isValid("({}){"));
//        System.out.println(isValid("({}){)"));
        System.out.println(isValid("){"));
    }

    public static boolean isValid(String s) {
        boolean valid = false;
        StringBuilder sb = new StringBuilder(s);
        if (sb.length() == 0) valid = false;
        else {
            int i = 0;
            while (i < sb.length()){
                if (i + 1 < sb.length()) {
                    switch (sb.charAt(i)) {
                        case '(': {
                            if (sb.charAt(i+1) == ')') {
                                valid = true;
                                sb.deleteCharAt(i);
                                sb.deleteCharAt(i);
                                i = 0;
                            } else if (sb.charAt(i+1) == '}' || sb.charAt(i+1) == ']') {
                                valid = false;
                                i = sb.length();
                            } else i++;
                        }
                        break;
                        case '{':
                            if (sb.charAt(i+1) == '}') {
                                valid = true;
                                sb.deleteCharAt(i);
                                sb.deleteCharAt(i);
                                i = 0;
                            }else if (sb.charAt(i+1) == ')' || sb.charAt(i+1) == ']') {
                                valid = false;
                                i = sb.length();
                            } else i++;
                            break;
                        case '[':
                            if (sb.charAt(i+1) == ']') {
                                valid = true;
                                sb.deleteCharAt(i);
                                sb.deleteCharAt(i);
                                i = 0;
                            }else if (sb.charAt(i+1) == '}' || sb.charAt(i+1) == ')') {
                                valid = false;
                                i = sb.length();
                            } else i++;
                            break;
                        default:
                        {
                            i++;
                            valid = false;
                        }
                    }
                } else {
                    i++;
                    valid = false;
                }
            }
        }
        return valid;
    }
}
