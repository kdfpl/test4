import org.example.Employee;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class Bai3 {
    private List<Employee> empList;

    @BeforeEach
    void setUp() {
        empList = new ArrayList<>();
    }

    @Test
    void testAddEmployee() {
        Employee emp = new Employee(1, "John", "Doe", "john@example.com");
        empList.add(emp);
        assertThat(empList).hasSize(1);
    }

    @Test
    void testUpdateEmployee() {
        Employee emp = new Employee(1, "John", "Doe", "john@example.com");
        empList.add(emp);
        emp.setEmail("john.doe@company.com");
        assertThat(empList.get(0).getEmail()).isEqualTo("john.doe@company.com");
    }

    @Test
    void testDeleteEmployee() {
        Employee emp = new Employee(1, "John", "Doe", "john@example.com");
        empList.add(emp);
        empList.remove(0);
        assertThat(empList).isEmpty();
    }
}
