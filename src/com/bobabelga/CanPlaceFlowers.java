package com.bobabelga;

public class CanPlaceFlowers {
    public static void main(String[] args) {
        System.out.println(canPlaceFlowers(new int[]{1,0,0},1));
    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int flowerNum = 0;
        if (flowerbed.length == 1) {
            if (flowerbed[0] == 0) flowerNum++;
        } else {
            if (flowerbed[0] == 0) {
                if(flowerbed[1] == 0){
                    System.out.println(0);
                    flowerNum++;
                    flowerbed[0] = 1;
                }
            }
            if (flowerbed[flowerbed.length-1] == 0) {
                if(flowerbed[flowerbed.length-2] == 0){
                    System.out.println(flowerbed.length-1);
                    flowerNum++;
                    flowerbed[flowerbed.length-1] = 1;
                }
            }
            int i = 1;
            while (i<flowerbed.length-1){
                if (flowerbed[i] == 0) {
                    if (flowerbed[i-1] == 0 && flowerbed[i+1] == 0) {
                        System.out.println(i);
                        i+=2;
                        flowerNum++;
                    }else i++;
                } else i++;
            }
        }


        return flowerNum >= n;

    }
}
