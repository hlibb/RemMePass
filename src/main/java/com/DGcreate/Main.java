package com.DGcreate;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // creating dictionary
        String strDict = "note convince assist fetch reflect expose idea account churn hello wing slab";
        List<String> stringsSorted = Arrays.stream(strDict.split(" ")).sorted().toList();
        System.out.println(stringsSorted);

        // hashset sorts on its own way
        HashSet<String> dict = new HashSet<>(stringsSorted);
        System.out.println(dict);
        // 1 2 3 4 == 2 1 3 4 == 2 3 1 4 == 2 3 4 1
    }
}
