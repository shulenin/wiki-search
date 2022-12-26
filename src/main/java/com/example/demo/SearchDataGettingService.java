package com.example.demo;

import java.util.Scanner;

public class SearchDataGettingService 
{
    public String getSearchData()
    {
        String searchData;
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ");
        System.out.print("Enter request: ");
        searchData = scanner.nextLine();

        return searchData;
    }
}
