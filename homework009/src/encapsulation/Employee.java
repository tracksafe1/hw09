package encapsulation;

public class Employee {
    private int employee_id;
    private String employee_name;
    private int employee_salary;

    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employeeId) {
        this.employee_id = employeeId;
    }

    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employeeName) {
        this.employee_name = employeeName;
    }

          public String getFormattedSalary(int employee_salary) {
             return String.format("Employee Salary: £%d", employee_salary);
         }
    }
