package by.stormnet.EllaS.inOutSystem;

import java.util.ArrayList;

public class Office<T extends Employee> {
	private ArrayList<T> listOfEmployee;

	public void Office(ArrayList<T> listOfEmployee) {
		this.listOfEmployee = listOfEmployee;
	}


	public void enterToOffice(Employee employee) {
		for (Employee employee1 : listOfEmployee) {
			if (employee1.getName().equals(employee.getName()) &&
					employee1.getLastName().equals(employee.getLastName())) {
				employee1.setStatus(Status.IN_OFFICE);
				return;
			}
		}
	}

	public void leaveOffice(Employee employee) {
		if (listOfEmployee.contains(employee)) {
			listOfEmployee.remove(employee);
			employee.setStatus(Status.OUT_OF_OFFICE);
			System.out.println("Сотрудник покинул офис");
		} else {
			System.out.println("Новый пользователь зарегестирован");
		}
	}


}




