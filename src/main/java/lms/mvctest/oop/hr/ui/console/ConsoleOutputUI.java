package lms.mvctest.oop.hr.ui.console;

import lms.mvctest.oop.hr.service.dto.EmployeeCreatedResponse;

public class ConsoleOutputUI {

    public static void printResult(EmployeeCreatedResponse response) {
        System.out.println("조회 결과: " + response);
    }
}
