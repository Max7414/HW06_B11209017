package HRSystem;

public class MemberService {
    Database database = new Database();
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
       // System.out.println(database.getStaffList().get(0).getDepartmentChoice());
        System.out.println("姓名:"+showName);
        System.out.println("部門:"+department[departmentc-1]);
        System.out.println("工號:"+workNumber);
        System.out.printf("%s 部門名單:",department[departmentc]);
        for(int i=0;i<database.getStaffList().size();i++)
        {
            if(database.getStaffList().get(i).getDepartmentChoice() == departmentc)
            {
                if(database.getStaffList().get(i).isManager())
                    System.out.println("主管:"+showName);
                else
                    System.out.println("一般員工:"+showName);
            }
        }
    }

}
