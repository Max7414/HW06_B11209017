package HRSystem;

public class ManagerStaff extends GeneralStaff {
	private boolean isManager;
	ManagerStaff(String name, int password, int departmentChoice, boolean isManager, String workNumber)
	{
		super(name, password , departmentChoice, workNumber);
		this.isManager = true;
	}
	 
}
