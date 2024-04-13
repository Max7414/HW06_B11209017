package HRSystem;

public class GeneralStaff {
	private String name;
	private int password;


	private String workNumber ;


	private int departmentChoice;

	GeneralStaff(String name, int password, int departmentChoice, String workNumber){
		this.setName(name);
		this.setPassword(password);
		this.setDepartmentChoice(departmentChoice);
		this.setWorkNumber(workNumber);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
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
