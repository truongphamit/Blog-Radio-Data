package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String URL = "http://blogradio.vn/blog-radio/287?p=";

    public static void main(String[] args) {
        try {
            List<String> urls = getURL(1);
            for(String s : urls) {
                getBlog(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> getURL(int page) throws IOException {
        List<String> urls = new ArrayList<>();
        Document doc = Jsoup.connect(URL + page).get();
        Elements eles = doc.select("div.row");
        Element element = eles.get(2);
        Elements rows = element.children();
        for (Element row : rows) {
            Element new_image = row.select("div.new_image").first();
            if (new_image == null) {
                continue;
            }
            Element herf = new_image.select("a").first();
            urls.add("http://blogradio.vn" + herf.attr("href"));
        }
        return urls;
    }

    public static Blog getBlog(String url) throws IOException {
        Blog blog = new Blog();
        Document doc = Jsoup.connect(url).get();
        Element name = doc.select("h1.name").first();
        blog.setId(Integer.parseInt(getIdFromTitle(name.text())));
        blog.setTitle(name.text());

        Element brd_date = doc.select("span.brd-date").first();
        blog.setDay_add(brd_date.text());

        Element comment = doc.select("span.icon-comment").first();
        blog.setCount_cmt(Integer.parseInt(comment.text()));


        return blog;
    }

    public static String getIdFromTitle(String title) {
        String s[] = title.split(":");
        return s[0].substring(11, s[0].length());
    }
}
