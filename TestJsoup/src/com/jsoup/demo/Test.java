package com.jsoup.demo;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		
				String url = "https://y.qq.com/";
				Connection connect = Jsoup.connect(url);
				Document html = connect.post();
				System.out.println(html);
				
		
		
		
		

	}
}
