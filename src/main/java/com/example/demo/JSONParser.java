package com.example.demo;

import org.json.JSONArray;
import org.json.JSONObject;

public class JSONParser
{
    public void parse(String json)
    {
        int num = 1;

        JSONObject obj = new JSONObject(json);
        JSONArray sroffset = obj.getJSONObject("query").getJSONArray("search");

        System.out.println(" ");
        System.out.println("___ВАШ РЕЗУЛЬТАТ___");

        for (int i = 0; i < sroffset.length(); i++) {
            String title = sroffset.getJSONObject(i).getString("title");
            String timestamp = sroffset.getJSONObject(i).getString("timestamp");

            System.out.println(num + ". " + title + " (" + timestamp + ")");
            ++num;
        }
    }
}
