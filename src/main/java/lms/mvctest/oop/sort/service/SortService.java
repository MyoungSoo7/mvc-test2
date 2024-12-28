package lms.mvctest.oop.sort.service;

import lms.mvctest.oop.sort.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> sort(List<String> list) {
        return sort.sort(list);
    }
}
