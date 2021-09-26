package by.stormnet.EllaS.inOutSystem;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public abstract class Employee {

	protected final String name;
	protected final String lastName;
	protected Status status;
	protected IDcard idCard;


	public Employee(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
		this.status = Status.OUT_OF_OFFICE;

	}


	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public IDcard getIdCard() {
		return idCard;
	}

	public void setIdCard(IDcard idCard) {
		this.idCard = idCard;
	}

	@Override
	public boolean equals(Object obj) {
		Employee employee = (Employee) obj;
		if (name == employee.name||lastName == employee.lastName)
			return Status.IN_OFFICE.equals(hashCode());
		return Status.OUT_OF_OFFICE.equals(hashCode());
	}
}













