package com.rupebac.utils;

public class UrlTester {
    private static void showHelp() {
        System.out.println("usage: <UrlTester> [testUrl] [pattern]");
    }

    public static void main(String[] args) {
        if(args.length < 2) {
            showHelp();
            return;
        }

        String testUrl = args[0];
        String pattern = args[1];

        AntPathMatcher matcher = new AntPathMatcher();
        boolean antMatches = matcher.match(pattern, testUrl);
        System.out.println(antMatches ? "Ant pattern -> MATCHES" : "Ant pattern -> NOT matching");

        ServletUrlFilterMatcher servletMatcher = new ServletUrlFilterMatcher();
        boolean servletMatches = servletMatcher.matches(pattern, testUrl);
        System.out.println(servletMatches ? "Servlet url pattern -> MATCHES" : "Servlet url pattern -> NOT matching");

    }
}
