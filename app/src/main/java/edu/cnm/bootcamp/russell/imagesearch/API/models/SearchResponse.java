package edu.cnm.bootcamp.russell.imagesearch.API.models;

import java.util.List;

/**
 * Created by russell on 2/1/18.
 */

public class SearchResponse {

    private class RequestData {
        private String title = null;
        private String totalResults = null;
        private int count = 0;
        private int startIndex = 0;
    }

    private class Item {
        private String link = null;
    }

    private RequestData request = null;
    private RequestData nextPage = null;
    private List<Item> items = null;
}
