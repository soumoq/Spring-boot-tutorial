package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import java.util.*;
import java.util.stream.Collectors;

public class StringLine {
    public static void main(String[] args) {
        List<String> api = new ArrayList<>();
        api.add("100000440");
        api.add("100000442");
        api.add("100000441");
        List<String> db = new ArrayList<>();
        db.add("100000440");
        db.add("100000442");
        db.add("100000441");
        db.add("1000004334");
        db.add("10000044334");

        List<String> extraInDb = db.stream()
                .filter(e -> !api.contains(e))
                .collect(Collectors.toList());
        System.out.println(extraInDb);
    }
}
