package lms.mvctest.oop.hr.domain;

public interface EmployRepository {
    void createEmployee(Employee employee);

    Employee findByNo(String no);
}
