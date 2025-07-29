package com.ecommerceApp.ecommerceApp.JavaBasicProgram.string;

import java.io.*;
import java.net.*;
import java.util.*;

public class GetHttpProd {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        try {
            //472
            Scanner sc = new Scanner(System.in);
            System.out.println("Please provide the client mnemonic for validate BUSINESS_OBJECTS endpoint : ");
            String name = sc.next();
            System.out.println("Please provide the total result count : ");
            String totalCount = sc.next();
            String urlString = "https://" + name +
            //        ".api.us-1.healtheintent.com/business-intelligence/v1/reports?biType=BUSINESS_OBJECTS&lite=false&limit=20&offset=";
                    ".api.oci.healtheintent.com/business-intelligence/v1/data-models?associatedEntities=true&limit=20&offset=";
            //"https://metastore-service.us-1-zone12.healtheintent.net/metastore-service/outputs?complete=true&active=true&scope_id=1424e81d-8cea-4d6b-b140-d6630b684a58&name=hi_v2_programprocessing_ProgramsBatchOutputEntityType_CLAIM";
            String oAuth = "Bearer eyJhbGciOiJub25lIn0.eyJpc3MiOiJodHRwczpcL1wvYXV0aG9yaXphdGlvbi5jZXJuZXIuY29tXC8iLCJpYXQiOjE2MDIyMjUyNzEsInVybjpjZXJuZXI6YXV0aG9yaXphdGlvbjpzeXN0ZW0tYWNjb3VudC1jcmVkZW50aWFsLXRva2VuOnZlcnNpb246MSI6eyJ2ZXIiOiIxLjAiLCJzZWNyZXQiOiJnQUFvTlktM2RCUmZodVd4Rk1ackdvTDZVdmFOc3g0ZCIsImtleSI6ImRjYTRkYzE1LTdlYTgtNGEwZi1iMWIwLTc2YjM0ZGM4MTE2ZCJ9LCJqdGkiOiJjN2U2MWFmMC1jYTFlLTRhMDAtYjJjZS03NWY2OGYyOTNiZDkifQ.";
            // Create a URL object
            for (int i = 0; i < Integer.parseInt(totalCount); i = i + 20) {
                URL url = new URL(urlString + i);
                // Open a connection
                HttpURLConnection connection = (HttpURLConnection) url.openConnection();

                // Set the request method
                connection.setRequestMethod("GET");

                // Set timeouts
                connection.setConnectTimeout(60000);
                connection.setReadTimeout(60000);

                // Set headers
                connection.setRequestProperty("Authorization", oAuth);
                connection.setRequestProperty("Content-Type", "application/json");
                connection.setRequestProperty("Accept", "application/json");

                // Connect and get the response code
                int responseCode;
                try {
                    responseCode = connection.getResponseCode();
                } catch (SocketTimeoutException ee) {
                    System.out.println("URL is not working : " + url + "\n The exception message is :" + ee.getMessage());
                    continue;
                }

                // Check the response code
                if (responseCode == HttpURLConnection.HTTP_OK) {
                    // Read the response
                    BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String inputLine;
                    StringBuilder content = new StringBuilder();
                    while ((inputLine = in.readLine()) != null) {
                        content.append(inputLine);
                    }
                    System.out.println("Working url: " + url);

                    // Close the streams
                    in.close();
                } else {
                    System.out.println("response code : " + responseCode + " NOT working url is: " + url);
                    continue;
                }

                // Disconnect the connection
                connection.disconnect();
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}