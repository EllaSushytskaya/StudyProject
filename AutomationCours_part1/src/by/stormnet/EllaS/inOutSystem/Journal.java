package by.stormnet.EllaS.inOutSystem;


import java.util.ArrayList;

public class Journal {
	private ArrayList<Employee> listOfEmployee;
	private int maxNumberOfPlace;
	private int factNumberEmployee;

	public Journal(int maxNumberOfPlace) {
		this.maxNumberOfPlace = maxNumberOfPlace;
		listOfEmployee = new ArrayList<>(maxNumberOfPlace);
	}

	public int getFactEmployee() {
		return factNumberEmployee;
	}

	public void addEmployee(Employee employee) {
		this.listOfEmployee.add(employee);
	}

	public void NumberOfEmployee(int maxNumberOfPlace, int factNumberEmployee) {
		this.factNumberEmployee = factNumberEmployee;
		this.maxNumberOfPlace = maxNumberOfPlace;
	}

	public void compare() throws ExceededNumberOfEmployeeException {
		if (factNumberEmployee > maxNumberOfPlace) {
			throw new ExceededNumberOfEmployeeException("Превышено максимальное колличесвто сотрудников. Максимальное количество сотрудников:" + maxNumberOfPlace);
		}
	}


	public void registerEmployee(Employee employee) {
		for (int i=0; i<listOfEmployee.size(); i++) {
			if (listOfEmployee.contains(employee)) {
				System.out.println("Сотрудник уже зарегестрирован");
			} else {
				employee.getIdCard();
				listOfEmployee.add(employee);
				System.out.println("Новый сотрудник зарегестирован");
			}
		}

	}
}














































