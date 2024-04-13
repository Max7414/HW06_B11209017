package HRSystem;
import java.util.Objects;
import java.util.Scanner;

public class CompanySystem {

	public static void main(String[] args) {
		int itNumber = 0, hrNumber = 0, maNumber = 0;
		int itManagerNumber = 0, hrManagerNumber = 0, maManagerNumber = 0;
		Database database = new Database();
		MemberService memberService = new MemberService();

		while(true) {
			int userChoice;

			String workNumber = "";
			Scanner sc = new Scanner(System.in);



			System.out.println("****歡迎進入公司系統****");
			System.out.println("1) 登入");
			System.out.println("2) 註冊");
			System.out.println("0) 離開");
			System.out.println("請輸入您的選擇 [1,2,0]: ");

			userChoice = sc.nextInt();
			sc.nextLine();
			switch(userChoice){
			case 1:
				System.out.println(database.getStaffList());
				System.out.println("請輸入工號");
				String checkNumber = sc.nextLine().trim();
				System.out.println("輸入密碼");
				int checkPassWord = sc.nextInt();

				for(int i = 0; i<database.getStaffList().size(); i++){
					if(Objects.equals(database.getStaffList().get(i).getWorkNumber(), checkNumber))
					{
						if(checkPassWord == database.getStaffList().get(i).getPassword()) {
							memberService.generalStaffLogin(database.getStaffList().get(i).getName(), database.getStaffList().get(i).getDepartmentChoice(), database.getStaffList().get(i).getWorkNumber());
							break;
						}
						else {
							System.out.println("密碼錯誤");
						}
					}
					else{
						System.out.println("查無此員工");
					}
				}

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

				String[] departmant = {"IT-", "HR-", "MA-"};

				int departmentChoice = sc.nextInt();
				sc.nextLine();

				while (departmentChoice < 1 || departmentChoice > 3) {
					System.out.println("無效的選擇，請重新選擇部門:");
					departmentChoice = sc.nextInt();
					sc.nextLine(); // Consume the newline left by nextInt()
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

				switch(departmentChoice) {
					case 1:

						if(!isManager) {
                            itNumber++;
							workNumber = String.format("%s%05d", departmant[departmentChoice - 1], itNumber);
						}
						else {
							itManagerNumber++;
							workNumber = String.format("%s1%04d", departmant[departmentChoice - 1], itManagerNumber);
						}

						break;
					case 2:
						if(!isManager){
							hrNumber++;
							workNumber = String.format("%s%05d",departmant[departmentChoice-1], hrNumber);
						}
						else {
							hrManagerNumber++;
							workNumber = String.format("%s1%04d", departmant[departmentChoice - 1], hrManagerNumber);
						}
						break;
					case 3:

						if(!isManager) {
							maNumber++;
							workNumber = String.format("%s%05d", departmant[departmentChoice - 1], maNumber);
						}
						else {
							maManagerNumber++;
							workNumber = String.format("%s1%04d", departmant[departmentChoice - 1], maManagerNumber);
						}
						break;
					default:
						System.out.println("無效選擇");
				}

				GeneralStaff generalStaff;
				ManagerStaff managerStaff;


				if(!isManager)
				{
					generalStaff = new GeneralStaff(name, password, departmentChoice, workNumber);
					database.addArray(generalStaff);
				}
				else
				{
					managerStaff  = new ManagerStaff(name, password, departmentChoice, isManager, workNumber);
					database.addArray(managerStaff);
				}

				break;
			case 0:
				System.exit(0);
				break;
			}

		System.out.println(workNumber);

		}


	}

}




