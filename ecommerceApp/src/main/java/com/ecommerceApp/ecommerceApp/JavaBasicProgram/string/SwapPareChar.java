package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import org.apache.tomcat.util.buf.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapPareChar {
    public static void main(String[] args) {
//        System.out.println(new SwapPareChar().soumoSwap("Soumo"));
//        System.out.println(new SwapPareChar().swapUsingStringBuffer("GeeksForGeeks"));
//
//        //String s1 = "[{\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\": 1, \"description\": \"\", \"rawValue\": \"2\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfeDisposition\"}, \"claimUnderlyingSubsystemReturnCodeClaimId\": null, \"claimEditsClaimId\": \"6264\", \"claimEdits\": [{\"processedValues\": [\"25\"], \"occurrence\": 1, \"description\": \"Invalid ICD version qualifier; claim ignored, no event output\", \"rawValue\": \"25\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"22\"], \"occurrence\": 1, \"description\": \"Invalid discharge date; claim ignored, no event output\", \"rawValue\": \"22\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"28\"], \"occurrence\": 1, \"description\": \"Claim not within patient eligibility date range; claim ignored, no event output\", \"rawValue\": \"28\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"23\"], \"occurrence\": 1, \"description\": \"Invalid line item date; line item ignored\", \"rawValue\": \"23\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"24\"], \"occurrence\": 1, \"description\": \"All line items invalid or missing; all line items ignored, no event output\", \"rawValue\": \"24\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}], \"claimItemEdits\": [{\"processedValues\": [\"001:23\"], \"occurrence\": 1, \"description\": \"Invalid line item date; line item ignored\", \"rawValue\": \"001:23\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimItemEditsPfe\"}], \"claimUnderlyingSubsystemReturnCode\": []}, {\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\": 2, \"description\": \"\", \"rawValue\": \"2\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfeDisposition\"}, \"claimUnderlyingSubsystemReturnCodeClaimId\": null, \"claimEditsClaimId\": \"6240\", \"claimEdits\": [{\"processedValues\": [\"25\"], \"occurrence\": 2, \"description\": \"Invalid ICD version qualifier; claim ignored, no event output\", \"rawValue\": \"25\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}], \"claimItemEdits\": [], \"claimUnderlyingSubsystemReturnCode\": []}]";
//        String s1 = "[{\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\"";
//        //String s2 = "[{\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\": 1, \"description\": \"\", \"rawValue\": \"2\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfeDisposition\"}, \"claimUnderlyingSubsystemReturnCodeClaimId\": null, \"claimEditsClaimId\": \"6240\", \"claimEdits\": [{\"processedValues\": [\"25\"], \"occurrence\": 1, \"description\": \"Invalid ICD version qualifier; claim ignored, no event output\", \"rawValue\": \"25\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}], \"claimItemEdits\": [], \"claimUnderlyingSubsystemReturnCode\": []}, {\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\": 2, \"description\": \"\", \"rawValue\": \"2\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfeDisposition\"}, \"claimUnderlyingSubsystemReturnCodeClaimId\": null, \"claimEditsClaimId\": \"6264\", \"claimEdits\": [{\"processedValues\": [\"25\"], \"occurrence\": 2, \"description\": \"Invalid ICD version qualifier; claim ignored, no event output\", \"rawValue\": \"25\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"22\"], \"occurrence\": 2, \"description\": \"Invalid discharge date; claim ignored, no event output\", \"rawValue\": \"22\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"28\"], \"occurrence\": 2, \"description\": \"Claim not within patient eligibility date range; claim ignored, no event output\", \"rawValue\": \"28\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"23\"], \"occurrence\": 2, \"description\": \"Invalid line item date; line item ignored\", \"rawValue\": \"23\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}, {\"processedValues\": [\"24\"], \"occurrence\": 2, \"description\": \"All line items invalid or missing; all line items ignored, no event output\", \"rawValue\": \"24\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimEditsPfe\"}], \"claimItemEdits\": [{\"processedValues\": [\"001:23\"], \"occurrence\": 2, \"description\": \"Invalid line item date; line item ignored\", \"rawValue\": \"001:23\", \"returnCode\": 0, \"grouperOutputApiName\": \"ClaimItemEditsPfe\"}], \"claimUnderlyingSubsystemReturnCode\": []}]";
//        String s2 = "[{\"claimEditsDisposition\": {\"processedValues\": [\"2\"], \"occurrence\"";
//        // Example of a large string (you can replace this with your actual string)
//        String largeString = sortString(s1);
//        String largeString1 = sortString(s2);
//        System.out.println(largeString1.equals(largeString));
//        System.out.println("\n \n \n");


//        String s3 = StringUtils.join( new String[] {
//                Util.s1
//        } );
//        String s4 = StringUtils.join( new String[] {
//                Util.s2
//        } );
        String s3 = Util.s1
                .replace("\\","");
        String s4 = Util.s2
                .replace("\\","");
        JSONArray ja1 = new JSONArray(s3);
        System.out.println(ja1);
        System.out.println(s4);


    }

    private static String sortString(String s1){
        // Example of a large string (you can replace this with your actual string)
        String largeString = s1;

        // Convert the string to a character array
        char[] charArray = largeString.toCharArray();

        // Sort the character array
        Arrays.sort(charArray);

        // Convert the sorted array back to a string
        String sortedString = new String(charArray);

        // Print the sorted string (can be very large depending on input)
        return sortedString;
    }

    //GeeksForGeeks
//eGkeFsroeGkes
    //Java
    //vaja
    public String swapPare(String s) {
        char[] charArr = s.toCharArray();
        char lastChar = 0;
        if (charArr.length % 2 != 0) {
            lastChar = charArr[charArr.length - 1];
            charArr = new char[charArr.length - 1];
        }
        System.out.println(charArr);
        for (int i = 0; i < charArr.length; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[i + 1];
            System.out.println(temp);
            charArr[i + 1] = temp;
            ++i;
        }
        if (lastChar != 0) {
            charArr = new char[charArr.length + 1];
            charArr[charArr.length - 1] = lastChar;
        }
        return new String(charArr);
    }

    public String soumoSwap(String s) {
        if (s == null)
            return s;
        char[] charArr = s.toCharArray();
        for (int i = 0; i < charArr.length - 1; i = i + 2) {
            System.out.println(i);
            char temp = charArr[i];
            charArr[i] = charArr[i + 1];
            charArr[i + 1] = temp;
        }
        return String.valueOf(charArr);
    }

    public String swapUsingStringBuffer(String s) {
        if (s == null || s.isEmpty())
            return s;
        StringBuffer sb = new StringBuffer();
        int length = s.length();

        for (int i = 0; i < length - 1; i += 2) {
            sb.append(s.charAt(i + 1));
            sb.append(s.charAt(i));
        }

        if (length % 2 != 0) {
            sb.append(s.charAt(length - 1));
        }
        return sb.toString();
    }

}
