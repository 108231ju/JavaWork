package com.lec.java.crawl03;

import org.jsoup.Jsoup;

import java.io.IOException;

import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Crawl03Main {

	public static void main(String[] args) throws IOException {
		System.out.println("Daum 실시간 검색어");
		
		//TODO
		//www.daum.net
		//15개
		
		String url;
		Response response;
		Document doc;
		Element element;
		
		url = "https://www.daum.net";
		response = Jsoup.connect(url).execute();
		doc =response.parse();

		Elements search_elements = doc.select("div.slide_favorsch ul.list_favorsch li a");
		System.out.println(search_elements.size() + "개");
		
		for (Element e : search_elements) {
			System.out.println(e.text().trim());
			System.out.println(e.attr("href").trim());
		}
	}

}
