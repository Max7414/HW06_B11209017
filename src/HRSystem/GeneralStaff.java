package HRSystem;

public class GeneralStaff {
	private String name;
	private String password;

	public boolean isManager() {
		return isManager;
	}

	public void setManager(boolean manager) {
		isManager = manager;
	}

	private boolean isManager;
	private String workNumber ;


	private int departmentChoice;

	GeneralStaff(String name, String password, int departmentChoice,boolean isManager, String workNumber){
		this.setName(name);
		this.setPassword(password);
		this.setDepartmentChoice(departmentChoice);
		this.setWorkNumber(workNumber);
		this.setManager(isManager);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDepartmentChoice() {
		return departmentChoice;
	}
	public void setDepartmentChoice(int departmentChoice) {
		this.departmentChoice = departmentChoice;
	}
	public String getWorkNumber() {
		return workNumber;
	}

	public void setWorkNumber(String workNumber) {
		this.workNumber = workNumber;
	}

}
