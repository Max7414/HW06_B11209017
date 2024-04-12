package HRSystem;

import java.util.ArrayList;

public class Database {
	 private ArrayList<GeneralStaff> staffList = new ArrayList<>();
	 public void addArray(GeneralStaff generalStaff)
	 {
		 staffList.add(generalStaff);
		 System.out.print(staffList.get(0));
	 }
}

