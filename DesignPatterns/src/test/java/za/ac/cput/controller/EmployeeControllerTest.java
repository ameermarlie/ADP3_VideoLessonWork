package za.ac.cput.controller;

import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import za.ac.cput.domain.Employee;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.MethodName.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeeControllerTest {
    @Autowired
    private TestRestTemplate restTemplate;
    private final String Base_URL = "http://localhost:8080/payroll/employee";
    private static Employee employee;

    @BeforeAll
    public static void setUp() {
        employee = new EmployeeFactory().buildEmployee("222124474","Ben","Dover");
    }

    @Test
    void a_create(){
        String url = Base_URL + "/create";
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(url, employee, Employee.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
//        assertEquals(postResponse.getStatusCode(), HttpStatus.OK);
        Employee employeeSaved= postResponse.getBody();
        assertEquals(employee.getEmployeeNumber(),employeeSaved.getEmployeeNumber());
        System.out.println("Saved data: "+employeeSaved);
    }
    @Test
    void b_read(){
        String url = Base_URL + "/read/"+employee.getEmployeeNumber();
        System.out.println("URL: "+url);
        ResponseEntity<Employee> response = restTemplate.getForEntity(url, Employee.class);
        assertEquals(employee.getEmployeeNumber(),response.getBody().getEmployeeNumber());
        System.out.println("Read data: "+response.getBody());
    }
    @Test
    void c_update(){
        String url = Base_URL + "/update";
        Employee newEmployee = new Employee.Builder().copy(employee)
                .setFirstName("Sen").build();
        ResponseEntity<Employee> postResponse = restTemplate.postForEntity(url, newEmployee, Employee.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        //assertEquals(postResponse.getStatusCode(),HttpStatus.OK);
        Employee employeeUpdated= postResponse.getBody();
        assertEquals(newEmployee.getEmployeeNumber(),employeeUpdated.getEmployeeNumber());
        System.out.println("Updated data: "+employeeUpdated);
    }
    @Test
    void d_delete(){
        String url = Base_URL + "/deleteById"+employee.getEmployeeNumber();
        System.out.println("URL: "+url);
        restTemplate.delete(url);
        System.out.println("Success: Deleted employee");
    }
    @Test
    void e_getAll(){
        String url = Base_URL + "/getAll";
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity=new HttpEntity<>(null,headers);
        ResponseEntity<String> response=restTemplate.exchange(url, HttpMethod.GET,entity,String.class);
        System.out.println("Show ALL:");
        System.out.println(response);
        System.out.println(response.getBody());
    }


}