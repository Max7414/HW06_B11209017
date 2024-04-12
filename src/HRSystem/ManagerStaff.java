package HRSystem;

public class ManagerStaff extends GeneralStaff {
	private boolean isManager;
	ManagerStaff(String name, int password, int departmentChoice, boolean isManager)
	{
		super(name, password , departmentChoice);
		this.isManager = true;
	}
	 
}
