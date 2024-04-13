package HRSystem;

import java.util.ArrayList;

public class MemberService {
    private final Database database;
    MemberService(Database database){
        this.database = database;
    }
    public void generalStaffLogin(String showName, int departmentc, String workNumber)
    {
        String[] department = {"IT", "HR", "MA"};
        System.out.println("姓名:"+showName);
        System.out.println("部門:"+department[departmentc-1]);
        System.out.println("工號:"+workNumber);
    }
    public void managerStaffLogin(String showName, int departmentc, String workNumber, int size)
    {
        //debug
        System.out.println("show size="+database.getStaffList().size());
        System.out.println(size);
        String[] department = {"IT", "HR", "MA"};
        System.out.println("LIST=" + database.getStaffList());
        System.out.println("姓名:"+showName);
        System.out.println("部門:"+department[departmentc-1]);
        System.out.println("工號:"+workNumber);
        System.out.printf("%s 部門名單:%n",department[departmentc]);
        for(int i=0;i<size;i++)
        {
            if(database.getStaffList().get(i).getDepartmentChoice() == departmentc)
            {
                if(database.getStaffList().get(i).isManager())
                    System.out.println("主管:"+showName);
                else
                    System.out.println("一般員工:"+database.getStaffList().get(i).getName());
            }
        }
    }



}
