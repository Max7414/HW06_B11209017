package HRSystem;
import java.util.Scanner;

public class CompanySystem {

	public static void main(String[] args) {
		
		int userChoice;
		int itNumber = 0,hrNumber = 0,maNumber = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("****歡迎進入公司系統****");
		System.out.println("1) 登入");
		System.out.println("2) 註冊");
		System.out.println("0) 離開");
		System.out.println("請輸入您的選擇 [1,2,0]: ");
		
		userChoice = sc.nextInt();
		switch(userChoice){
		case 1:
			System.out.println("請輸入工號");
			String checkNumber = sc.nextLine();
			System.out.println("輸入密碼");
			
			break;
		case 2:
			System.out.println("請輸入姓名");
			String name = sc.next();
			System.out.println("請輸入密碼");
			int password = sc.nextInt();
			
			System.out.println("1) 資訊部門");
			System.out.println("2) 人力資源");
			System.out.println("3) 行銷部門");
			System.out.println("請選擇部門:");
			
			int departmentChoice = sc.nextInt();
			while (departmentChoice < 1 || departmentChoice > 3) {
				switch(departmentChoice) {
				case 1:
					itNumber++;
					break;
				case 2:
					hrNumber++;
					break;
				case 3:
					maNumber++;
					break;
				}
					
				continue;
			}
			System.out.println("是否成為管理人員? [Y/n]");
			
			boolean isManager;
			while(true)
			{
				String select = sc.nextLine().trim(); 
				if(select.equalsIgnoreCase("y"))
				{
					isManager = true;
                    break;
				}
				else if (select.equalsIgnoreCase("n")) 
				{
					isManager = false;
					break;
				}
				else 
					continue;
			}
			Database database = new Database();
			GeneralStaff generalStaff;
			ManagerStaff managerStaff;
			

			if(isManager == false)
			{
				generalStaff = new GeneralStaff(name, password, departmentChoice);
				database.addArray(generalStaff);
			}
			else
			{
				managerStaff  = new ManagerStaff(name, password, departmentChoice, isManager);
				database.addArray(managerStaff);
			}
			break;
		case 0:
			break;
		
		
		
		}
		

	}

}
