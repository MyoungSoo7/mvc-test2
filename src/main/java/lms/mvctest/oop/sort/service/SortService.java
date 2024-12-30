package lms.mvctest.oop.sort.service;

import lms.mvctest.oop.sort.logic.Sort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SortService {

    private final Sort<String> sort;

    public SortService(@Qualifier("bubbleSort") Sort<String> sort) {
        this.sort = sort;
    }

    public List<String> sort(List<String> list) {
        return sort.sort(list);
    }
}
