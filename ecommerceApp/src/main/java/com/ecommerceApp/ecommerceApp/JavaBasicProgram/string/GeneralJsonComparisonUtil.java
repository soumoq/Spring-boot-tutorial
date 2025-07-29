package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import org.json.JSONObject;

import java.util.*;

public class GeneralJsonComparisonUtil {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    // Main comparison method
    public static String compareJsons(String json1, String json2) throws Exception {
        JsonNode node1 = objectMapper.readTree(json1);
        JsonNode node2 = objectMapper.readTree(json2);

        return compareJsonNodes(node1, node2, "");
    }

    // Recursively compares two JsonNodes and generates the difference report
    private static String compareJsonNodes(JsonNode node1, JsonNode node2, String path) {
        StringBuilder report = new StringBuilder();

        // If both nodes are objects (JSON objects)
        if (node1.isObject() && node2.isObject()) {
            Iterator<Map.Entry<String, JsonNode>> fields1 = node1.fields();
            Iterator<Map.Entry<String, JsonNode>> fields2 = node2.fields();

            // Loop through fields and compare each key-value pair
            while (fields1.hasNext() || fields2.hasNext()) {
                Map.Entry<String, JsonNode> entry1 = fields1.hasNext() ? fields1.next() : null;
                Map.Entry<String, JsonNode> entry2 = fields2.hasNext() ? fields2.next() : null;

                // If keys are different or one key is missing
                if (entry1 == null || entry2 == null || !entry1.getKey().equals(entry2.getKey())) {
                    report.append(path).append(" - Key mismatch: ")
                            .append(entry1 != null ? entry1.getKey() : "N/A")
                            .append(" vs ")
                            .append(entry2 != null ? entry2.getKey() : "N/A")
                            .append("\n");
                } else {
                    // Recurse to compare values of matching keys
                    report.append(compareJsonNodes(entry1.getValue(), entry2.getValue(), path + "." + entry1.getKey()));
                }
            }
        }
        // If both nodes are arrays (JSON arrays)
        else if (node1.isArray() && node2.isArray()) {
            // Compare arrays without considering order
            if (!compareUnorderedArrays(node1, node2)) {
                report.append(path).append(" - Array mismatch: Arrays have different elements\n");
            }
        }
        // Compare primitive values
        else if (!node1.equals(node2)) {
            report.append(path).append(" - Value mismatch: ")
                    .append(node1.asText()).append(" vs ").append(node2.asText()).append("\n");
        }

        return report.toString();
    }

    // Compare two JSON arrays without considering order
    private static boolean compareUnorderedArrays(JsonNode array1, JsonNode array2) {
        if (array1.size() != array2.size()) {
            return false;
        }

        List<JsonNode> list1 = new ArrayList<>();
        List<JsonNode> list2 = new ArrayList<>();

        array1.forEach(list1::add);
        array2.forEach(list2::add);

        // Sort both arrays by string representation (so order doesn't matter)
        list1.sort(Comparator.comparing(JsonNode::toString));
        list2.sort(Comparator.comparing(JsonNode::toString));

        // Compare sorted arrays
        return list1.equals(list2);
    }

    public static void main(String[] args) throws Exception {

        String s1 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]";
        String s2 = "[{\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"3\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/3\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}, {\\\"supportingFacts\\\": [{\\\"supportingFactId\\\": \\\"1\\\", \\\"type\\\": \\\"SERVICELINE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}, {\\\"supportingFactId\\\": \\\"0\\\", \\\"type\\\": \\\"MDC_TYPE\\\", \\\"entityId\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059\\\", \\\"entityUid\\\": null}], \\\"id\\\": \\\"/partition:28aa6494-fc39-431a-91fe-ed920ca91744/person:4608972,std:claim_670059/1\\\", \\\"admitType\\\": \\\"5\\\", \\\"recordType\\\": \\\"UNKNOWN\\\", \\\"facilityType\\\": \\\"F\\\", \\\"facilityProfessionalLinkId\\\": null, \\\"standardPlace\\\": \\\"32\\\", \\\"standardGroup\\\": \\\"2\\\", \\\"procedureGroup\\\": \\\"372\\\", \\\"standardProvider\\\": \\\"0\\\", \\\"serviceSubCategory\\\": \\\"10655\\\", \\\"erObservationFlag\\\": null, \\\"admissionId\\\": null}]";
        new JSONObject(s1);
        // Example JSONs for comparison
        String json1 = s1;
        String json2 = s2;

        // Perform the comparison
        String comparisonReport = compareJsons(json1, json2);

        // Print the comparison result
        if (comparisonReport.isEmpty()) {
            System.out.println("The JSONs are equal.");
        } else {
            System.out.println(comparisonReport);
        }
    }


}