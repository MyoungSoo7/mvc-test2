package lms.mvctest.oop.hr.service;


import lms.mvctest.oop.hr.domain.EmployRepository;
import lms.mvctest.oop.hr.service.dto.EmployeeCreateRequest;

public class EmployeeCommandService {
    private final EmployRepository employRepository;

    public EmployeeCommandService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public void add(EmployeeCreateRequest createRequest) {
        employRepository.createEmployee(createRequest.toDomain());
    }
}
