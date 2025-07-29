package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;
import org.json.JSONArray;
import org.json.JSONObject;

public class JsonComparator {


    private static boolean compareJson(Object obj1, Object obj2) {
        // If both are JSONObjects
        if (obj1 instanceof JSONObject && obj2 instanceof JSONObject) {
            return compareJsonObjects((JSONObject) obj1, (JSONObject) obj2);
        }

        // If both are JSONArrays
        if (obj1 instanceof JSONArray && obj2 instanceof JSONArray) {
            return compareJsonArrays((JSONArray) obj1, (JSONArray) obj2);
        }

        // If both are plain objects (String, Integer, etc.)
        return obj1.equals(obj2);
    }

    private static boolean compareJsonObjects(JSONObject json1, JSONObject json2) {
        // If JSONObjects don't have the same number of keys, they're not equal
        if (json1.length() != json2.length()) {
            return false;
        }

        // Check if each key in json1 matches in json2
        for (String key : json1.keySet()) {
            if (!json2.has(key)) {
                return false; // If json2 doesn't have the same key
            }
            // Recursively compare values
            if (!compareJson(json1.get(key), json2.get(key))) {
                return false;
            }
        }
        return true;
    }

    private static boolean compareJsonArrays(JSONArray array1, JSONArray array2) {
        // If the arrays are not the same length, they are not equal
        if (array1.length() != array2.length()) {
            return false;
        }

        // To compare unordered arrays, we sort them first and compare elements
        for (int i = 0; i < array1.length(); i++) {
            boolean matchFound = false;
            for (int j = 0; j < array2.length(); j++) {
                if (compareJson(array1.get(i), array2.get(j))) {
                    matchFound = true;
                    break;
                }
            }
            if (!matchFound) {
                return false; // If no match was found for an element
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Sample JSON objects for testing
        String s1 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"5\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/5\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"379\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"40155\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"2\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/2\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"4\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/4\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]";
        String s2 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"4\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/4\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"2\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/2\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"OUTPATIENT\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"133\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"21299\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"5\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:2821959,std:claim_434026/5\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"P\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"22\\\", \\\"standardGroup\\\": \\\"4\\\", \\\"procedureGroup\\\": \\\"379\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"40155\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]";

        //String s3 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]".replace("\\","");
        //String s4 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]".replace("\\","");

        System.out.println(s1);
        System.out.println(s2);
        JSONObject a1 = new JSONObject();
        JSONObject a2 = new JSONObject();
        JSONArray ja1 = new JSONArray(s1);
        JSONArray ja2 = new JSONArray(s2);
        a1.put("Name", ja1);
        a2.put("Name", ja2);
//        String jsonString1 = s1;
//        String jsonString2 = s2;

        JSONObject json1 = a1;
        JSONObject json2 = a2;

        boolean isEqual = compareJsonObjects(json1, json2);
        System.out.println("The JSON objects are equal: " + isEqual);
    }
}