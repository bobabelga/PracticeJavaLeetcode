package com.bobabelga;

public class UserInput {

    public static class TextInput {
        String input = "";

        public void add(char c) {
            input = input + c;
        }

        public String getValue() {
            return input;
        }
    }

    public static class NumericInput extends TextInput {
        @Override
        public void add(char c) {
            try {
                int number = Integer.parseInt(String.valueOf(c));
                super.add(c);
            } catch (NumberFormatException e) {

            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}