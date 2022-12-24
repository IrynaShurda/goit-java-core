package com.goit.module7;

public class GooSearchResultTest {
    public static void main(String[] args) {
        //test.com
        System.out.println(new GooSearchResult("https://test.com").parseDomain());

        //apple.in.mars
        System.out.println(new GooSearchResult("http://apple.in.mars").parseDomain());
        System.out.println(new GooSearchResult("https://rock.festival.com/?q=nearest").parseDomain());
    }
}

class GooSearchResult {
    private final String url;

    public String getUrl() {
        return url;
    }

    public GooSearchResult(String url) {
        this.url = url;
    }

    public String parseDomain() {
        int index1 = getUrl().lastIndexOf("//");
        String result1 = getUrl().substring(index1 + 2, getUrl().length());
        if (result1.contains("/")) {
            int index2 = getUrl().indexOf("/", index1 + 2);
            return getUrl().substring(index1 + 2, index2);
        }
        return result1;
    }
}
