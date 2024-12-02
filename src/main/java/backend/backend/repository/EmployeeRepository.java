package backend.backend.repository;

import backend.backend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    boolean existsByEmployeeId(String employeeId);
    boolean existsByEmail(String email);
}
