package com.bobabelga;


import java.util.*;

public class MergeNames {

    public static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> uniqueNamesList = Arrays.asList(names1);
        ArrayList<String> uniqueNamesArrayList = new ArrayList<>(uniqueNamesList);
        for (String name : names2)
            if (!uniqueNamesList.contains(name))
                uniqueNamesArrayList.add(name);
        Set<String> hSet = new HashSet<>(uniqueNamesArrayList);
        return hSet.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia", "Ava"};
        String[] names2 = new String[]{"Emma","Olivia", "Sophia", "Emma"};
        System.out.println(String.join(", ", MergeNames.uniqueNames(names1, names2))); // should print Ava, Emma, Olivia, Sophia
    }
}