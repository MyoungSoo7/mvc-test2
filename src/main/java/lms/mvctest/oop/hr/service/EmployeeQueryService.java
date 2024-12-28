package lms.mvctest.oop.hr.service;


import lms.mvctest.oop.hr.domain.EmployRepository;
import lms.mvctest.oop.hr.service.dto.EmployeeCreatedResponse;

public class EmployeeQueryService {
    private final EmployRepository employRepository;

    public EmployeeQueryService(EmployRepository employRepository) {
        this.employRepository = employRepository;
    }

    public EmployeeCreatedResponse findByNo(String no) {
        return EmployeeCreatedResponse.of(employRepository.findByNo(no));
    }
}
