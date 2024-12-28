package lms.mvctest.oop.sort;

import lms.mvctest.oop.sort.logic.JavaSort;
import lms.mvctest.oop.sort.logic.Sort;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();
        System.out.println(sort.sort(Arrays.asList(args)));
    }
}
