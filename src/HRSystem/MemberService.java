package HRSystem;

public class MemberService {
    Database database = new Database();
    public void generalStaffLogin(String showName, int department, String workNumber)
    {
        System.out.println("姓名:"+showName);
        System.out.println("部門:"+department);
        System.out.println("工號:"+workNumber);
    }
    public void managerStaffLogin(String showName, int department, String workNumber)
    {
        System.out.println(database.getStaffList().get(0).getDepartmentChoice());
        System.out.println("姓名:"+showName);
        System.out.println("部門:"+department);
        System.out.println("工號:"+workNumber);
        String[] departmant = {"IT", "HR", "MA"};
        System.out.printf("%s 部門名單:",departmant[department]);
        for(int i=0;i<database.getStaffList().size();i++)
        {
            if(database.getStaffList().get(i).getDepartmentChoice() == department)
            {
                if(database.getStaffList().get(i).isManager())
                    System.out.println("主管:"+showName);
                else
                    System.out.println("一般員工:"+showName);
            }
        }
    }

}
