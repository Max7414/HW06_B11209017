package HRSystem;

public class ManagerStaff extends GeneralStaff {
	private boolean isManager;
	ManagerStaff(String name, String password, int departmentChoice, boolean isManager, String workNumber)
	{
		super(name, password , departmentChoice, isManager, workNumber);
	}
	 
}
