public class EmployeeApp extends Employee {
    private String Employee;
    private String name = "bob";
    private String pps = "12345678911";
    private String employementType = "part time";
    public EmployeeApp(){

    }

    public EmployeeApp(String employee) {
        Employee = employee;
    }

    public EmployeeApp(String name, String pps, String employmentType, String employee) {
        super(name, pps, employmentType);
        Employee = employee;
    }

    @Override
    public String toString() {
        return "EmployeeApp{" +
                "Employee='" + Employee + '\'' +
                ", name='" + name + '\'' +
                ", pps='" + pps + '\'' +
                ", employementType='" + employementType + '\'' +
                '}';
    }
}
