package com.mycompany.app;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	try {
			HttpResponse<JsonNode> jsonResponse = 
					Unirest.get("https://pokeapi.co/api/v2/pokemon/ditto/")
					  .header("accept", "application/json")
					  .asJson();
			System.out.println( jsonResponse.getHeaders() );
		} catch (UnirestException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
