import java.sql.Date;

public class Employee {
    static int id=1000;
    int employeeId ;
    String name  ;
    String department;
    String role;
    String dateofJoining;
    int pendingLeave;
    int salary;

    public Employee(String name,String department,String role,String dateofJoining)
    {
        this.employeeId = id++;
        this.name =name;
        this.department = department;
        this.role = role;
        this.dateofJoining = dateofJoining;
        this.pendingLeave = 0;
        this.salary = Integer.MIN_VALUE;
    }

    
}
