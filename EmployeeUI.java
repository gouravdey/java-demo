import java.util.Scanner;

public class EmployeeUI {
    public static void main(String[] args) {
        int f=1, z;
        EmployeeMid empMid = new EmployeeMid();
        empMid.launchDemo();

        System.out.println("1.Show all employees");
        System.out.println("2.Add new employee");
        System.out.println("3.Update an employee");
        System.out.println("4.Delete an employee");
        System.out.println("5.Exit");
        while (f==1) {
            System.out.println("Select the action...");
            Scanner sc = new Scanner(System.in);
            z = sc.nextInt();
            switch (z) {
                case 1:
                    System.out.println("Showing all employees...");
                    empMid.showEmp();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Adding new employee...");
                    System.out.print("Enter ID: ");
                    int newId = sc.nextInt();sc.nextLine();
                    System.out.print("Enter Name: ");
                    String newName = sc.nextLine();
                    System.out.print("Enter Designation: ");
                    String newDesignation = sc.nextLine();

                    EmployeeData newEmp = new EmployeeData(newId, newName, newDesignation);
                    empMid.addEmp(newEmp);
                    break;
                case 3:
                    System.out.println("Updating an employee...");
                    System.out.print("Enter ID: ");
                    int updateId = sc.nextInt();
                    System.out.println("1. Update Name");
                    System.out.println("2. Update Designation");
                    int updateOption = sc.nextInt();sc.nextLine();
                    String updateString;
                    if(updateOption==1) {
                        System.out.print("Enter Name: ");
                        updateString = sc.nextLine();
                        empMid.upEmp(updateId, updateOption, updateString);
                    } else if (updateOption==2) {
                        System.out.print("Enter Designation: ");
                        updateString = sc.nextLine();
                        empMid.upEmp(updateId, updateOption, updateString);
                    } else {
                        System.out.println("Enter correct value.");
                    }
                    break;
                case 4:
                    System.out.println("Deleting an employee...");
                    System.out.print("Enter the ID: ");
                    int delId = sc.nextInt();
                    empMid.delEmp(delId);
                    break;
                case 5:
                    f=0;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        }
    }
}
