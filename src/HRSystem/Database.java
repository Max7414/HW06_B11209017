package HRSystem;

import java.util.ArrayList;

public class Database {

	private final ArrayList<GeneralStaff> staffList = new ArrayList<>();
	public ArrayList<GeneralStaff> getStaffList() {
		return staffList;
	}

	public void addArray(GeneralStaff generalStaff) {
		 staffList.add(generalStaff);
		 System.out.println(staffList.size());
	}



}

