package HRSystem;

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
    public void managerStaffLogin(String showName, int departmentc, String workNumber)
    {
        String[] department = {"IT", "HR", "MA"};
        generalStaffLogin(showName,departmentc,workNumber);
        System.out.printf("%s 部門名單:%n",department[departmentc-1]);
        for(GeneralStaff generalStaff : database.getStaffList())
        {
            if(generalStaff.getDepartmentChoice() == departmentc)
            {
                if(generalStaff.isManager())
                    System.out.println("主管:"+generalStaff.getName());
                else
                    System.out.println("一般員工:"+generalStaff.getName());
            }
        }
    }



}
