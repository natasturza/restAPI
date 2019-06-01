package com.mycompany.app;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class App 
{
    public static void main( String[] args )
    {
    try {
    HttpResponse<JsonNode> jsonResponse =
    Unirest.get("http://localhost:8080/openidm/managed/user/?_queryId=query-all-ids")
    .header("X-OpenIDM-Username", "openidm-admin")
    .header("X-OpenIDM-Password", "openidm-admin")
    .asJson();
	System.out.println( jsonResponse.getBody() );
	} catch (UnirestException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
    }
}
