package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import org.json.*;
import org.skyscreamer.jsonassert.JSONAssert;

import java.util.*;

public class CompareJson {
    public static void main(String[] args) {

        String s3 = Util.s1;
        String s4 = Util.s2;
        System.out.println(s3.replace("\\",""));
        System.out.println(s4.replace("\\",""));
        JSONObject a1 = new JSONObject(s3);
        JSONObject a2 = new JSONObject(s4);

        String s = compareJsonArrays(new JSONArray(a1.get("truvenMedicalClaim").toString()),
                new JSONArray(a2.get("truvenMedicalClaim").toString()));
        if (s.isEmpty())
        System.out.println("no dif");
        else
            System.out.println(s);
    }

    public static String compareJsonArrays(JSONArray jsonArray1, JSONArray jsonArray2) {
        Map<String, JSONObject> map1 = jsonArrayToMap(jsonArray1);
        Map<String, JSONObject> map2 = jsonArrayToMap(jsonArray2);
        StringBuilder differences = new StringBuilder();

        // Find missing elements
        for (String key : map1.keySet()) {
            if (!map2.containsKey(key)) {
                differences.append("❌ Missing in Source 2: ").append(map1.get(key)).append("\n");
            }
        }
        for (String key : map2.keySet()) {
            if (!map1.containsKey(key)) {
                differences.append("❌ Missing in Source 1: ").append(map2.get(key)).append("\n");
            }
        }

        // Compare objects with the same keys
        for (String key : map1.keySet()) {
            if (map2.containsKey(key)) {
                JSONObject obj1 = map1.get(key);
                JSONObject obj2 = map2.get(key);
                differences.append(compareJsonObjects(obj1, obj2, key));
            }
        }

        return differences.toString();
    }

    private static Map<String, JSONObject> jsonArrayToMap(JSONArray jsonArray) {
        Map<String, JSONObject> map = new HashMap<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            try {
                JSONObject obj = jsonArray.getJSONObject(i);
                String id = obj.getString("id"); // Use "id" as a unique identifier
                map.put(id, obj);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return map;
    }

    private static String compareJsonObjects(JSONObject obj1, JSONObject obj2, String key) {
        StringBuilder differences = new StringBuilder();

        for (String field : obj1.keySet()) {
            if (!obj2.has(field)) {
                differences.append("🔹 Field missing in Source 2 for ID ").append(key).append(": ").append(field).append("\n");
                continue;
            }

            Object value1 = obj1.get(field);
            Object value2 = obj2.get(field);

            if (value1 instanceof JSONArray && value2 instanceof JSONArray) {
                JSONArray sorted1 = sortJsonArray((JSONArray) value1);
                JSONArray sorted2 = sortJsonArray((JSONArray) value2);

                if (!sorted1.toString().equals(sorted2.toString())) {
                    differences.append("🔄 Difference in ID ").append(key).append(", Field: ").append(field).append("\n");
                    differences.append("   ➤ Source 1: ").append(sorted1).append("\n");
                    differences.append("   ➤ Source 2: ").append(sorted2).append("\n");
                }
            } else if (!Objects.equals(value1, value2)) {
                differences.append("🔄 Difference in ID ").append(key).append(", Field: ").append(field).append("\n");
                differences.append("   ➤ Source 1: ").append(value1).append("\n");
                differences.append("   ➤ Source 2: ").append(value2).append("\n");
            }
        }

        for (String field : obj2.keySet()) {
            if (!obj1.has(field)) {
                differences.append("🔹 Field missing in Source 1 for ID ").append(key).append(": ").append(field).append("\n");
            }
        }

        return differences.toString();
    }

    private static JSONArray sortJsonArray(JSONArray jsonArray) {
        List<JSONObject> jsonList = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            jsonList.add(jsonArray.getJSONObject(i));
        }

        jsonList.sort(Comparator.comparing(o -> o.toString()));

        return new JSONArray(jsonList);
    }


    public static String getJsonType(String str) {
        if (str == null || str.trim().isEmpty()) {
            return "INVALID_STRING";
        }

        str = str.trim();

        try {
            new JSONObject(str);
            return "JSON_OBJECT";
        } catch (JSONException e) {
            try {
                new JSONArray(str);
                return "JSON_ARRAY";
            } catch (JSONException ex) {
                return "NORMAL_STRING";
            }
        }
    }
}
