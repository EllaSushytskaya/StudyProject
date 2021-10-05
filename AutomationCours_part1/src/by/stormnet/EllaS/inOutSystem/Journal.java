package by.stormnet.EllaS.inOutSystem;

import java.io.Serializable;
import java.util.ArrayList;

public class Journal implements Serializable {
	private ArrayList<Employee> list;
	private int countSize;
	private int factEmployee;

	public Journal(int countSize) {
		this.countSize = countSize;
		list = new ArrayList<>(countSize);
	}
	public int getFactEmployee() {
		return factEmployee;
	}

	public void addEmployee(Employee employee) {
		this.list.add(employee);
	}

	public void NumberOfEmployee(int countSize, int factEmployee) {
		this.factEmployee = factEmployee;
		this.countSize = countSize;
	}

	public void compare() throws ExceededNumberOfEmployeeException {
		if (factEmployee > countSize) {
			throw new ExceededNumberOfEmployeeException("Превышено максимальное колличесвто сотрудников. Максимальное количество сотрудников:" + countSize);
		}
	}

	void registerSomeWorkers(Employee[] employees) {
		for (int i = 0; i < employees.length; i++) {
		}
	}

	void registerWorker(Employee employee) {

	}


}









































