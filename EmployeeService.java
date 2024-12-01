import java.util.Scanner;

public class EmployeeService {

    public static void addEmployeeDetails(Employee emp)
    {
        if(emp.department.toLowerCase().equals("sales"))
        {
             if(emp.role.toLowerCase().equals("manager"))
             {
                emp.salary = 60000;
                emp.pendingLeave = 12;
             }
             else if(emp.role.toLowerCase().equals("associate"))
             {
                emp.salary = 45000;
                emp.pendingLeave = 15;
             }
        }
       else if(emp.department.toLowerCase().equals("developer"))
        {
             if(emp.role.toLowerCase().equals("manager"))
             {
                emp.salary = 80000;
                emp.pendingLeave = 20;
             }
             else if(emp.role.toLowerCase().equals("associate"))
             {
                emp.salary = 65000;
                emp.pendingLeave = 25;
             }
        }
        else if(emp.department.toLowerCase().equals("tester"))
        {
             if(emp.role.toLowerCase().equals("manager"))
             {
                emp.salary = 50000;
                emp.pendingLeave = 20;
             }
             else if(emp.role.toLowerCase().equals("associate"))
             {
                emp.salary = 35000;
                emp.pendingLeave = 25;
             }
        }
        else 
        {
             if(emp.role.toLowerCase().equals("manager"))
             {
                emp.salary = 40000;
                emp.pendingLeave = 20;
             }
             else if(emp.role.toLowerCase().equals("associate"))
             {
                emp.salary = 25000;
                emp.pendingLeave = 25;
             }
        }

    EmployeeDetails.employeeMapping.put(emp.employeeId,emp);
    System.out.println("Employee Added Succesully");

    }
    public static void allEmployeeList(){
        if(EmployeeDetails.employeeMapping.size()==0)
        {
            System.out.println("No Employee details available ");
            return;
        }
        for(Employee emp :EmployeeDetails.employeeMapping.values())
        {
            System.out.println("Employee name: " + emp.name);
            System.out.println("EmployeeId: " + emp.employeeId);
            System.out.println("Department: " + emp.department + "Role : "+ emp.role);
            System.out.println("Salary: " + emp.salary);
            System.out.println("<------------------------------------>");
        }
    }

    
    public static void serachbyDepartment(String dept)
    {
        if(EmployeeDetails.employeeMapping.size()==0)
        {
            System.out.println("Employees Not found ");
        }
        boolean isFlag = false;
        for(Employee emp :EmployeeDetails.employeeMapping.values())
        {
            if(emp.department.toLowerCase().equals(dept))
            {
                isFlag = true;
            System.out.println("Employee name: " + emp.name);
            System.out.println("EmployeeId: " + emp.employeeId);
            System.out.println("Department: " + emp.department + "Role : "+ emp.role);
            System.out.println("Salary: " + emp.salary);
            System.out.println("<------------------------------------>");
            }
        }
        if(!isFlag){
            System.out.println(dept +"Employees Not found ");
        }
    }
    public static void removeEmployee(int empId)
    {
        if(!EmployeeDetails.employeeMapping.containsKey(empId))
        {
            System.out.println("Employee not found");
            return;
        }
        else{
            EmployeeDetails.employeeMapping.remove(empId);
            System.out.println("Employee successfully removed");
        }
    }

    public static void updateEmployeeDetails(int empId,Scanner userInput){
        if(!EmployeeDetails.employeeMapping.containsKey(empId))
        {
            System.out.println("Employee not found");
            return;
        }
        else{
            Employee emp = EmployeeDetails.employeeMapping.get(empId);
            System.out.println("Employee name :" + emp.name +" \nChange Department \nChange Role \n Change Salary \n Change Leave count");
            String dept = userInput.next();
            String role = userInput.next();
            int salary = userInput.nextInt();
            int pendingLeave = userInput.nextInt();
            if(!dept.isEmpty())
            {
                emp.department = dept;
            }
            else if(!role.isEmpty()){
                emp.role = role;
            }
            else if(salary!=0){
                emp.salary = salary;
            }
            else if(pendingLeave!=0){
                emp.pendingLeave = pendingLeave;
            }

        }
    }
    
}
