package lms.mvctest.oop.sort.controller;


import lms.mvctest.oop.sort.service.SortService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final SortService sortService;

    public MainController(SortService sortService) {
        this.sortService = sortService;
    }

    @GetMapping("/")
    public String index(@RequestParam List<String> list) {
        return sortService.sort(list).toString();
    }

}
