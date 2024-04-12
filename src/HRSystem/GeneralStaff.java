package HRSystem;

public class GeneralStaff {
	private String name;
	private int password;
	private int departmentChoice;
	GeneralStaff(String name, int password, int departmentChoice){
		this.setName(name);
		this.setPassword(password);
		this.setDepartmentChoice(departmentChoice);
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
	
}
