import java.util.ArrayList;
import java.util.*;

public class EmployeeMid {

    List<EmployeeData> empList = new ArrayList<>();

    void launchDemo() {
        EmployeeData e1 = new EmployeeData(1, "A", "Manager");
        EmployeeData e2 = new EmployeeData(2, "B", "Developer");
        EmployeeData e3 = new EmployeeData(3, "C", "Tester");

        empList.add(e1);
        empList.add(e2);
        empList.add(e3);
    }

    void showEmp() {
        for(EmployeeData e : empList) {
            System.out.println(e.getId()+" "+e.getName()+" "+e.getDesignation());
        }
    }

    void addEmp(EmployeeData newEmp) {
        empList.add(newEmp);
        System.out.println("Employee added.");
    }
    void upEmp(int upId, int upOption, String upString) {
        for (EmployeeData e : empList) {
            if(upId==e.getId()){
                if(upOption==1){
                    e.setName(upString);
                } else {
                    e.setDesignation(upString);
                }
            }
        }
        System.out.println("Employee updated.");
    }
    void delEmp(int delId) {
        for (int i=0; i<empList.size(); i++){
            if (empList.get(i).getId()==delId){
                empList.remove(i);
                break;
            }
        }
        System.out.println("Employee deleted.");
    }
}
