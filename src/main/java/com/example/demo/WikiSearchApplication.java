package com.example.demo;

import com.example.demo.services.GetRequestSendingService;
import com.example.demo.services.JSONParser;
import com.example.demo.services.SearchDataGettingService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;

@SpringBootApplication
public class WikiSearchApplication
{
	private static final String url = "https://ru.wikipedia.org/w/api.php?action=query&list=search&utf8=&format=json&srsearch=";

	public static void main(String[] args) throws IOException, InterruptedException
	{
		SearchDataGettingService searchDataGettingService = new SearchDataGettingService();
		String searchData = searchDataGettingService.getSearchData();

		GetRequestSendingService getRequestSendingService = new GetRequestSendingService();
		String response = getRequestSendingService.sendGetRequest(url + searchData);

		JSONParser jsonParser = new JSONParser();
		jsonParser.parse(response);
	}
}
