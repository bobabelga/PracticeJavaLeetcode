package com.bobabelga;

public class TwoSum {

    public static int[] output = new int[2];

    public static void main(String[] args) {
        int[] numbers = new int[3];
        numbers[0] =3;
        numbers[1] =2;
        numbers[2] = 4;
        twoSum(numbers ,6);
        System.out.println(output[0]+" "+output[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j <nums.length; j++) {
                if (nums[i]+nums[j]==target) {
                    output[0]=i;
                    output[1]=j;
                    return output;
                }
            }
        }

        return output;
    }

}
