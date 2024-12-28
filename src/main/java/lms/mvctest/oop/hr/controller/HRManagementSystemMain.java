package lms.mvctest.oop.hr.controller;

import lms.mvctest.oop.hr.ui.console.ConsoleOutputUI;
import lms.mvctest.oop.hr.infra.InMemoryEmployRepository;
import lms.mvctest.oop.hr.service.EmployeeCommandService;
import lms.mvctest.oop.hr.service.EmployeeQueryService;
import lms.mvctest.oop.hr.service.dto.EmployeeCreateRequest;
import lms.mvctest.oop.hr.service.dto.EmployeeCreatedResponse;
import lms.mvctest.oop.hr.ui.console.ConsoleInputUI;

public class HRManagementSystemMain {
    private static final InMemoryEmployRepository repository = new InMemoryEmployRepository();
    private static final EmployeeCommandService commandService = new EmployeeCommandService(repository);
    private static final EmployeeQueryService queryService = new EmployeeQueryService(repository);

    public static void main(String[] args) {
        String name = ConsoleInputUI.enterName();
        String no = ConsoleInputUI.enterNo();
        String ssn = ConsoleInputUI.socialSecurityNumber();

        commandService.add(new EmployeeCreateRequest(no, name, ssn));
        EmployeeCreatedResponse response = queryService.findByNo(no);

        ConsoleOutputUI.printResult(response);
    }
}
