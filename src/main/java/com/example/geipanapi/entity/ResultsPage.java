package com.example.geipanapi.entity;

public class ResultsPage {

    private int page;
    private int totalPage;
    private long totalData;
    private Object results;

    public ResultsPage(int page, int totalPage, long totalData, Object results) {
        this.page = page;
        this.totalPage = totalPage;
        this.totalData = totalData;
        this.results = results;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }

    public long getTotalData() {
        return totalData;
    }

    public void setTotalData(long totalData) {
        this.totalData = totalData;
    }

    public Object getResults() {
        return results;
    }

    public void setResults(Object results) {
        this.results = results;
    }
}
