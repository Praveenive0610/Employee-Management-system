import java.util.Scanner;

public class EmployeeControllers{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        boolean loop = true;
        while(loop)
        {
            System.out.println("1.Add Enployee \n 2.View Employees \n 3.Update Employee Datails \n 4.Remove Employee \n 5.Exit");
            int value = userInput.nextInt();
            switch (value) {
                case 1:
                    {
                        System.out.println("1.Enter Employee name\n 2.Enter Department \n3.Enter Role \n4.Date of joining");
                        String name = userInput.next();
                        String dept = userInput.next();
                        String role = userInput.next();
                        String doj = userInput.next();
                        Employee emp = new Employee(name, dept, role, doj);
                        EmployeeService.addEmployeeDetails(emp);
                        break;
                    }    
                    case 2:{
                        System.out.println("Enter Department ");
                        String dept = userInput.next();
                        if(dept.toLowerCase().equals("all")){
                            System.out.println("Employee Lists");
                            EmployeeService.allEmployeeList();
                        }
                        else{
                            System.out.println(dept + " Employee lists");
                            EmployeeService.serachbyDepartment(dept);
                        }
                      
                        break;
                    }   
                    case 3:{
                        System.out.println("Enter Employee Id ");
                        int empId = userInput.nextInt();
                        EmployeeService.updateEmployeeDetails(empId,userInput);
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Enter Employee Id");
                        int empId = userInput.nextInt();
                         EmployeeService.removeEmployee(empId);
                        break;
                    }     
                   case 5:
                   {
                    loop =false;
                    break;
                   }
            }

        }
        

    }
}