package by.stormnet.EllaS.InOutSystem;

import by.stormnet.EllaS.InOutSystem.NumberOfEmployee.ExceededNumberOfEmployeeException;
import by.stormnet.EllaS.InOutSystem.NumberOfEmployee.NumberOfEmployee;

public class Main {
	public static void main(String[] args) throws ExceededNumberOfEmployeeException {
		NumberOfEmployee numberOfEmployee = new NumberOfEmployee();
		numberOfEmployee.compare();

	}

}
