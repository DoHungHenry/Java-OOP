package lesson_06.less_06_lab;

import java.util.Arrays;

public class Lesson06_lab04 {

    public static void main(String[] args) {

        String http = "http";
        String https = "https";
        String domainCom = ".com";
        String domainNet = ".net";

        String url = "https://google.com";
        String urlProtocol = getUrlProtocol(url);
        String urlDomain = getUrlDomain(url);

        if (urlProtocol.equals(https)){
            System.out.println("Url Protocol is " + urlProtocol);
        } else if (urlProtocol.equals(http)) {
            System.out.println("Url Protocol is " + urlProtocol);
        } else {
            System.out.println("Url Protocol is neither http nor https");
        }

        if (urlDomain.equals(domainCom)){
            System.out.println("Url Domain is " + domainCom);
        } else if (urlDomain.equals(domainNet)) {
            System.out.println("Url Domain is " + domainNet);
        } else {
            System.out.println("Url Domain is neither .com nor .net");
        }
    }

    private static String getUrlProtocol(String url) {
        int index = url.indexOf("://");
        return url.substring(0, index);
    }

    private static String getUrlDomain(String url){
        int index = url.length() - 4;
        return url.substring(index);
    }
}
