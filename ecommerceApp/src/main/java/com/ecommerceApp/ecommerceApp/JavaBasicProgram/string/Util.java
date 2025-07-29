package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import ch.qos.logback.core.util.StringUtil;

import java.util.*;

public class Util {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        List<Integer> l3 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);

        l3.add(5);
        l3.add(4);
        l3.add(43);

        l2.addAll(l1);
        l2.addAll(l3);
        System.out.println(l2);

        for (int i = 1 ; i<=1 ;i++){
            System.out.println("AS");
        }

    }

    public static final String s1 = "{\n" +
            "  \"user\": {\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"John Doe\",\n" +
            "    \"email\": \"john.doe@example.com\",\n" +
            "    \"address\": {\n" +
            "      \"street\": \"123 Main St\",\n" +
            "      \"city\": \"New York\",\n" +
            "      \"zip\": \"10001\"\n" +
            "    },\n" +
            "    \"orders\": [\n" +
            "      {\n" +
            "        \"order_id\": 101,\n" +
            "        \"date\": \"2024-02-18\",\n" +
            "        \"items\": [\n" +
            "          {\n" +
            "            \"product\": \"Laptop\",\n" +
            "            \"price\": 1200.99,\n" +
            "            \"quantity\": 1\n" +
            "          },\n" +
            "          {\n" +
            "            \"product\": \"Mouse\",\n" +
            "            \"price\": 25.50,\n" +
            "            \"quantity\": 2\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"order_id\": 102,\n" +
            "        \"date\": \"2024-02-15\",\n" +
            "        \"items\": [\n" +
            "          {\n" +
            "            \"product\": \"Keyboard\",\n" +
            "            \"price\": 45.75,\n" +
            "            \"quantity\": 1\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}\n";
    //public static final String s1 = "[a,b,c]";
    public static final String s2 = "{\n" +
            "  \"user\": {\n" +
            "    \"id\": 1,\n" +
            "    \"name\": \"John Doe\",\n" +
            "    \"email\": \"john.doe@example.com\",\n" +
            "    \"address\": {\n" +
            "      \"street\": \"123 Main St\",\n" +
            "      \"city\": \"New York\",\n" +
            "      \"zip\": \"10001\"\n" +
            "    },\n" +
            "    \"orders\": [\n" +
            "      {\n" +
            "        \"order_id\": 101,\n" +
            "        \"date\": \"2024-02-18\",\n" +
            "        \"items\": [\n" +
            "          {\n" +
            "            \"product\": \"Mouse\",\n" +
            "            \"price\": 25.50,\n" +
            "            \"quantity\": 2\n" +
            "          }\n" +
            "          ,    {\n" +
            "            \"product\": \"Laptop\",\n" +
            "            \"price\": 1200.99,\n" +
            "            \"quantity\": 1\n" +
            "          }\n" +
            "        ]\n" +
            "      },\n" +
            "      {\n" +
            "        \"order_id\": 102,\n" +
            "        \"date\": \"2024-02-15\",\n" +
            "        \"items\": [\n" +
            "          {\n" +
            "            \"product\": \"Keyboard\",\n" +
            "            \"price\": 45.75,\n" +
            "            \"quantity\": 1\n" +
            "          }\n" +
            "        ]\n" +
            "      }\n" +
            "    ]\n" +
            "  }\n" +
            "}\n";
    //public static final String s2 = "[a,c,b]";
}
