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

    }
}
