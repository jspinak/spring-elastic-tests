package brobot.elasticsearch.tests;

import org.springbootcourse.service.EmployeeServiceImpl;
import org.springframework.stereotype.Component;

@Component
public class LoadLib {
    private final EmployeeServiceImpl testClass;

    public LoadLib(EmployeeServiceImpl testClass) {
        this.testClass = testClass;
    }

    public void doStuff() {
        testClass.getAllEmployees();
    }
}
